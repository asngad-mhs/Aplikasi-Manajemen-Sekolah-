plugins {
    kotlin("jvm") version "1.9.10"
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.xerial:sqlite-jdbc:3.45.1.0")
}



javafx {
    version = "17.0.10"
    modules = listOf("javafx.controls", "javafx.fxml")
}

application {
    mainClass.set("com.example.demo_fx.HalamanLoginKt")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
