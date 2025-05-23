plugins {
    id("java")
}

group = "xyz.alexcrea.mockbukkitissue"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    // Test dependency
    testImplementation("org.mockbukkit.mockbukkit:mockbukkit-v1.21:4.46.2")

    testImplementation(platform("org.junit:junit-bom:5.12.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}