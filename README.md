# Quickstart
Making a new project? Start here!

## How to use this project
First, [download the project](https://github.com/Team980/Quickstart/archive/master.zip) and copy it into your working directory.

Then generate the project files for your IDE:
- ```gradlew idea``` (IntelliJ IDEA)
- ```gradlew eclipse``` (Eclipse)

Visual Studio Code requires no additional configuration.

When importing the project into your IDE, make sure to use the Gradle wrapper provided by the project.

Finally, move the `Robot` and `Main` classes to a different package. 
Once you update the corresponding entry in the `build.gradle` configuration file, you're done!

## Configuring your robot project
This project uses GradleRIO, the Gradle-based FRC toolchain. (You can read more about GradleRIO [here](https://github.com/wpilibsuite/GradleRIO).)

GradleRIO projects are configured via the `build.gradle` file in the project directory.

## Dependencies
WPILib dependencies are tied to the GradleRIO version.
Vendor dependencies can be added by including the provided vendor.json files in the ```vendordeps``` folder.

CTRE's Phoenix Framework (```Phoenix.json```) is provided as an example, as is a script to update it.

## Building and deploying your code
- ```gradlew clean``` will clean your build directories
- ```gradlew build``` will build your robot code
- ```gradlew deploy``` will deploy your built code to the RoboRIO
- These tasks must be run in succession.

If you're lazy, just run this command: ```gradlew clean build deploy```

These tasks are also listed in the Gradle window in IntelliJ IDEA.
You can even create run configurations to execute these tasks!