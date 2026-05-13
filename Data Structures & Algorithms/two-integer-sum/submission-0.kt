class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {


        val map = mutableMapOf<Int, Int>()

        nums.forEachIndexed { i, num ->

            // store the comp value
            var comp = target - num
            if (map.containsKey(comp)) {
                return intArrayOf(map[comp]!!, i)
            } else {
                map[num] = i
            }
        }
        return intArrayOf()

    }
}
