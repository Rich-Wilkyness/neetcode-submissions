class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        return s.toCharArray().sorted().toString() == t.toCharArray().sorted().toString()
    }
}
