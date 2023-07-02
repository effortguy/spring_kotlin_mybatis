package com.example.spring_kotlin_mybatis

enum class CustomerType(
    val code: String
) {
    GOLD("G"),
    BRONZE("B");

    companion object {
        fun find(code: String) = CustomerType.values().find { it.code == code }
    }
}