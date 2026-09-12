class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        i = 0

        while i < len(nums) - 1: # might need - 2
            j = i + 1
            t = target - nums[i]
            while j < len(nums):
                if t == nums[j]:
                    return [i, j]
                j += 1
            i += 1

        return false