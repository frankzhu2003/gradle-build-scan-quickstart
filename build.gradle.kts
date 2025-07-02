plugins {
    id("java")
}

repositories {
    google()
    mavenCentral()
}

dependencies {

    implementation("org.elasticsearch.client:elasticsearch-rest-high-level-client:7.6.2")

    implementation("androidx.collection:collection:1.4.2")

    implementation("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")
    testImplementation("org.projectlombok:lombok:1.18.38")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.38")


    testImplementation(platform("org.junit:junit-bom:5.13.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

