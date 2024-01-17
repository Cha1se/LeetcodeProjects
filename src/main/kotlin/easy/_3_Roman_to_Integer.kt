package org.example.easy

class _3_Roman_to_Integer {
    fun romanToInt(s: String): Int {
        var result = 0

        for (i in s.indices) {
            val currValue = Roman.valueOf(s[i].toString()).value
            if (i + 1 != s.length) {
                val nextValue = Roman.valueOf(s[i+1].toString()).value
                if ( currValue < nextValue) {
                    result -= currValue
                } else {
                    result += currValue
                }
            } else {
                result += currValue
            }
        }
        return result
    }
}

enum class Roman(val value: Int) {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000)
}