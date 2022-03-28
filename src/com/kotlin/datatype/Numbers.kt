package com.kotlin.datatype

fun main() {
    val exp01 = 123 // Int형으로 추론
    val exp02 = 123L // 접미사 L을 사용해 Long으로 추론
    val exp03 = 0x0F // 16진수 표기법 Int
    val exp04 = 0b00001011 // 2진법 Int

    // 읽기 쉽게 하기 위해 언더스코어를 포함해 표현
    // 숫자에 아무런 영향을 미치지 않음
    val number = 1_000_000

    val exp05 = 3.14 // 기본은 double
    val exp06 = 3.14F // Float형으로 추론
}