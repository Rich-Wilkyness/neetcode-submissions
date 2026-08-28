class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        // hash of how many of a letter there is
        val sMap = mutableMapOf<Char, Int>()

        
        s.forEach {
            // check if sMap contains it (letter)
            if (sMap.containsKey(it)) {
                sMap[it] = sMap.getValue(it) + 1
            }
            else sMap[it] = 1
        }

        t.forEach {
            if (sMap.containsKey(it)) {
                sMap[it] = sMap.getValue(it) - 1
                if (sMap[it] == 0) sMap.remove(it)
            } 
            else return false
        }
        return true
    }
}
