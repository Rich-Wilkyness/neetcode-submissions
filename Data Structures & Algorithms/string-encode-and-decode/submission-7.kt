class Solution {

    // length#string
    // So "cat" becomes "3#cat" and "" becomes "0#".

    fun encode(strs: List<String>): String {

        // StringBuilder does what? 
        val encoded = StringBuilder()

        strs.forEach { 
            encoded.append(it.length)
            encoded.append("#")
            encoded.append(it)
        }

        // we need to make encoded a string because StringBuilder doesn't?
        return encoded.toString()
    }

    fun decode(str: String): List<String> {

        val strs = mutableListOf<String>()

        // ensure we don't go past the length of our string
        var index = 0

        while (index < str.length) {
            // find the first # starting from the index?
            val separatorIndex = str.indexOf("#", index)

            // get the number encoded between our current index and the 
            // index of the next #
            val length = str.substring(index, separatorIndex).toInt()

            // get the index right after the #
            val wordStart = separatorIndex + 1
            // get the index at the end using the length encoded
            val wordEnd = wordStart + length

            // now add each word to our list
            strs.add(str.substring(wordStart, wordEnd))
            // set the new index to the end of the most recent string
            // if it's the end, then the while loop will end
            // else it will find the next # starting from that index
            index = wordEnd
        }
        /*
        Faster, but same idea, find length, find starting index using #
        while (index < str.length) {
            var j = i
            // while the Char doesn't equal # -> find starting index and length
            while (str[j] != '#'') {
                j++
            }
            // now j index = "#"
            // use i and j to find length
            val length = str.substring(i, j).toInt()
            
            // using #, go forward one to the beginning of the str
            i = j + 1

            // add the string from the beginning of the str to the end using length
            strs.add(str.substring(i, i + length))

            // set i to the end of the str
            i += length
        }
        */
        return strs
    }
}
