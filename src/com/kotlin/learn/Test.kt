package com.kotlin.learn

import com.kotlin.learn.arrays.Lambdas
import com.kotlin.learn.princetoncourse.QuickFind
import com.kotlin.learn.princetoncourse.QuickUnion
import com.kotlin.learn.princetoncourse.WeightedQuickUnion

fun main(word: Array<String>){
    println("Hello ")
    var prob = Lambdas("Anuj")
    println(prob.getNum(4))
    var quick = QuickFind(5)
    println(quick.isConnected(2,3))
    quick.union(2,3)
    println(quick.isConnected(2,3))
    //Quick Union
    println("union check")
    var union = WeightedQuickUnion(10);
    union.print()
    println(union.isConnected(3,4))
    union.union(3,4)
    union.union(2,3)
    union.union(4,6)
    union.union(8,4)
    println(union.isConnected(3,4))
    union.print()

}