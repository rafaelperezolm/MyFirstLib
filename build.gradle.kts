// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.1.2" apply false
    id("com.android.library") version "7.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.5.31" apply false
    `maven-publish`
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.rafaelperezolm"
            artifactId = "myfirstlib"
            version = "1.0.21"
            //artifact("$buildDir/outputs/aar/${project.getName()}-release.aar")
            //artifact(file("$buildDir/some-${version}.jar"))
        }
    }
}