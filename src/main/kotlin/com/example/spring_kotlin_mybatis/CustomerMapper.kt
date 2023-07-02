package com.example.spring_kotlin_mybatis

import org.apache.ibatis.annotations.Mapper

@Mapper
interface CustomerMapper {
    fun findByIdAndName(id: Long?, name: String?): Customer
}