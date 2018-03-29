// Brute force
class Solution {
    fun longestPalindrome(s: String): String {
        var result: String = ""
        var maxlen: Int = 0
        // start point
        for(i in 0 until s.length) {
			// end point
            for(j in s.length downTo i) {
                var subs = s.substring(i, j)
                if(isPailndrome(subs) == true)
                {
                    if(subs.length >  maxlen) {
                        result = subs
                        maxlen = subs.length
                    }
                }
            }
        }

        return result
    }
    
    fun isPailndrome(s: String): Boolean {
        for(i in 0 until s.length/2) {
            if(s[i] != s[s.length-1-i]) {
                return false
            }
        }
        return true
    }
}
