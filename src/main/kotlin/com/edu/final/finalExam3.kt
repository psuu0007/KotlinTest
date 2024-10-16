package com.edu.final

//크기가 3인 배열에
//강아지, 고양이, 앵무새를 넣는다
//
//이들의 배열 위치는 무작위로 변경된다
//
//사용자는
//배열에 첫번째 값이 강아지 또는 고양이 또는 앵무새 중에 무엇일지 맞춘다
//두번째 위치의 값도 강아지 또는 고양이 또는 앵무새 중에 무엇일지 맞춘다
//세번째 위치의 값도 강아지 또는 고양이 또는 앵무새 중에 무엇일지 맞춘다
//
//ex: 정답 배열값이 고양이, 앵무새, 강아지인 경우
//나는 강아지, 앵무새, 고양이 를 넣었다면
//출력 값은
//false, true, false로 출력해서
//사용자에게 무엇이 맞고 틀렸는지 알려준다
//
//계속 시도해서 전부
//true, true, true인 경우
//
//몇번 시도했는지 횟수를 출력하고
//프로그램이 종료된다

fun main() {
    guessAnimalsService()
}

fun guessAnimalsService(): Unit {
    var animals = arrayOf("강아지", "고양이", "앵무새")
    animals = shuffleOfStrArray(animals)

    println("animals: ${animals.contentToString()}")

    var userAnswersArr: Array<String>
    var cnt: Int = 0
    var input: String
    var resultArr: Array<Boolean>

    while (true) {
        println("강아지, 고양이, 앵무새가 한 마리씩 무작위 순서로 철창에 갇혀있습니다.\n갇혀있는 순서를 맞추세요.")
        println("ex: 강아지, 고양이, 앵무새")

        input = readln() // 입력
        cnt++ // 카운트 증가

        userAnswersArr = input.split(", ").map { it.trim() }.toTypedArray()
        resultArr = wordCheckFnc(animals, userAnswersArr)

        if (!resultArr.contains(false)) {
            println("정답입니다.\n시도한 횟수: ${cnt}번")
            return
        }

        println("시도 결과: ${resultArr.contentToString()}")
    }
}

// 배열 위치를 랜덤으로 섞음
fun shuffleOfStrArray(strArr: Array<String>): Array<String> {
    val arr: Array<String> = strArr
    var tempStr: String

    for (i in 0..<arr.size - 1) {
        val randomIndex = (i ..< arr.size).random()
        tempStr = arr[i]
        arr[i] = arr[randomIndex]
        arr[randomIndex] = tempStr
    }

    return arr
}

// 컴퓨터와 사용자가 입력한 단어 정답 확인
fun wordCheckFnc(a: Array<String>, b: Array<String>): Array<Boolean> {
    val result = Array<Boolean>(3) { false }

    for (i in 0..<a.size) {
        result[i] = a[i] == b[i]
    }

    return result
}