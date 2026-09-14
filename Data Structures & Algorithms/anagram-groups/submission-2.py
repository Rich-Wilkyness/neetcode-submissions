class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        anagrams = {}

        for s in strs:
            key = tuple(sorted(s))

            if key in anagrams:
                anagrams[key].append(s)
            else:
                anagrams[key] = [s]

        return list(anagrams.values())
        
        # OR

        for s in strs:
            key = tuple(sorted(s))
            anagrams.setdefault(key, []).append(s)

        return list(anagrams.values())