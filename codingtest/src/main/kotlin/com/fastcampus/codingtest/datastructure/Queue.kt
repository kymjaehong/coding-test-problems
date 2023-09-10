package com.fastcampus.codingtest.datastructure

import java.util.LinkedList
import java.util.Queue

class Queue {
    /**
     * FIFO
     * enqueue: add(value), offer(value)
     * dequeue: poll(), remove()
     *
     * import LinkedList, Queue
     */
}

fun queueBefore() {
    val queueInt : Queue<Int> = LinkedList()
    val queueString : Queue<String> = LinkedList()

    queueInt.add(1)
    queueInt.add(2)
    println("queueInt: $queueInt")

    val poll = queueInt.poll()
    println("poll: $poll")
    println("queueInt: $queueInt")

    val remove = queueInt.remove()
    println("remove: $remove")
    println("queueInt: $queueInt")
}

fun queueAfter() {
    val queue = QueueImpl<Int>()
    val pollEqNull = queue.dequeue()
    println("poll: $pollEqNull")
    println("queue: ${queue.toString()}")

    queue.enqueue(1)
    queue.enqueue(2)
    println("queue: ${queue.toString()}")

    val poll = queue.dequeue()
    println("poll: $poll")
    println("queue: ${queue.toString()}")
}

fun main() {
    queueBefore()
    println("============================")
    queueAfter()
}

class QueueImpl<T>(
    private val queue: MutableList<T> = mutableListOf()
) {
    fun enqueue(t: T) {
        queue.add(t)
    }

    fun dequeue(): T? {
        val size = queue.size
        if (size == 0) {
          return null
        }
        val response = queue[0]
        queue.removeAt(0)
        return response
    }

    override fun toString(): String {
        return queue.toString()
    }
}