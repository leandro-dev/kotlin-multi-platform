# kotlin-multi-platform
Example of a multi-platform project using Kotlin.

# How to use (IntelliJ)
- Open the project using the IDE
- IntelliJ still have some incompatibility, but it's very useful to program. Using IntelliJ to build and execute may fail. I suggest to execute the gradle tasks directly.
- Go to project structure, modules, expand the module `javascript`, and click on Kotlin configuration. Change the Target Platform to Javascript. This is required because the IDE did not import the gradle configuration properly.

# Testing
- Execute the command: `gradlew assemble`
- Android debug APK will be located at: `./android/build/outputs/apk/android-debug.apk`
  - Just install it on your device.
- Javascript files will be generated at: `./javascript/pages/web` folder
  - Just open the file at `./javascript/pages/index.html` and open the console output to see the message
