import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.13"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.3.1")
        implementation("org.bgee.log4jdbc-log4j2:log4jdbc-log4j2-jdbc4.1:1.16")
        implementation("com.mysql:mysql-connector-j")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testImplementation("org.mybatis.spring.boot:mybatis-spring-boot-starter-test:2.3.1")
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
