class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0


// brute force
        val sortNums = nums.sorted()
        var maxSeq = 1
        var sequence = 1
        var previous = sortNums[0]

        sortNums.drop(1).forEach {

            when {
                previous == it -> {}
                previous == it - 1 -> sequence++
                else -> {
                    maxSeq = maxOf(maxSeq, sequence)
                    sequence = 1
                }
            }
            previous = it
        }
        if (sequence > maxSeq) maxSeq = sequence

        return maxSeq
    }
}
