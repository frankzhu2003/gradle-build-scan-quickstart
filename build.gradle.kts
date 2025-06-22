plugins {
    id("java")
}

repositories {
    google()
    mavenCentral()
}

dependencies {

    implementation("org.apache.logging.log4j:log4j-core:2.15.0")

    implementation("androidx.collection:collection:1.4.2")

    implementation("org.projectlombok:lombok:1.18.38")


    testImplementation(platform("org.junit:junit-bom:5.13.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
