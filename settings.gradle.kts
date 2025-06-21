plugins {
    id("com.gradle.develocity") version "4.0.2"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2.1"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

val isCI = System.getenv("CI") != null // adjust to your CI provider

develocity {
    server = "https://develocity-field.gradle.com" // adjust to your Develocity server
    allowUntrustedServer = false // ensure a trusted certificate is configured

    buildScan {
        uploadInBackground = !isCI
    }
}

buildCache {
    local {
        isEnabled = true
    }

    remote(develocity.buildCache) {
        isEnabled = true
        isPush = isCI
    }
}

rootProject.name = "gradle-build-scan-quickstart"
