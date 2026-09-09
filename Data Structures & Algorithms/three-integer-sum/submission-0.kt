class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        // 0 = a + b + c
        // a + b = -c

        nums.sort()
        val result = mutableListOf<List<Int>>()

        // using range 0 -> size-3
        // indices 0 1 2 3 4 5
        // a will go from 0 to and including 3
        // remember size is + 1 of index (starts at 1) 
        // 4 and 5 will be available for b and c
        // a in 0..nums.size - 3
        // use until instead -> emphasizes the exclusive upper bound and safely produces no iterations when the array has fewer than three elements
        // NOTE: until excludes the number on the right (nums.size-2), range is inclusive
        for (a in 0 until nums.size - 2) {
            // Avoid using the same first value more than 
            // this runs after the first round of a (a = 0), avoids a=0 -1 which is index out of bounds
            // then check if current value is same as last value -> skip if same
            if (a > 0 && nums[a] == nums[a - 1]) continue

            var b = a + 1
            var c = nums.lastIndex

            while (b < c) {
                val sum = nums[a] + nums[b] + nums[c]

                when {
                    sum < 0 -> b++
                    sum > 0 -> c--
                    else -> {
                        result.add(listOf(nums[a], nums[b], nums[c]))

                        // why are we uping b and reducing c here? if we end there could be a scenario where there is another valid value? it's not possible to keep a and b the same and get a different value for c, but if b and c are different than there is a possible answer
                        b++
                        c--

                        // Skip duplicate second and third values
                        // duplicates only matter after we have found a valid result, which is why we check them after a result has been found
                        while (b < c && nums[b] == nums[b - 1]) b++
                        while (b < c && nums[c] == nums[c + 1]) c--
                    }
                }
            }
        }

        return result
    }
}
