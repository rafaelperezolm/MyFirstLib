// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.1.2" apply false
    id("com.android.library") version "7.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.5.31" apply false
    id("maven-publish")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

apply(from = "${project.rootDir}/buildSrc/src/main/kotlin/Publish.gradle")