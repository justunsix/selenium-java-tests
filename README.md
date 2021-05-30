# Selenium Java Tests

## Installation Requirements

- Install [Java Development Kit](https://www.oracle.com/java/technologies/javase-downloads.html) - Set `JAVA_HOME` to point to Java and add JDK's bin to `path`
- [Maven](https://maven.apache.org/install.html) -  add bin folder to `path`

## Build and Run

Confirm installations and path in terminal and initialize a Maven Java project

```sh
# Maven
mvn -v

# Java
java -version

# Initialize project in this repository's folder using a Maven quickstart template
mvn archetype:generate -DgroupId=training -DartifactId=training -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

Build and run the project

```sh
mvn package

# Run main method in class App
java -cp target/training-1.0-SNAPSHOT.jar training.App
```

## Example Windows Setup to Meet Installation Requirements

- [VS Code with Java Extensions](https://code.visualstudio.com/docs/java/java-tutorial) per VS Code Java Tutorial
- Install JDK in VS Code quickstrart or separate installation like [JDK 64 Portable (Windows)](https://portableapps.com/apps/utilities/jdkportable64).
