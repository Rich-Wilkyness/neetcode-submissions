class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        sDic = {}

        for i in s:
            if i in sDic:
                sDic[i] += 1
            else:
                sDic[i] = 1

        for j in t:
            if j not in sDic:
                return False
            else:
                sDic[j] -= 1
                if sDic[j] == 0:
                    del sDic[j]

        return True
        