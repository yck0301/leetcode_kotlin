class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var srcArray = nums.copyOf()
        var resultArr: IntArray = IntArray(2)
        // sort source array
        nums.sort()
        for((idx_0, val_0) in nums.withIndex())
        {
            for((idx_1, val_1) in nums.withIndex())
            {
                if(idx_1 > idx_0)
                {
                    if(val_0 + val_1 == target)
                    {
                        // find out the index
                        var counter = 0
                        for((index, value) in srcArray.withIndex())
                        {
                            if(value == val_0 || value == val_1)
                            {
                                resultArr.set(counter, index)
                                counter++
                                if(counter == 2) {
                                    return resultArr
                                }
                            }
                        }
                    }
                }
            }
        }

        return resultArr
    }
}
