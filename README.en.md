<div align="center">

[![Português](https://img.shields.io/badge/Idioma-Portugu%C3%Aas-green.svg)](./)
[![English](https://img.shields.io/badge/Language-English-blue.svg)](./README.en.md)
[![Español](https://img.shields.io/badge/Idioma-Espa%C3%B1ol-yellow.svg)](./README.es.md)

[![Release](https://img.shields.io/badge/release-v1.0.0-brightgreen?style=flat-square&logo=github)](../../releases/tag/v1.0.0)
![Status](https://img.shields.io/badge/status-em%20andamento-blue?style=flat-square)
![License](https://img.shields.io/badge/license-MIT-green?style=flat-square)

[⬅️ Back to Main Repository / Voltar ao Repositório Principal](./)

</div>

# 🧪 Unit Testing with JUnit

This repository contains the practical project consolidated during the **Unit Testing with JUnit** training by **AlgaWorks**. The main goal is to prepare developers to write efficient and organized unit tests for Java applications, following market best practices.

The repository covers various approaches and mini-projects (such as e-commerce simulations, blog systems, and utility classes) developed to explore multiple practical scenarios of software testing.

---

## 🎯 About the System and Key Concepts

The project focuses on implementing essential fundamentals to ensure software quality, covering:

- **Creation and Organization:** Configuration and usage of the JUnit 5 framework, as well as structural best practices (Triple A pattern, BDD).
- **Simulations (Mocks and Stubs):** Usage of mock objects and test doubles with Mockito to isolate tests and eliminate external dependencies.
- **Data Sets:** Design patterns like Object Mother and Builder to work cleanly with mock data.
- **Coverage Analysis:** Configuration and usage of JaCoCo to discover gaps and ensure business rules are fully tested.
- **Advanced Assertions:** Implementation of AssertJ to make verifications more readable, semantic, and chained.

---

## 📁 Project Structure

The source code is a Maven-based project, structured with the application module inside the `backend` folder:

```text
aw-testes-junit5/
├── backend/
│   ├── src/
│   │   ├── main/java/      # Production classes (blog, ecommerce, utility)
│   │   └── test/java/      # Unit test classes
│   ├── .mvn/               # Maven Wrapper
│   ├── mvnw / mvnw.cmd     # Maven Wrapper executables
│   └── pom.xml             # Maven configuration and dependencies
├── .gitignore              # Git ignore rules file
├── LICENSE                 # Project license
├── README.md               # Main documentation (Portuguese)
├── README.en.md            # English documentation
└── README.es.md            # Spanish documentation
```

---

## 🛠️ Technologies and Tools

- **Language & Framework:** Java 17+, JUnit 5
- **Build & Dependencies:** Apache Maven
- **Simulations (Mocks):** Mockito
- **Fluent Assertions:** AssertJ
- **Code Coverage:** JaCoCo
- **Recommended IDE:** IntelliJ IDEA

<br />

<div align="center">

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=flat-square&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Apache_Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-Simulations-8A2BE2?style=flat-square)
![AssertJ](https://img.shields.io/badge/AssertJ-Assertions-239120?style=flat-square)
![JaCoCo](https://img.shields.io/badge/JaCoCo-Code_Coverage-4D4D4D?style=flat-square)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat-square&logo=intellijidea&logoColor=white)

</div>

---

## 🍃 About

Theory and practical project developed during the **Unit Testing with JUnit** course from the 🍃 **AlgaWorks** platform.

---

## 👤 Author

Developed by **Ivan Ferreira**.

Copyright © 2026 Ivan Ferreira. All rights reserved.
