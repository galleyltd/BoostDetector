import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        maven("https://kotlin.bintray.com/kotlin-eap")
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${project.properties["kotlinVersion"]}")
        classpath("com.github.jengelman.gradle.plugins:shadow:${project.properties["shadowPluginVersion"]}")
    }
}

apply(plugin = "org.jetbrains.kotlin.jvm")
apply(plugin = "com.github.johnrengelman.shadow")

plugins {
    application
}

group = "com.github.galleyltd.boost"
version = "0.0.1"

application {
    mainClassName = "io.ktor.server.netty.DevelopmentEngine"
}

tasks.withType<ShadowJar> {
    baseName = "boost-detector"
    classifier = ""
    version = ""
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test> {
    useJUnitPlatform {
        includeEngines("junit-jupiter")
    }
}

repositories {
    mavenLocal()
    jcenter()
    maven("https://kotlin.bintray.com/ktor")
    maven("https://kotlin.bintray.com/kotlin-eap")
    maven("https://kotlin.bintray.com/kotlinx")
}

val ktorVersion: String by project
val logbackVersion: String by project
val junit5Version: String by project
val hamkrestVersion: String by project
val lettuceVersion: String by project

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    implementation("io.ktor", "ktor-server-netty", ktorVersion)
    implementation("io.ktor", "ktor-server-core", ktorVersion)
    implementation("io.ktor", "ktor-locations", ktorVersion)
    implementation("io.ktor", "ktor-jackson", ktorVersion)
    implementation("io.ktor", "ktor-auth", ktorVersion)
    implementation("io.ktor", "ktor-client-apache", ktorVersion)
    implementation("io.ktor", "ktor-client-jackson", ktorVersion)

    implementation("io.lettuce", "lettuce-core", lettuceVersion)
    implementation("ch.qos.logback", "logback-classic", logbackVersion)

    testImplementation("io.ktor", "ktor-server-tests", ktorVersion)
    testImplementation("com.natpryce", "hamkrest", hamkrestVersion)
    testImplementation("org.junit.jupiter", "junit-jupiter-api", junit5Version)
    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", junit5Version)
}
