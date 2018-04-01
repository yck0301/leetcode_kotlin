class Solution {
    fun convert(s: String, numRows: Int): String {
        var result: String = ""
        var list: MutableList<MutableList<Char>> = mutableListOf()
        for(i in 0 until numRows) {
            list.add(mutableListOf())
        }

        var sparse: MutableList<Char> = mutableListOf()
        var col: Int = 0
        var count: Int = 0
        for(i in 0 until s.length) {
            col = count / numRows
            if(numRows == 1) {
                return s
            }
            else if(col % (numRows - 1) == 0) {
                sparse.add(s[i])
                count++
            }
            else {
                for(j in 0 until numRows) {
                    if(j == numRows-(col%(numRows-1))-1) {
                        sparse.add(s[i])
                    }
                    else {
                        sparse.add('\u0000')
                    }
                    count++
                }
            }
        }

        for(i in 0 until sparse.size) {
            val item = sparse.get(i)
            if(item != '\u0000') {
                list[i%numRows].add(item)
            }
        }

        for(i in 0 until numRows) {
            result += list[i].joinToString("")
        }

        return result
    }
}
