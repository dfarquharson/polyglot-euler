import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin(module = "jvm") version "1.6.0"
    java
    application
}

group = "io.dfarquharson"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin(module = "test"))
    testImplementation(group = "org.assertj", name = "assertj-core", version = "3.11.1")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

sourceSets {
    main {
        java.srcDirs("src/main/java", "src/main/kotlin")
    }
    test {
        java.srcDirs("src/test/java", "src/test/kotlin")
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
}

application {
    mainClass.set("io.dfarquharson.euler.PolyglotSummary")
}

tasks.register("run-kotlin", JavaExec::class.java) {
    description = "Kotlin version of EulerSummary"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("io.dfarquharson.euler.kotlin.EulerSummaryKt")
}

tasks.register("run-java", JavaExec::class.java) {
    description = "Java version of EulerSummary"
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("io.dfarquharson.euler.java.EulerSummary")
}