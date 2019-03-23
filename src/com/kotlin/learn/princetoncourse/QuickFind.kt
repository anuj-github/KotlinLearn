package com.kotlin.learn.princetoncourse

/**
 * https://www.coursera.org/learn/algorithms-part1/lecture/EcF3P/quick-find
 */
class QuickFind constructor(private var len: Int) {

    var arr = IntArray(len)

    init {
        for (i in arr.indices) {
            arr[i] = i;
        }
    }

    fun isConnected(p: Int, q: Int): Boolean {
        return arr[p] == arr[q]
    }

    fun union(p: Int, q: Int): Unit {
        var pid = arr[p]
        var qid = arr[q];
        for (i in arr.indices) {
            if (arr[i] == pid) arr[i] = qid
        }
    }
}