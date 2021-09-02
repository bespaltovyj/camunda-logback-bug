plugins {
    kotlin("jvm") version "1.5.21"
    kotlin("plugin.spring") version "1.5.21"

    id("org.springframework.boot") version "2.5.2"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
}

group = "io.github.bespaltovyj"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-webapp:7.16.0-alpha4")

    implementation("ch.qos.logback:logback-core:1.2.5")
    implementation("ch.qos.logback:logback-classic:1.2.5")
    implementation("ch.qos.logback:logback-access:1.2.5")
    implementation("net.logstash.logback:logstash-logback-encoder:6.6")

    implementation("com.h2database:h2")
}
