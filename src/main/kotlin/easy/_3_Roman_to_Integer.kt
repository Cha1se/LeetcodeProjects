package org.example.easy

class _3_Roman_to_Integer {
    fun romanToInt(s: String): Int {
        var res = 0
        var isStreak = false
        for(ch in 0..s.lastIndex step 2) {
            var current = 0
            var next = 0
            if (ch == s.length) {
                res += Roman.valueOf(s[ch].toString()).value
                break
            } else {
                next = Roman.valueOf(s[ch+1].toString()).value
                current = Roman.valueOf(s[ch].toString()).value
            }

            if (current == next) {
                if (!isStreak) {
                    res += (next + current)
                    isStreak = true
                } else {
                    res += current
                    isStreak = false
                }
            } else if (current >= next) {
                res += (current + next)
                isStreak = false
            } else {
                res += (next - current)
                isStreak = false
            }

        }

        return res
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