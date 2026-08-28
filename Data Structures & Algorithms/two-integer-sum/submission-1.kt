class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        // map the number that will add to target with the index
        val compTarget = mutableMapOf<Int, Int>()

        nums.forEachIndexed { i, num -> 
            if (compTarget.containsKey(num)) {
                return intArrayOf(compTarget.getValue(num), i)
            }
            else {
                val comp = target - num
                compTarget[comp] = i
            }
        }
        return intArrayOf()
    }
}
