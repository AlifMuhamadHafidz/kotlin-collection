package com.example.kotlincollection

fun main(){

    //immutable collection
    //1. list
    var names = listOf("alif", "budi", "abdi")

    //access each element of immutable list

    for (i in names){
        println(i)
    }

    println(names[0])

    //2. Sets

    var colors = setOf("red", "green", "blue")

    //access each element of immutable sets

    for(i in colors){
        println(i)
    }

    //3. Maps
    var cars = mapOf("toyota" to 10, "honda" to 2, "nisan" to 1)

    var toyotaStock = cars["toyota"]

    println("toyota stock is " + toyotaStock)

    //mutable collect
    //1. List
    //can use mutablelistof or arraylistof

    val vegetables = mutableListOf("brocoli", "pokcoy", "water spinach", "spinach")

    //access each element of mutable list
    println("\nbefore")
    for (i in vegetables){
        println(i)
    }

    //adding element in mutable list
    vegetables.add("carrot")

    //remove element in mutable list
    vegetables.removeAt(1)

    //updating element in mutable list
    vegetables[0] = "egg plant"

    //access each element of mutable list after updated
    println("\nafter")
    for (i in vegetables){
        println(i)
    }

    //2. Sets

    val fruits = mutableSetOf("banana", "apple")

    //access each element of mutable list
    println("\nbefore")
    for (i in fruits){
        println(i)
    }

    //adding element in mutable list
    fruits.add("pineapple")
    fruits.add("melon")

    //remove element in mutable list
    fruits.remove("apple")

    //updating element in mutable list
    fruits.remove("banana")
    fruits.add("guava")

    //access each element of mutable list after updated
    println("\nafter")
    for (i in fruits){
        println(i)
    }

    //3. Maps

    val motorbikePrice = mutableMapOf("honda" to 1000, "suzuki" to "500")

    //updating map
    motorbikePrice["honda"] = 1100

    //adding new element to map
    motorbikePrice.put("yamaha", 1500)

    //print all map element
    println("\nprint all map element")
    for((key, value) in motorbikePrice){
        println("motorbike: $key, price: $value")
    }


}