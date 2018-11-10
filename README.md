# Quickstart
Making a new project? Start here!

## How to use this project
First, download the project and copy it into your working directory.

Then generate the project files for your IDE:
- ```gradlew idea``` (IntelliJ IDEA)
- ```gradlew eclipse``` (Eclipse)

Visual Studio Code requires no additional configuration. (Note that the WPIib plugin is not currently supported.)

Finally, move the `Robot` class to a different package and update the corresponding entry in the `build.gradle` configuration file, and you're done!

## Configuring your robot project
This project uses GradleRIO, the Gradle-based FRC toolchain. (You can read more about GradleRIO [here](https://github.com/Open-RIO/GradleRIO).)

GradleRIO projects are configured via the `build.gradle` file in the project directory.

## Building and deploying your code
- ```gradlew clean``` will clean your build directories
- ```gradlew build``` will build your robot code
- ```gradlew deploy``` will deploy your built code to the RoboRIO
- These tasks must be run in succession.

If you're lazy, just run this command: ```gradlew clean build deploy```

These tasks are also listed in the Gradle window in IntelliJ IDEA.
You can even create run configurations to execute these tasks!