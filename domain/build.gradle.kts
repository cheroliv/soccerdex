import org.gradle.api.JavaVersion.VERSION_11
import org.gradle.api.JavaVersion.VERSION_1_8

plugins {
    kotlin(
        "jvm")
    id("java-library")

}

dependencies {
    // coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:${properties["kotlinx_coroutines_version"]}")
    implementation("io.insert-koin:koin-core:${properties["koin_version"]}")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
    testImplementation ("io.insert-koin:koin-test:${properties["koin_version"]}")
    testImplementation("io.insert-koin:koin-test-junit4:${properties["koin_version"]}")
    testImplementation ("ch.qos.logback:logback-classic:1.4.5")
}

java {
    sourceCompatibility = VERSION_1_8
    targetCompatibility = VERSION_11
}