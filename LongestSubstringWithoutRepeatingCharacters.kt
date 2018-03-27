class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isEmpty()) {
            return 0
        }
        var result: Int = 1
        for(i in 0 until s.length) {
            for(j in i+1 until s.length) {
                if(!s.substring(i, j).contains(s[j])) {
                    if(j-i+1 > result) {
                        result = j-i+1
                    }
                }
                else {
                    break
                }
            }
        }
        return result
    }
}
