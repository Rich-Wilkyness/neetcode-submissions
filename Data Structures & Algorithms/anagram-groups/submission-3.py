class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sortedAnagrams = {}

        for s in strs:
            sortedS = "".join(sorted(s))
            if sortedS in sortedAnagrams:
                sortedAnagrams[sortedS].append(s)
            else:
                sortedAnagrams[sortedS] = [s]

        return list(sortedAnagrams.values())
        