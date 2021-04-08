# 📄 Kotlin Native Simple Posix File OI

[![Kotlin-Native](https://img.shields.io/badge/Kotlin_Multiplatform-1.4.31-blue.svg?style=flat&logo=kotlin&logoColor=white)](http://kotlinlang.org)
[![Gradle](https://img.shields.io/badge/Gradle-6.6.1-blue.svg?style=flat&logo=Gradle&logoColor=white)](http://kotlinlang.org)  
![Windows](https://img.shields.io/badge/-202124.svg?style=flat&logo=Windows&logoColor=white)
![Linux](https://img.shields.io/badge/-202124.svg?style=flat&logo=Linux&logoColor=white)
![macOS](https://img.shields.io/badge/-202124.svg?style=flat&logo=macOS&logoColor=white)

Example how to read and write text files in Kotlin Native Multiplatform. The generated executable is platform dependent
and can run without a Java Runtime Environment. Thanks [@hankg](https://github.com/HankG) for
the [kotlin-native-file-io-article](https://nequalsonelifestyle.com/2020/11/16/kotlin-native-file-io/).

## 🔨 Build

**Build all executables and libs**

```shell
gradle build
```

The `build.gradle.kts` automatically detects the current system platform and builds for this. But you can also manually
set one of these targets to cross compile for a different platform:

* `macosX64("native")`
* `linuxX64("native")`
* `mingwX64("native")`

## 🚀 Run

**Run the release**

```shell
gradle runReleaseExecutableNative
```

> 💡 The main method does expect a file name as parameter.
> It reads that file and prints its content. Without that file name it does nothing.

## ✅ Tests

The `ReadTest` shows how to use it as library dependency.

**Run tests**

```shell
gradle allTests
```