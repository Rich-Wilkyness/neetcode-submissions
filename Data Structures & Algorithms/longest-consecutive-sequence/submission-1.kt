class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0


        val sortNums = nums.sorted()
        var maxSeq = 1
        var sequence = 1
        var current = sortNums[0]

        sortNums.drop(1).forEach {
            if (it-1 == current || it+1 == current) sequence++
            else if (it == current) 
            else {
                if (sequence > maxSeq) maxSeq = sequence
                sequence = 1
            }
            current = it
        }
        if (sequence > maxSeq) maxSeq = sequence

        return maxSeq
    }
}
