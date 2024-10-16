package com.edu.ch03

//HighOrderTest2

//함수 -> 함수 X (아직은 시기상조)


//하나의 숫자를 받아 그 숫자가 짝수인지 홀수인지 확인하는 람다식을 작성하시오
//
//숫자 매개변수 -> 리턴값은 true, false
//
//true이면 짝수
//false이면 홀수
//출력 내용은 문자열이 아니다

fun main() {
    // (Int) -> Boolean
    // {x -> x % 2 == 0}
    val num: (Int) -> Boolean = {x -> x % 2 == 0}

    println(num(10)) // num(10) => true
    println(num(7))
}

//간략화 -> 명확히