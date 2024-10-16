package com.edu.final

// 배열에
//1~45 숫자가 6개 들어있다
//이 수들은 랜덤으로 데이터를 넣는다
//2, 6, 14, 25, 40, 33
//
//나는
//숫자 3개를
//배열에 넣는다 키보드 또는 그냥 코드로
//
//6, 13, 33
//
//서로 대조해서
//3개가 다 맞으면
//당첨 숫자: [2, 6, 14, 25, 40, 33]
//님이 고른 숫자: [6, 13, 33]
//맞춘 숫자: [6, 33]
//
//1등 당첨금: 1,000,000
//2개가 맞으면
//당첨 숫자: [2, 6, 14, 25, 40, 33]
//님이 고른 숫자: [6, 13, 33]
//맞춘 숫자: [6, 33]
//
//2등 당첨금: 500,000
//1개가 맞으면
//3등 당첨금: 100,000
//당첨 숫자: [2, 6, 14, 25, 40, 33]
//님이 고른 숫자: [1, 13, 34]
//맞춘 숫자: 없음
//1개도 맞지 않으면
//맞은 숫자가 존재하지 않습니다.
//
//라고 출력하는 프로그램을 완성하시오

fun main() {
    lottoFnc()
}

fun randomNumArr(): Array<Int> {
    val arr = Array(6) { 0 }

    for (i in 0 ..<6) {
        val randomNum = (1..45).random()
        arr[i] = randomNum
    }

    return arr
}

fun lottoDrawingRule(systemArr: Array<Int>, userNumArr: Array<Int>): Unit {
    // compare array -> 매칭
    val matchNumArr: Array<Int> = systemArr.filter { userNumArr.contains(it) }.toTypedArray()

    when (matchNumArr.size) {
        3 -> println("1등 당첨금: 1,000,000")
        2 -> println("2등 당첨금: 500,000")
        1 -> println("3등 당첨금: 100,000")
        else -> println("맞은 숫자가 존재하지 않습니다.")
    }

    println("당첨 숫자: ${systemArr.contentToString()}")
    println("님이 고른 숫자: ${userNumArr.contentToString()}")

    if (matchNumArr.isEmpty()) {
        println("맞춘 숫자: 없음")
        return
    }

    println("맞춘 숫자: ${matchNumArr.contentToString()}")


}

fun lottoFnc() {
    val systemNumArr: Array<Int> = randomNumArr()
//    println(systemNumArr.contentToString())

    println("숫자 3개를 형식에 맞게 입력해 주세요. (ex: 1, 2, 3)")
    val userNumArr: Array<Int> = readln().split(", ").map { it.toInt() }.toTypedArray()

    lottoDrawingRule(systemNumArr, userNumArr)
}