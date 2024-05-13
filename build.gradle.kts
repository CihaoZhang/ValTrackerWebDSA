val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    kotlin("jvm") version "1.9.23"
    id("io.ktor.plugin") version "2.3.9"
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("ApplicationKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // JSON Parser
    implementation("com.beust:klaxon:5.6")

    // Markdown to HTML parser
    implementation("org.jetbrains:markdown:0.7.0")

    // Config Loader
    implementation("com.sksamuel.hoplite:hoplite-core:2.7.5")
    implementation("com.sksamuel.hoplite:hoplite-yaml:2.7.5")

    // Ktor Server
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation("org.jetbrains.kotlinx:kotlinx-html-jvm:0.10.1")
    implementation("io.ktor:ktor-server-html-builder-jvm")
    implementation("io.ktor:ktor-server-content-negotiation")
    implementation("io.ktor:ktor-server-content-negotiation-jvm")
    implementation("io.ktor:ktor-serialization-gson-jvm")
    implementation("io.ktor:ktor-server-double-receive")

    // Ktor Client
    implementation("io.ktor:ktor-client-core-jvm")
    implementation("io.ktor:ktor-client-okhttp")
    implementation("io.ktor:ktor-client-okhttp-jvm")

    // Logging
    implementation("ch.qos.logback:logback-classic:$logback_version")

    // JSON parser
    implementation("org.json:json:20210307")
    // Test dependencies
    testImplementation("io.ktor:ktor-server-tests-jvm")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}