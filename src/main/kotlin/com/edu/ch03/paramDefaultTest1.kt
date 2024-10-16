package com.edu.ch03


//paramDefaultTest1.kt
//
//그룹과 팀원을 구성하는 프로그램이다
//
//단지 함수를 활용해서
//그룹의 정보와 팀원명이 들어오면
//
//ex: 구디의봄, 국하현 -> 그룹: 구디의봄의 팀원: 국하현
//이라고 출력되고
//
//ex: 김민재, 팀원명만 들어오면 -> 그룹: 디폴트의 팀원: 김민재
//
//단, return 타입 없음

fun main() {
    group("구디의봄","국하현")
    group("김민재")
}

fun group(groupName: String, name: String): Unit{
    println("그룹: $groupName" + "의 팀원: $name")
}

fun group(name: String){
    println("그룹: 디폴트의 팀원: $name")
}

fun groupAndMember(group: String, member: String) {

    var groupName = if (group.isEmpty()) "디폴트" else group
    var memberName = if (member.isEmpty()) "디폴트" else member

    println("그룹: $groupName 팀원: $memberName")
}
