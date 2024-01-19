package org.example.easy

import jdk.internal.org.jline.utils.Colors
import jdk.vm.ci.code.Location.stack
import java.util.Stack


class _5_Valid_Parentheses {
    fun isValid(s: String): Boolean {
        var st: Stack<Char> = Stack()
        for (i in s) {
            if (i == '(' || i == '{' || i == '[') {
                st.push(i)
            } else {
                if (st.empty() || (st.peek() === '(' && i != ')') || (st.peek() === '{' && i != '}') || (st.peek() === '[' && i != ']')) {
                    return false
                } else {
                    st.pop()
                }
            }
        }
        return st.empty()

    }

}