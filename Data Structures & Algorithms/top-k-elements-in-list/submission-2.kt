class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

        // map each with the total appearances
        val frequency = mutableMapOf<Int, Int>()

        nums.forEach {
            if (frequency.containsKey(it)) {
                frequency[it] = frequency.getValue(it) + 1
            } else frequency[it] = 1
        }

        // if the array does not have k number of options

        // order the totals
        val topK = frequency
            .entries // gives each entry with .key and .value
            .sortedByDescending { it.value } // sort by value
            .take(k) // take top k
            .map { it.key } // keep only the key, not the value
            .toIntArray()

        return topK
    }
}
