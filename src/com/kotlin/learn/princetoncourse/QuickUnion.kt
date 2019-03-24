package com.kotlin.learn.princetoncourse

/**
 * https://www.coursera.org/learn/algorithms-part1/lecture/ZgecU/quick-union
 */
open class QuickUnion constructor(var len: Int) {

    var arr = IntArray(len);

    init {
        for (i in arr.indices) {
            arr[i] = i;
        }
    }

    /**
     * make two nodes part of same component
     */
    open fun union(p: Int, q: Int) {
        var i = arr[p]
        var k = arr[q]
        arr[i] = k
    }

    open fun isConnected(p: Int, q: Int): Boolean {
        return root(p) == root(q);
    }

   open fun root(p: Int): Int {
        var i = p;
        while (i != arr[i]) {
            i = arr[i];
        }
        return i;
    }

    open fun print(){
        println()
        for (i in arr){
            print("$i ")
        }
        println()
    }
}