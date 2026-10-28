<div align="center">

[![Português](https://img.shields.io/badge/Idioma-Portugu%C3%Aas-green.svg)](./README.md)
[![English](https://img.shields.io/badge/Language-English-blue.svg)](./README.en.md)
[![Español](https://img.shields.io/badge/Idioma-Espa%C3%B1ol-yellow.svg)](./README.es.md)

[![Release](https://img.shields.io/badge/release-v1.0.0-brightgreen?style=flat-square&logo=github)](../../releases/tag/v1.0.0)
![Status](https://img.shields.io/badge/status-en%20proceso-blue?style=flat-square)
![License](https://img.shields.io/badge/license-MIT-green?style=flat-square)

</div>

# 🧪 Pruebas Unitarias con JUnit

Este repositorio contiene el proyecto práctico consolidado durante la capacitación **Pruebas Unitarias con JUnit** de **AlgaWorks**. El objetivo principal es preparar al desarrollador para escribir pruebas unitarias eficientes y organizadas para aplicaciones Java, siguiendo las mejores prácticas del mercado.

El repositorio abarca diversos enfoques y mini-proyectos (como simulaciones de comercio electrónico, sistemas de blog y clases de utilidad) desarrollados para explorar múltiples escenarios prácticos de pruebas de software.

---

## 🎯 Sobre el Sistema y Conceptos Clave

El proyecto se centra en la implementación de fundamentos esenciales para garantizar la calidad del software, abordando:

- **Creación y Organización:** Configuración y uso del framework JUnit 5, además de buenas prácticas estructurales (patrón Triple A, BDD).
- **Simulaciones (Mocks y Stubs):** Uso de objetos falsos y dobles de prueba con Mockito para aislar pruebas y eliminar dependencias externas.
- **Conjunto de Datos:** Patrones de diseño como Object Mother y Builder para trabajar de forma limpia con datos ficticios.
- **Análisis de Cobertura:** Configuración y uso de JaCoCo para descubrir brechas y garantizar que las reglas de negocio estén totalmente probadas.
- **Aserciones Avanzadas:** Implementación de AssertJ para hacer que las verificaciones sean más legibles, semánticas y encadenadas.

---

## 📁 Estructura del Proyecto

El código fuente es un proyecto basado en Maven, estructurado con el módulo de la aplicación dentro de la carpeta `backend`:

```text
aw-testes-junit5/
├── backend/
│   ├── src/
│   │   ├── main/java/      # Clases de producción (blog, ecommerce, utilidad)
│   │   └── test/java/      # Clases de prueba unitaria
│   ├── .mvn/               # Maven Wrapper
│   ├── mvnw / mvnw.cmd     # Ejecutables de Maven Wrapper
│   └── pom.xml             # Configuración de Maven y dependencias
├── .gitignore              # Archivo de reglas de ignorados de Git
├── LICENSE                 # Licencia del proyecto
├── README.md               # Documentación principal (Portugués)
├── README.en.md            # Documentación en Inglés
└── README.es.md            # Documentación en Español
```

---

## 🛠️ Tecnologías y Herramientas

- **Lenguaje y Framework:** Java 17+, JUnit 5
- **Build y Dependencias:** Apache Maven
- **Simulaciones (Mocks):** Mockito
- **Aserciones Fluentes:** AssertJ
- **Cobertura de Código:** JaCoCo
- **IDE Recomendada:** IntelliJ IDEA

<br />

<div align="center">

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=flat-square&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Apache_Maven-C71A36?style=flat-square&logo=apachemaven&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-Simulaciones-8A2BE2?style=flat-square)
![AssertJ](https://img.shields.io/badge/AssertJ-Aserciones-239120?style=flat-square)
![JaCoCo](https://img.shields.io/badge/JaCoCo-Cobertura_de_C%C3%B3digo-4D4D4D?style=flat-square)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat-square&logo=intellijidea&logoColor=white)

</div>

---

## 🍃 Sobre

Teoria y proyecto práctico desarrollado durante el curso **Pruebas Unitarias con JUnit** de la plataforma 🍃 **AlgaWorks**.

---

## 👤 Autor

Desarrollado por **Ivan Ferreira**.

Copyright © 2026 Ivan Ferreira. Todos los derechos reservados.
