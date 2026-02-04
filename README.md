# JavaPracticeCodes

A personal collection of Java practice projects, exercises, examples, and notes — a place where I (arc7kai) record what I learn while studying Java.

Badges
- Java: Recommended JDK 11+
- Status: Work-in-progress

(You can add CI/badges above when you enable GitHub Actions or other services.)

## Table of Contents
- [About](#about)
- [Why this repo](#why-this-repo)
- [Repository structure](#repository-structure)
- [Getting started](#getting-started)
- [How to run examples](#how-to-run-examples)
- [Conventions](#conventions)
- [How to contribute](#how-to-contribute)
- [Learning notes / journaling](#learning-notes--journaling)
- [Roadmap](#roadmap)
- [License & contact](#license--contact)

## About
This repository contains small, focused Java programs and projects used to practice language features, standard libraries, algorithms, data structures, and design principles. Each folder or example is intended to be runnable and well-commented so you (and I) can revisit how things work.

## Why this repo
- Track progress while learning Java.
- Keep runnable examples and small projects in one place.
- Share patterns, tips, and common pitfalls.
- Build a reference that grows with experience.

## Repository structure
A suggested structure — adjust to match the actual layout in this repo:

- src/                     — source examples, grouped by topic
  - basics/                — language basics, syntax, primitives
  - oop/                   — classes, inheritance, polymorphism
  - collections/           — List, Set, Map, streams, collectors
  - concurrency/           — threads, executors, synchronization
  - algorithms/            — sorting, searching, recursion examples
  - i/o/                   — file, network, and serialization examples
  - jdbc/                  — simple database examples (if any)
- examples/                — standalone example programs
- tests/                   — unit tests (JUnit)
- notes/                   — markdown notes, summaries, and cheatsheets
- scripts/                 — helper scripts (build/run)
- README.md                — this file
- LICENSE                  — license file (recommended)

## Getting started

Prerequisites
- JDK 11+ recommended (adjust target version as needed)
- Optional: Maven or Gradle if examples are project-based

Quick checks:
```bash
java -version
javac -version
```

## How to run examples

1) Single Java file (quick run)
```bash
# compile
javac src/basics/HelloWorld.java

# run (if no package)
java -cp src/basics HelloWorld
```

2) Package-based code
```bash
# compile into classes directory
javac -d out $(find src -name "*.java")

# run main class (example: com.example.Main)
java -cp out com.example.Main
```

3) Maven projects
```bash
cd path/to/maven-project
mvn clean compile
mvn exec:java -Dexec.mainClass="com.example.Main"   # if exec plugin configured
```

4) Gradle projects
```bash
cd path/to/gradle-project
./gradlew run   # if the project has an application plugin configured
```

Add a small README in complex subprojects with specific run instructions (main class, required JVM args, environment variables, sample input).

## Conventions
- Directory per topic (basics, collections, concurrency, algorithms).
- Name example files clearly: TopicDescription.java (e.g., BinarySearchRecursive.java).
- Keep examples small and focused — one idea per file.
- Add comments and a short header in each file describing:
  - Purpose
  - Java version used
  - How to run (if not obvious)

Coding style
- Follow a consistent Java style (Google Java Style or your preferred guide).
- Use meaningful variable and class names.
- Add unit tests for examples where practical (JUnit 5 recommended).

Commit messages
- Use clear, descriptive messages:
  - feat: add binary search example
  - fix: correct edge case in linked-list reversal
  - docs: add note about stream lazy evaluation

## How to contribute
If you (or other contributors) want to add content:
1. Fork the repository.
2. Create a feature branch: git checkout -b feat/<topic>-<short-desc>
3. Add code, tests, and a short README for the example if needed.
4. Open a pull request with a clear description and link to any notes or references.

Contribution tips
- Prefer small PRs focused on a single lesson or example.
- Include input/output examples and test cases when relevant.
- Add comments explaining tricky parts for future learners.

## Learning notes / journaling
To track what you learned, add a short markdown note for each session:
- notes/2026-02-04-java-streams.md
  - What I learned
  - Code snippets
  - Links and references
  - TODOs to revisit

This helps turn transient knowledge into repeatable lessons.

## Roadmap
- Add more examples for:
  - Streams & functional programming
  - Common algorithms & coding interview problems
  - Concurrency patterns (CompletableFuture, reactive)
  - Design patterns in small examples
- Add automated tests and CI to run them
- Add badges and a top-level examples index

## License & contact
Author: Shashi Partap — GitHub: [arc7kai](https://github.com/arc7kai)

---
