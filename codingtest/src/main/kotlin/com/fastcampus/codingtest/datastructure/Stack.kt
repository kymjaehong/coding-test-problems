package com.fastcampus.codingtest.datastructure

import java.util.Stack

class Stack {
    /**
     * LIFO
     * add: push(value)
     * remove: pop()
     *
     * 일반적으로, 최대 크기를 미리 지정하여 초기화해야 한다.
     *
     * import Stack
     */
}

fun stackBefore() {
    val stack = Stack<Int>()
    stack.push(1)
    stack.push(2)
    println("stack: $stack")

    val pop = stack.pop()
    println("pop: $pop")
    println("stack: $stack")

}

fun stackAfter() {
    val stack = StackImpl<Int>()
    val stackEqNull = stack.pop()
    println("pop: $stackEqNull")
    println("stack: ${stack.toString()}")

    stack.push(1)
    stack.push(2)
    println("stack: ${stack.toString()}")

    val pop = stack.pop()
    println("pop: $pop")
    println("stack: ${stack.toString()}")
}

fun main() {
    stackBefore()
    println("============================")
    stackAfter()
}

class StackImpl<T>(
    private val stack: MutableList<T> = mutableListOf()
) {
    fun push(t: T) {
        stack.add(t)
    }

    fun pop(): T? {
        val size = stack.size
        if (size == 0) {
            return null
        }

        val response = stack[size - 1]
        stack.removeAt(size - 1)
        return response
    }

    override fun toString(): String {
        return stack.toString()
    }
}