class Solution {
    fun reverse(x: Int): Int {
        var isMinus: Boolean = x < 0
        var result: Double = 0.0
        var numList: MutableList<Int> = mutableListOf()
        var origin = x
        if(isMinus) {
            if(x == Int.MIN_VALUE) {
                origin = Int.MAX_VALUE
            }
            else {
                origin = -1 * x
            }
        }

        while(origin / 10 > 0) {
            numList.add(origin % 10)
            origin /= 10
        }
        numList.add(origin)
        numList.reverse()

        for((index, value) in numList.withIndex()) {
            var newValue = value * Math.pow(10.toDouble(), index.toDouble())
            if(Int.MAX_VALUE - result < newValue.toInt()) {
                return 0
            }
            result += value * Math.pow(10.toDouble(), index.toDouble())
        }

        return if(isMinus) -1 * result.toInt() else result.toInt()
    }
}
