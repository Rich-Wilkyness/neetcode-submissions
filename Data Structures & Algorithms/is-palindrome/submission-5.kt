class Solution {
    fun isPalindrome(s: String): Boolean {

        // first setup array with only alpha-numeric into Char Array we can compare values with
        // remove non-alpha numeric with Regex, can't remember regex expression for this or how to initialize it on our string
        val sArray = s
            .lowercase()
            .replace(Regex("[^a-z0-9]"), "") 
            // can use .filter { it.isLetterOrDigit() } as well
            // ^ means not like "!"
            // essentially saying, if not a letter or number -> replace with ""
            .toCharArray()

        // I guess empty mean it's a palindrome?
        if (sArray.isEmpty()) return true
        if (sArray.size == 1) return true

        // find half of length -> don't need to do full comparison
        // do + and - to compare head/tail values
        var start = 0
        var end = sArray.size - 1

        // s = "a" -> end = 1 - 1 = 0
        // while (0 <= 0/2 + 1) -> choose between "=" or "+ 1"
        
        while(start < end/2 + 2) {
            println(sArray[start])
            println(sArray[end])
            if (sArray[start] != sArray[end]) return false
            start++
            end--
        }
        return true
    }
}
