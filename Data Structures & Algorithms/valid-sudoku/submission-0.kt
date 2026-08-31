class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        // array 1 (outside) sets columns
        // array 2 (inside) sets rows
        // empty spaces are "."


        // trying faster
        // in one pass add map<row, array<value>>, map<col, array<value>>, map<sub-box, array<value>>
        // as we add, we check if 

        val rowMap = mutableMapOf<Int, MutableSet<Char>>()
        val colMap = mutableMapOf<Int, MutableSet<Char>>()
        val boxMap = mutableMapOf<Int, MutableSet<Char>>()
        
        for (rowIndex in board.indices) {
            for (colIndex in board[rowIndex].indices) {
                val boxIndex = (rowIndex / 3) * 3 + (colIndex / 3)
                val cell = board[rowIndex][colIndex]
                if (cell == '.') continue

                // need to check each map set
                // if we try to add a value that already exists to a set, it returns false?
                val rowAdded = rowMap
                    .getOrPut(rowIndex) { mutableSetOf() }
                    .add(cell)
                val colAdded = colMap
                    .getOrPut(colIndex) { mutableSetOf() }
                    .add(cell)
                val boxAdded = boxMap
                    .getOrPut(boxIndex) { mutableSetOf() }
                    .add(cell)

                // if any of these return false -> 
                if (!rowAdded || !colAdded || !boxAdded ) return false 

            }

        }

/*
        // blunt force O n^2
        // use Sets, all values must be unique
        var boardSet = mutableSetOf<Char>()

        // check rows (easiest)

        // check columns

        // check sub-boxes
        */
        return true
    }
}
