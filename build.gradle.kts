buildscript {
    repositories.addProjectDefaults()
    dependencies {
        classpath(Dependencies.androidGradlePlugin)
        classpath(Dependencies.Kotlin.plugin)
        classpath(Dependencies.Shot.plugin)
    }
}

plugins {
//    `ben-manes-versions`
    `ktlint-gradle`
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
