# Selenium Java Tests

[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/justintungonline/selenium-java-tests)

## About The Project

Template project to run tests with Selenium and Java.

### Built with

- [Selenium](https://www.selenium.dev/)
- [Chrome driver](https://sites.google.com/chromium.org/driver/getting-started)
and Chrome browser for your platform. The driver must match with the browser version.
- [Java SE 10+](https://www.oracle.com/java/technologies/javase-downloads.html)

## Getting Started

Get a local copy up and running by following these steps.

### Prerequisites

Choose an option below. You can develop in your browser or locally.

#### Option 1. Development Environment in Browser

[Gitpod](https://www.gitpod.io/features) is an online dev environment based on VS Code/Theia and can launch ready-to-code development environments for GitHub projects with a single click. It is free for open source projects like this one and a nice way to sharing code with others. You can open <https://gitpod.io/#https://github.com/justintungonline/selenium-java-tests> or push the Gitpod ready-to-code button at the top of this README.

This option right now is only useful for development. To run the program, a local installation is recommended since it requires a Chrome browser installed.

#### Option 2. Install Locally

1. Clone this repository to your local computer using `git clone https://github.com/justintungonline/selenium-java-tests.git`.
2. [Install Java Development Kit](https://www.oracle.com/java/technologies/javase-downloads.html) - Set your `JAVA_HOME` environment variable to point to Java folder and add the JDK's bin folder to your `path` environment variable.
3. [Install Maven](https://maven.apache.org/install.html) - add Maven's bin folder to your `path` environment variable.
4. Install [Chrome](https://www.google.com/intl/en_ca/chrome/) and the [Chrome driver](https://sites.google.com/chromium.org/driver/getting-started), making sure the versions match. [Web Driver Manager](https://github.com/bonigarcia/webdrivermanager) is an alternative and efficient way to manage this part; however, this repository does not use it as a dependency.
   1. Add the chrome driver folder to your 'path' environment variable.
   2. Open your Chrome browser to check it works. If Chrome opens up as a black screen [disable hardware acceleration using this workaround](https://support.google.com/chrome/thread/17216800/completely-black-screen-when-opening-chrome?hl=en&msgid=23887976#).

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

# Run main method in class AppExample
mvn exec:java -Dexec.mainClass="training.AppExample"

```

After running it, Chrome will briefly open and visit <https://the-internet.herokuapp.com/>, a site for test automation, and then close. You will see something like below in the terminal indicating the driver visited and got a link text meaning the run was successful.

```log
[[ChromeDriver: chrome on WINDOWS (d40a87asdas31c6a93304e19e3)] -> partial link text: Testing]
=== Test Driver Complete ===
```

## Usage

Inspect the Java model framework for <https://the-internet.herokuapp.com/> and <https://formy-project.herokuapp.com/> and see and modify test cases for The-Internet site.

When developing, you may want to download the dependency's source with `mvn dependency:sources` and/or Javadocs with `mvn dependency:resolve -Dclassifier=javadoc`

Placeholders:

- Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.
- For more examples, please refer to the Documentation

## Roadmap

- Follow course [Seleium Webdriver Java course](https://github.com/angiejones/selenium-webdriver-java-course) and try code here.

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
- Java code samples from [Web Browser Automation with Selenium and Java](https://stackabuse.com/web-browser-automation-with-selenium-and-java/) by Shadab Ansari for demonstration code in `AppExample.java`
- Test automation site <https://the-internet.herokuapp.com/>

## Appendix: How this repository was set up

Initialize project in this repository's folder using a Maven quickstart template

```sh
mvn archetype:generate -DgroupId=training -DartifactId=training -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

Add [Selenium's dependency](https://www.selenium.dev/maven/) to Maven's pom. Added [Chrome driver dependency from MVN](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver/3.141.59) for testing. Other  WebDrivers can be added.

## Appendix: Example Windows Setup to Meet Installation Requirements

- [IntelliJ](https://www.jetbrains.com/idea/) or [VS Code with Java Extensions](https://code.visualstudio.com/docs/java/java-tutorial) per VS Code Java Tutorial and [VS Code Java Linting](https://code.visualstudio.com/docs/java/java-linting) - formatter, problem and vulnerability analysis
- Install JDK (in VS Code quickstrart or separate installation like [JDK 64 Portable (Windows)](https://portableapps.com/apps/utilities/jdkportable64).
- Install Chrome and Chrome driver for Version 91.0.4472.77 (Official Build) (32-bit).

### Appendix: Other Stuff

#### Download Dependency sources and/or Javadoc

See more options at [Maven download sources javadoc](https://www.baeldung.com/maven-download-sources-javadoc)

```sh

mvn dependency:sources

mvn dependency:sources dependency:resolve -Dclassifier=javadoc

```

If using VS Code, ctrl+click into a class and then [right click to attach the source for the dependency](https://github.com/redhat-developer/vscode-java/issues/1855#issuecomment-823142835).

#### Settings.json

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
        // Sonarlint: selenium-java-tests project binding, make sure to configure the connection in your workspace settings or global settings
             "sonarlint.connectedMode.project": {
             "projectKey": "selenium-java-tests"
        }
```

### Other commands

```sh
# Run a single class
java -cp target/base-1.0-SNAPSHOT.jar base.BaseTests

# Execute a single method called unitTest in BaseTests testing class
mvn -Dtest=BaseTests#unitTest test

# Run main testing class, cleanupDaemonThreads is required otherwise there is a java.lang.IllegalThreadStateException or use System.exit(0); at the end of the program
mvn exec:java -Dexec.mainClass="training.AppExample" -Dexec.cleanupDaemonThreads=false

# Build, test and scan code for upload to sonarcloud.io (requires access to the project in Sonar Cloud)
mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar
```
