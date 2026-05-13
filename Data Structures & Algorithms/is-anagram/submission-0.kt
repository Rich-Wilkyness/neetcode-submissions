class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        var sortedS = s.toCharArray().sorted().toString()
        var sortedT = t.toCharArray().sorted().toString()

        if (sortedS == sortedT) return true else return false

    }
}
