package org.example.easy

class _1_Two_Sum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0..nums.lastIndex) {
            for (j in 0..nums.lastIndex) {
                if (j == i) continue
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf()
    }
}