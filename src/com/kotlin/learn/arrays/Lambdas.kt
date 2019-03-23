package com.kotlin.learn.arrays

class Lambdas constructor(var user: String){

    // lambda to find square of a num
    val square = {number:Int-> number*number}

    /**
     * return square of a  number
     */
    fun  getNum( num:Int):Int{
        return square(num);
    }
    init {
        this.user = user;
    }

}