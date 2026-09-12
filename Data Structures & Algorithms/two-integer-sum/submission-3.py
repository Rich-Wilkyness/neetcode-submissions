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

        return []


        # or

        # key = diff
        # value = index of diff
        seen = {}
        # enumerate sets
        # i = index
        # c = value of nums
        for (i, c) in enumerate(nums):
            diff = target - c
            if diff in seen:
                return [seen[diff], i]
            seen[c] = i

        return []