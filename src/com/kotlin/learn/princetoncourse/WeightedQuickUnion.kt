package com.kotlin.learn.princetoncourse

/**
 * https://www.coursera.org/learn/algorithms-part1/lecture/RZW72/quick-union-improvements
 */
class WeightedQuickUnion constructor(var n: Int) : QuickUnion(n) {

    var size = IntArray(n)

    /**
     * make the smaller tree child of larger tree
     */
    override fun union(p: Int, q: Int) {
        var i = arr[p]
        var k = arr[q]
        if(i==k) return
        if (size[i] < size[k]) {
            arr[i] = k;
            size[k] += size[i]
        } else {
            arr[k] = i;
            size[i] += size[k]

        }
    }


    /**
     * path compression
     */
    override fun root(p: Int): Int {
        var i = p;
        while (i != arr[i]) {
            //for path compression to keep tree flat
            arr[i] = arr[arr[i]]
            i = arr[i];
        }
        return i;
    }
}