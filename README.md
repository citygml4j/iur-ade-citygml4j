i-UR ADE module for citygml4j
=============================

This is a citygml4j module for the **i-Urban Revitalization (i-UR)** Application Domain Extension for CityGML.
The "i-UR" is an information infrastructure for urban revitalization and planning.

This module adds support for parsing and writing i-UR ADE enriched CityGML datasets to citygml4j.

* **i-UR specification and material: https://www.kantei.go.jp/jp/singi/tiiki/toshisaisei/itoshisaisei/iur**
* **Where to file issues: https://github.com/citygml4j/iur-ade-citygml4j/issues**

## How to use the module
This module uses the `ADEContext` interface mechanism of citygml4j. Simply register the module with the citygml4j
library to build an i-UR application and to read and write i-UR ADE datasets.

Registering the i-UR module with citygml4j only requires one additional line of code compared to a regular citygml4j
program. Be careful to register the `ADEContext` before creating a `CityGMLBuilder` object.

```java
CityGMLContext context = CityGMLContext.getInstance();

// register i-UR module
context.registerADEContext(new UrbanRevitalizationADEContext());

CityGMLBuilder builder = context.createCityGMLBuilder();
...
```

The i-UR ADE module can also be loaded dynamically, for instance, using the Java Service Provider interface.

Once loaded, citygml4j will automatically (de)serialize i-UR ADE content from CityGML datasets into the model classes
defined in the package `vcs.citygml4j.ade.iur.model`, which extend the predefined citygml4j model classes. Simply use
these classes to build your i-UR specific application logic.

## Latest release
The latest stable release of iur-ade-citygml4j is 1.0.0.

Download the iur-ade-citygml4j 1.0.0 release binaries
[here](https://github.com/citygml4j/iur-ade-citygml4j/releases/download/v1.0.0/iur-ade-citygml4j-1.0.0.zip).
Previous releases are available from the [releases section](https://github.com/citygml4j/iur-ade-citygml4j/releases).

## Maven artifact
iur-ade-citygml4j is also available as [Maven](http://maven.apache.org/) artifact from the
[Maven Central Repository](https://search.maven.org/search?q=iur-ade-citygml4j) and from
[JCenter](https://bintray.com/bintray/jcenter). To add iur-ade-citygml4j to your project with Maven, add the following
code to your `pom.xml`. You may need to adapt the iur-ade-citygml4j version number.

```xml
<dependency>
  <groupId>org.citygml4j</groupId>
  <artifactId>iur-ade-citygml4j</artifactId>
  <version>1.0.0</version>
</dependency>
```

Here is how you use iur-ade-citygml4j with your Gradle project:

```gradle
repositories {
  mavenCentral()
}

dependencies {
  compile 'org.citygml4j:iur-ade-citygml4j:1.0.0'
}
```

## Building from source
The i-UR ADE module uses [Gradle](https://gradle.org/) as build system. To build the module from source, clone the
repository to your local machine and run the following command from the root of the repository.

    > gradlew build

The script automatically downloads all required dependencies for building the module. So make sure you are connected
to the internet. The build process runs on all major operating systems and only requires a Java 8 JDK or higher to run.

If the build was successful, you will find the JAR file of the i-UR ADE module under `iur-ade-citygml4j/build/libs`.

## About i-UR
The "i-UR" information infrastructure allows people to analyse and to visualize the situation and problems of urban areas
according to the future vision of each area using geospatial information and virtual reality technologies. The
quantitative analysis and visualization clearly show the cash-flow and spatial plan of the city and promotes
understanding and encourages consensus building among relevant players, e.g. investors, citizens, and developers.

The i-UR ADE is an Application Domain Extension for [OGC CityGML 2.0](http://www.opengeospatial.org/standards/citygml).

## License

The i-UR ADE module is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).
See the `LICENSE` file for more details.
