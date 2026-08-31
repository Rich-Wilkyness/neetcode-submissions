class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        val result = IntArray(nums.size)


        // think everything to the left of the index, everything to the right
        // pattern used for:
        // 1. except self
        // 2. everything to the left/right

        // can be used for:
        // 1. products
        // 2. sums
        // 3. min
        // 4. max
        // 5. string building

        // Running sum
        // var prefixSum = 0       // 0 + x == x
        // Running product
        // var prefixProduct = 1   // 1 * x == x
        // String building
        // var prefixText = ""     // "" + text == text


        // nums = [1, 2, 4, 6]
        var prefix = 1
        for (i in nums.indices) {
            // result = 1, 1, 2, 8
            result[i] = prefix
            // prefix = 1, 2, 8, NA
            prefix *= nums[i]
        }

        // result = [1, 1, 2, 8]
        var suffix = 1
        // reversed changes the i (order in which indexes are visited)
        // this means it starts from 3->0
        // meaning result and nums are both using index 3
        // it does not reverse nums
        for (i in nums.indices.reversed()) {
            // result in reverse = 8*1, 2*6, 1*24, 1*48
            // but remember this is flipped -> result = [48, 24, 12, 8]
            result[i] *= suffix
            // suffix = 6, 24, 48, NA
            suffix *= nums[i]
        }

        return result

        /* 
        // works, but not effiencent enough for large arrays 
        // O n^2
        // current index
        var i = 0
        var sum = 1 
        while (i < nums.size) {
            nums.forEachIndexed { index, num ->
                if (index != i) sum = sum * num
            }
            sums[i] = sum
            sum = 1
            i++
        }
        return sums
        */
    }
}
