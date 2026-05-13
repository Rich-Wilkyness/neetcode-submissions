class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val set = mutableSetOf<Int>()

        nums.forEach { num ->
            if (set.contains(num)) return true
            else set.add(num)
        }
        return false
    }
}
