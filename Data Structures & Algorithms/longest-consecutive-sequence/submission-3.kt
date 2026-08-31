class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        // use a set
        val numbers = nums.toHashSet()
        var sequence = 0

        numbers.forEach {
            if (it - 1 !in numbers) {
                var current = it
                var length = 1

                while (current + 1 in numbers) {
                    current++
                    length++
                }
                sequence = maxOf(sequence, length)
            }
        }
        return sequence
    }




/*
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
    */
}
