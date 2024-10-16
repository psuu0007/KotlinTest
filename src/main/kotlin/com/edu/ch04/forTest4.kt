package com.edu.ch04

//forTest4

//구구단 마스터3

/*
ex: 2~9단 을 출력한다
fun에서 fun을 호출하는 형태로 구현한다

 */

fun gugudanMaster(){
    for (i in 0..1){
        printHeader(i*4+2, i*4+2+3)
        printGugudan(i*4+2, i*4+2+3)
    }
}

// 구구단의 헤더(단 제목)를 출력하는 함수
fun printHeader(startDan: Int, endDan: Int) {
    for (i in startDan..endDan) {
        print("$i\t\t\t")
    }
    println()
}

// 구구단 계산 및 출력하는 함수
fun printGugudan(startDan: Int, endDan: Int) {
    for (i in 1..9) {
        for (dan in startDan..endDan) {
            print("$dan X $i = ${dan * i}\t")
        }
        println()
    }
}

fun main() {
    // 전체 구구단 출력
    gugudanMaster()
}

//
//    for (i in 2..5){
//        print("$i\t\t\t")
//    }
//
//    println()
//
//    for (i in 1..9){
//        for (dan in 2..5){
//            print("$dan X $i = ${dan * i}\t")
//        }
//        println()
//    }
//
//    for (i in 6..9){
//        print("$i\t\t\t")
//    }
//
//    println()
//
//    for (i in 1..9){
//        for (dan in 6..9){
//            print("$dan X $i = ${dan * i}\t")
//        }
//        println()
//    }



