# Java Adapter SDK Interfaces

FAS Custom Adapters can be developed in any language by creating a server which fulfils the REST contract specified in [adapter-rest-contract](https://github.com/FileAnalysisSuite/adapter-rest-contract/blob/main/adapter-rest-contract/src/main/resources/io/github/fileanalysissuite/adapters/rest/contract/swagger.yaml#L1).

However for the .NET and Java ecosystems there are SDKs available to make it easier.

This module contains the set of interfaces to be implemented in order to develop a custom adapter for FAS in Java, or in any JVM language.  The .NET SDK is in the [AdapterSdk](https://github.com/FileAnalysisSuite/AdapterSdk) repository.

### Packages
There are two packages in this module:

- the [extensibility](#extensibility) package
- the [framework](#framework) package

#### [extensibility](src/main/java/io/github/fileanalysissuite/adaptersdk/interfaces/extensibility)
The `io.github.fileanalysissuite.adaptersdk.interfaces.extensibility` package contains the interfaces to implement in order to create a custom adapter.

The main interface that must be implemented is [`RepositoryAdapter`](src/main/java/io/github/fileanalysissuite/adaptersdk/interfaces/extensibility/RepositoryAdapter.java#L16).  The Javadoc for it is [here](https://www.javadoc.io/doc/io.github.fileanalysissuite.adaptersdk.interfaces/adaptersdk-interfaces/latest/io/github/fileanalysissuite/adaptersdk/interfaces/extensibility/RepositoryAdapter.html).  It contains the entry point methods which are called when the adapter is required to provide information from the repository.

For some of the more trivial interfaces in this package there are [convenience objects](https://github.com/FileAnalysisSuite/adaptersdk-convenience) provided by the [`adaptersdk-convenience`](https://search.maven.org/artifact/io/github/fileanalysissuite/adaptersdk/convenience/adaptersdk-convenience) module.  Adapter developers may take advantage of these so that they do not have to implement all of the interfaces in the `extensibility` package.

#### [framework](src/main/java/io/github/fileanalysissuite/adaptersdk/interfaces/framework)
The `io.github.fileanalysissuite.adaptersdk.interfaces.framework` package specifies the facilities that are provided to the custom adapter by the Java SDK.

These interfaces are implemented by internal Java SDK classes.  Custom adapters make use of these objects through the interfaces of the `framework` package.

### Versioning
This project uses [semantic versioning](https://semver.org/) from the perspective of the adapter developer.

#### Major Version Increments
The major version is incremented when there are breaking changes made from the custom adapter developer's perspective.  That is, if there are changes made that would necessaite changes to custom adapter code.

For example, if a new non-default method was added to one of the interfaces in the `extensibility` package then that method would have to be implemented by adapter developers when they move to the new version.  Such a change would elicit a major version increment.

Similarly, if a method was removed from one of the interfaces in the `framework` package then this would constitute a breaking change and result in a major version increment.

#### Minor Version Increments
The minor vesion is incremented when new Java SDK functionality is made available to custom adapter developers.

For example, new methods being added to `framework` package classes would result in a minor version increment.

### Javadoc
[![javadoc](https://javadoc.io/badge2/io.github.fileanalysissuite.adaptersdk.interfaces/adaptersdk-interfaces/javadoc.svg)](https://javadoc.io/doc/io.github.fileanalysissuite.adaptersdk.interfaces/adaptersdk-interfaces)

The Javadoc for the latest released version of this project can be
viewed here:  
[https://www.javadoc.io/doc/io.github.fileanalysissuite.adaptersdk.interfaces/adaptersdk-interfaces](https://www.javadoc.io/doc/io.github.fileanalysissuite.adaptersdk.interfaces/adaptersdk-interfaces)
