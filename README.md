# Java 21 CLI Pico Archetype

## Intro

This repository contains a Maven Archetype that can be used to generate a CLI Java 21 project that uses picocli for command line parsing.

Included example code will create an application with the following command line interface:
```
Usage: <main class> [-hv] [COMMAND]
  -h, --help      Print usage help and exit.
  -v, --version   Print version information and exit.
Commands:
  create  Creates named value with given id and value
  list    Lists all creates values
  update  Updates value based on id
  delete  Deletes value by id
```

## Usage

Invoke command:
```
mvn archetype:generate -DarchetypeGroupId=com.dominikcebula.archetypes -DarchetypeArtifactId=java21-cli-pico-archetype
```

Maven Archetype will ask about `groupId`, `artifactId`, `version`, `package name` and will generate a project skeleton.

## Generated project

Having the project generated, invoke:
```
mvn clean install
```

Executable jar with all dependencies will be generated under `target` folder.

You can execute generated `jar` using command:
```
java -jar target/generated-output.jar
```
