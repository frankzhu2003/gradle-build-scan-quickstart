plugins {
    id("java")
}

repositories {
    https://repo.spring.io/snapshot
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-core:2.15.0")
    implementation("org.springframework.data:spring-data-bom:2025.1.0-20250618.082622-1090") 
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
