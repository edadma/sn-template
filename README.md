# sn_template

![Maven Central](https://img.shields.io/maven-central/v/io.github.edadma/sn_template_native0.5_3)
[![Last Commit](https://img.shields.io/github/last-commit/edadma/sn_template)](https://github.com/edadma/sn_template/commits)
![GitHub](https://img.shields.io/github/license/edadma/sn_template)
![Scala Version](https://img.shields.io/badge/Scala-3.8.1-blue.svg)
![Scala Native Version](https://img.shields.io/badge/Scala_Native-0.5.10-blue.svg)

A Scala 3 project template for Scala Native with C interop support and Maven Central publishing.

## Quick Start

```bash
git clone https://github.com/edadma/sn_template.git
cd sn_template
sbt run
```

## Project Structure

```
sn_template/
├── src/
│   ├── main/
│   │   ├── scala/          # Scala source code
│   │   └── resources/
│   │       └── scala-native/   # C source files for native interop
│   └── test/
│       └── scala/          # Test source code
├── build.sbt               # Build configuration with Maven Central publishing
├── project/
│   ├── build.properties    # sbt version
│   └── plugins.sbt         # Scala Native, PGP, Sonatype plugins
└── .scalafmt.conf          # Code formatting
```

## Customizing

1. Update `name`, `organization`, `version`, `homepage`, `scmInfo`, and `developers` in `build.sbt`
2. Rename the package under `src/main/scala/`
3. Add C interop files to `src/main/resources/scala-native/`
4. Uncomment the test class in `src/test/scala/` and add your tests

## Building

```bash
sbt compile         # Compile
sbt test            # Run tests
sbt run             # Build and run native executable
sbt nativeLink      # Build native executable without running
```

## Publishing

Configured for Maven Central via Sonatype. Set up your credentials and PGP key, then:

```bash
sbt publishSigned
sbt sonatypeBundleRelease
```

## License

ISC
