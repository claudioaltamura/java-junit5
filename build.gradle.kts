import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    java
    id("com.diffplug.spotless") version "6.19.0"
    id("com.github.ben-manes.versions") version "0.46.0"
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.2")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

spotless {
    java {
        googleJavaFormat()
    }
    kotlinGradle {
        ktlint()
    }
}

tasks {
    test {
        useJUnitPlatform()
        // includeTags 'example1'
        // excludeTags 'example2'
        testLogging {
            events = setOf(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
        }
    }

// 	task example2Test(type: Test) {
// 		useJUnitPlatform {
// 			includeTags  = "example2"
// 		}
// 	}
}
