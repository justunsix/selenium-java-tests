# Selenium Java Tests

[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/justintungonline/selenium-java-tests)

## About The Project

Template project to run tests with Selenium and Java.

### Built with

- [Selenium](https://www.selenium.dev/)
- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)

## Getting Started

Get a local copy up and running by following these steps.

### Prerequisites

Choose an option below. You can develop in your browser or locally.

#### Option 1. Development Environment in Browser

[Gitpod](https://www.gitpod.io/features) is an online dev environment based on VS Code/Theia and can launch ready-to-code development environments for GitHub projects with a single click. It is free for open source projects like this one and a nice way to sharing code with others. You can open <https://gitpod.io/#https://github.com/justintungonline/selenium-java-tests> or push the Gitpod ready-to-code button at the top of this README.

#### Option 2. Install Locally

1. Clone this repository to your local computer using `git clone https://github.com/justintungonline/selenium-java-tests.git`.
2. [Install Java Development Kit](https://www.oracle.com/java/technologies/javase-downloads.html) - Set your `JAVA_HOME` environment variable to point to Java folder and add the JDK's bin folder to your `path` environment variable.
3. [Install Maven](https://maven.apache.org/install.html) - add Maven's bin folder to your `path` environment variable.

### Installation and Run

Confirm installations and pathes are setup in a terminal

```sh
# Maven
mvn -v

# Java
java -version

```

Build and run the project

```sh

cd training
mvn package

# Run main method in class App
java -cp target/training-1.0-SNAPSHOT.jar training.App
```

After running it you will see `Hello World` printed in the terminal.

## Usage

Placeholders:

- Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.
- For more examples, please refer to the Documentation

## Roadmap

1. Walkthrough [Web Browser Automation](https://stackabuse.com/web-browser-automation-with-selenium-and-java/) and use examples.
2. Follow course [Seleium Webdriver Java course](https://github.com/angiejones/selenium-webdriver-java-course) and try code here.

## Contributing

Contributions are what make the open source community a good place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Contact

Justin Tung - [@justin_tung](https://twitter.com/justin_tung/)

Project Link: [https://github.com/justintungonline/selenium-java-tests](https://github.com/justintungonline/selenium-java-tests)

## Acknowledgements

- [Best-README-Template: A README template to jumpstart projects](https://github.com/othneildrew/Best-README-Template/)

## Appendix: Example Windows Setup to Meet Installation Requirements

- [VS Code with Java Extensions](https://code.visualstudio.com/docs/java/java-tutorial) per VS Code Java Tutorial
- [VS Code Java Linting](https://code.visualstudio.com/docs/java/java-linting) - formatter, problem and vulnerability analysis
- Install JDK in VS Code quickstrart or separate installation like [JDK 64 Portable (Windows)](https://portableapps.com/apps/utilities/jdkportable64).

## Appendix: How this repository was set up

Initialize project in this repository's folder using a Maven quickstart template

```sh
mvn archetype:generate -DgroupId=training -DartifactId=training -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

Add [Selenium's dependency](https://www.selenium.dev/maven/) to Maven's pom. Added firefox driver for testing. Other  WebDrivers can be added.

## Appendix: Possible VS Code Java Settings

### Settings.json

```json
    "java.configuration.runtimes": [
        {
             "name": "JavaSE-1.8",
             "path": "C:\\usr\\bin\\Java64"
        },
        {
             "name": "JavaSE-1.8",
             "path": "C:\\usr\\bin\\\\JDK64",
             "sources": "/usr/local/jdk-11.0.3/lib/src.zip",
             "javadoc": "https://docs.oracle.com/javase/8/docs/api/",
             "default": true
        },
        {
             <!-- Installed with VS Code Java quickstart -->
             "name": "JavaSE-11",
             "path": "C:\\Program Files\\AdoptOpenJDK\\jdk-11.0.11.9-hotspot",
             "sources": "C:\\Program Files\\AdoptOpenJDK\\jdk-11.0.11.9-hotspot\\lib\\src.zip",
             "javadoc": "https://docs.oracle.com/en/java/javase/11/docs/api/",
             "default": true
        }
```
