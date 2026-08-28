class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        // need a hashmap of anagram key (ordered letters) with the str
        val anagrams = mutableMapOf<String, List<String>>()

        strs.forEach {
            // order it
            val orderedAna = it.toCharArray()
                .sorted()
                .joinToString("")

            // check if it exists
            // add to existing or new
            if (anagrams.containsKey(orderedAna)) {
                val anaList = anagrams.getValue(orderedAna)
                anagrams[orderedAna] = anaList + it
            } else anagrams[orderedAna] = listOf(it)
        }
        return anagrams.values.toList()

    }
}
