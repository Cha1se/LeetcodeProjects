package org.example.easy

class _6_Merge_Two_Sorted_Lists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val res: ListNode? = list1
        res?.next = list2

        var current = res
        while (current?.`val` != null) {
            if (current.next?.`val` == null) {
                break
            } else if (current.`val` > current.next?.`val`!!) {
                var oldNextValue = current.next?.`val`!!
                val oldCurrentValue = current.`val`
                current.next?.`val` = oldCurrentValue
                current.`val` = oldNextValue
                current = res?.next
            } else {
                current = res?.next
            }
        }

        return  res

    }
}

class ListNode(var `val`: Int) {
     var next: ListNode? = null
}