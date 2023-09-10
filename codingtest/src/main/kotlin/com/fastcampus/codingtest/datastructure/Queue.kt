package com.fastcampus.codingtest.datastructure

import java.util.LinkedList
import java.util.Queue

class Queue {
    /**
     * FIFO
     * enqueue: add(value), offer(value)
     * dequeue: poll(), remove()
     *
     * impot LinkedList, Queue
     */
}

fun mainBefore() {
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

fun mainAfter() {
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
    mainBefore()
    println("============================")
    mainAfter()
}

class QueueImpl<T>(
    private val queue: MutableList<T> = mutableListOf()
) {
    fun enqueue(t: T): MutableList<T> {
        queue.add(t)
        return queue
    }

    fun dequeue(): T? {
        val size = queue.size
        if (size == 0) {
          return null
        }
        val response = queue[size - 1]
        queue.removeAt(size - 1)
        return response
    }

    override fun toString(): String {
        return queue.toString()
    }
}