# Selenium Java Tests

[![Gitpod ready-to-code](https://img.shields.io/badge/Gitpod-ready--to--code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/justintungonline/selenium-java-tests)

## About The Project

Run quick tests with Selenium and Java

### Built with

- [Selenium](https://www.selenium.dev/)
- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)

## Getting Started

To get a local copy up and running by following these steps.

### Prerequisites

Clone this repository to your local computer
```sh
git clone https://github.com/justintungonline/selenium-java-tests.git
````

[Install Java Development Kit](https://www.oracle.com/java/technologies/javase-downloads.html) - Set your `JAVA_HOME` environment variable to point to Java folder and add the JDK's bin folder to your `path` environment variable

[Install Maven](https://maven.apache.org/install.html) - add bin folder to your `path` environment variable

### Installation

Confirm installations and pathes are setup in a terminal

```sh
# Maven
mvn -v

# Java
java -version

```

Build and run the project

```sh
mvn package

# Run main method in class App
java -cp target/training-1.0-SNAPSHOT.jar training.App
```

After running it you will see `Hello World` printed in the terminal.

## Usage

Placeholder: 
- Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.
- For more examples, please refer to the Documentation

## Roadmap

1. Walkthrough [Web Browser Automation](https://stackabuse.com/web-browser-automation-with-selenium-and-java/) and use examples.
2. Follow course[Seleium Webdriver Java course](https://github.com/angiejones/selenium-webdriver-java-course) and try code.

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
- Install JDK in VS Code quickstrart or separate installation like [JDK 64 Portable (Windows)](https://portableapps.com/apps/utilities/jdkportable64).

## Appendix: How this Repoistory was Set up

Initialize project in this repository's folder using a Maven quickstart template

```sh 
mvn archetype:generate -DgroupId=training -DartifactId=training -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
