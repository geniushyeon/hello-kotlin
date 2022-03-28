package com.kotlin.datatype

fun main() {

    var num = 0.1

    for (x in 0 .. 999) {
        num += 0.1
    }

    print(num) // 100.09999999999859
}