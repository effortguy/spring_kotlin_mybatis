//package com.example.spring_kotlin_mybatis
//
//import org.apache.ibatis.session.SqlSessionFactory
//import org.mybatis.spring.SqlSessionFactoryBean
//import org.springframework.boot.jdbc.DataSourceBuilder
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver
//
//@Configuration
//class MyBatisConfig {
//
//    @Bean
//    fun sqlSessionFactory(): SqlSessionFactory {
//        return SqlSessionFactoryBean().apply {
//            val dataSource = DataSourceBuilder
//                .create()
//                .url("jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=Asia/Seoul")
//                .username("root")
//                .password("qwerrewq12!")
//                .driverClassName("com.mysql.cj.jdbc.Driver")
//                .build()
//            setDataSource(dataSource)
//            setMapperLocations(*PathMatchingResourcePatternResolver().getResources("classpath*:mybatis/*.xml"))
//        }.`object`!!
//    }
//}