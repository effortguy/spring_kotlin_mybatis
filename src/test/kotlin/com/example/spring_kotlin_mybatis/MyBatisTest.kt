package com.example.spring_kotlin_mybatis

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class MyBatisTest(
    @Autowired
    private val customerMapper: CustomerMapper
) {

    @Test
    fun testCountCustomer() {
        val customer = customerMapper.findByIdAndName(null, "01231243")

        assertEquals("01231243", customer.customerName)
    }
}