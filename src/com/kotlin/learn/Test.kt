package com.kotlin.learn

import com.kotlin.learn.arrays.Lambdas
import com.kotlin.learn.princetoncourse.QuickFind

fun main(word: Array<String>){
    println("Hello ")
    var prob = Lambdas("Anuj")
    println(prob.getNum(4))
    var quick = QuickFind(5)
    println(quick.isConnected(2,3))
    quick.union(2,3)
    println(quick.isConnected(2,3))

}