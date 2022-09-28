import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    java
    eclipse
    idea
    id("com.diffplug.spotless") version "6.11.0"
    id("com.github.ben-manes.versions") version "0.42.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.1")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.1")
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
