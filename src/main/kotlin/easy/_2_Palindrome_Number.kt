package org.example.easy

class _2_Palindrome_Number {
    fun isPalindrome(x: Int): Boolean {
        val numberCount = Math.ceil(Math.abs(x.toDouble()) / 2.0).toInt()
        val first = x.toString().take(numberCount)
        val second = x.toString().takeLast(numberCount).reversed()
        if (first.equals(second)) {
            return true
        } else {
            return false
        }
    }
}