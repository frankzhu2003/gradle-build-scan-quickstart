plugins {
    id("java")
}

repositories {
    google()
    mavenCentral()
}

dependencies {

    // Updated Elasticsearch client - using the actively maintained version
    implementation("org.apache.geode:geode-core:1.11.0")
    implementation("androidx.collection:collection:1.4.2")
    // Updated androidx collection dependency
    implementation("androidx.collection:collection:1.4.3")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
    implementation("org.projectlombok:lombok:1.18.38")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.38")


    testImplementation(platform("org.junit:junit-bom:5.13.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}


    // Add timeout to prevent hanging builds
    //timeout.set(java.time.Duration.ofMinutes(5))

    // Increase heap size for test execution
    //jvmArgs = listOf("-Xmx2g")

    // Enable detailed test reporting
//    testLogging {
//        events("passed", "skipped", "failed")
//        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
//    }
