# 🔐 KMP Password Manager

[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.x-blue?logo=kotlin)](https://kotlinlang.org/)
[![Compose Multiplatform](https://img.shields.io/badge/Compose-Multiplatform-orange?logo=jetpackcompose)](https://www.jetbrains.com/lp/compose-multiplatform/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

**KMP Password Manager** es una app de gestión de contraseñas desarrollada con **Kotlin Multiplatform (KMP)**. Su objetivo es permitir a los usuarios almacenar, generar y administrar contraseñas de forma segura desde cualquier dispositivo, compartiendo una única base de código entre Android e iOS.

---

## 🚀 Características

- ✅ Desarrollo con **Kotlin Multiplatform**
- 🎨 UI moderna y responsiva con **Jetpack Compose Multiplatform**
- 🔒 Almacenamiento seguro de contraseñas
- ☁️ Sincronización con **Firebase**
- 🌙 Modo oscuro nativo
- 🧠 Arquitectura **MVVM + Clean Architecture**
- ⚙️ Inyección de dependencias con **Koin** o **Hilt**
- 📱 Soporte para Android e iOS

---

## 📦 Tecnologías

- Kotlin Multiplatform
- Jetpack Compose Multiplatform
- Firebase Authentication + Firestore
- Kotlinx Serialization
- Koin (o Hilt)
- Gradle con Kotlin DSL

---

## 📁 Estructura del Proyecto

```plaintext
.
├── composeApp/         # Capa de presentación multiplataforma (Jetpack Compose)
├── iosApp/             # Entrada específica para iOS
├── androidApp/         # (opcional, si tienes una app Android separada)
├── shared/             # Lógica compartida (ViewModels, UseCases, etc.)
├── gradle/             # Configuración de Gradle
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
