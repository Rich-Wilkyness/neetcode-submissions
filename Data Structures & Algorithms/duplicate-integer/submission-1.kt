class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        if (nums.isEmpty()) return false
        
        // set of each one seen
        val seen = mutableSetOf<Int>()

        nums.forEach { num ->
            if (seen.contains(num)) return true
            else seen.add(num)
        }
        return false
    }
}
