package com.edu.final

// 키보드로부터 정수를 입력받아 수까지의 피보나치 수열을 출력하는 프로그램
// 입력: 5 -> 출력: 0 1 1 2 3
// 입력: 10 -> 출력: 0 1 1 2 3 5 8 13 21 34

fun main() {
    val input: Int = readln().toInt()

    fibonacciNumbersFnc(input)
}

fun fibonacciNumbersFnc(num: Int): Unit {

    val fibonacciNumbers = Array(num) { 0 }
    fibonacciNumbers[1] = 1

    for (i in 2 ..<num) {
        fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2]
    }

    fibonacciNumbers.forEach { item -> print("$item\t") }
}