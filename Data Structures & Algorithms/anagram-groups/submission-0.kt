class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        // create a map of the alphabetical sorted string as the key, and a list of strings as the values
        val myMap = mutableMapOf<String, MutableList<String>>()

        // iterate through each strs -> sort and check if it exists in the map
        strs.forEach { str -> 
        // can only sort chars in an array - so get there first
        // sort that by default sorts alphabetically
        // join to string converts the charArray back to a string
            val key = str.toCharArray().sorted().joinToString("")

        // Option 1: If/Else
            // if the map contains the sorted string
            if (myMap.containsKey(key)) {
                // add the string to the list of values at that key
                // we need to copy the values and then add the new value
                myMap[key]!!.add(str)
            } else myMap[key] = mutableListOf(str)

        // Option 2: getOrPut
            // map.getOrPut(key) { mutableListOf() }.add(str)
        }

        // return the list of lists by converting the map values to a list
        // we don't care to return the key
        return myMap.values.toList()
    }
}
