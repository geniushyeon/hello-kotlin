package com.kotlin.datatype

fun main() {
    // 문자열: String으로 선언되며 String Pool이라는 공간에 구성됨
    val str1: String = "Hello"
    val str2 = "Kotlin"
    val str3 = "Hello"

    // ==는 값만 비교, ===는 참조 비교
    println("str1 === str2: ${str1 === str2}") // false
    println("str1 === str3: ${str1 === str3}") // true
    println("str1.equals(str3) = ${str1.equals(str3)}") // true
}