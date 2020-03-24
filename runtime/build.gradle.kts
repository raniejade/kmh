plugins {
  kotlin("multiplatform")
}

repositories {
  jcenter()
}

kotlin {
  jvm()
  linuxX64("linuxX64")
  mingwX64("mingwX64")
  macosX64("macosX64")

  sourceSets {
    val commonMain by getting {
      dependencies {
        implementation(project(":annotations"))
        implementation(kotlin("stdlib-common"))
      }
    }

    val jvmMain by getting {
      dependencies {
        implementation(kotlin("stdlib-jdk8"))
      }
    }
  }
}