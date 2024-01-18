package org.example.easy

class _4_Longest_Common_Prefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        strs.sort()
        var firstStr = strs.first()
        var lastStr = strs.last()

        var match = 0
        while (match < firstStr.length && match < lastStr.length) {
            if (firstStr[match] == lastStr[match]) {
                match++
            } else {
                break
            }
        }

        return firstStr.substring(0, match)
    }
}