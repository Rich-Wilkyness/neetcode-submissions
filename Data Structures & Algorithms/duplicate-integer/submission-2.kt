class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        if (nums.isEmpty()) return false
        
        // set of each one seen
        val seen = mutableSetOf<Int>()

        nums.forEach {
            if (seen.contains(it)) return true
            else seen.add(it)
        }
        return false
    }
}
