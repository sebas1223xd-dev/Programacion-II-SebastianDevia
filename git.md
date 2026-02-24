# Parte Teórica - Git

## ¿Qué es Git?

Git es un sistema de control de versiones distribuido que permite registrar y administrar los cambios realizados en un proyecto a lo largo del tiempo.

---

## ¿Qué es un repositorio?

Un repositorio es el espacio donde Git almacena el historial del proyecto.  
A diferencia de una carpeta normal, guarda versiones anteriores y permite regresar a estados previos.

---

## Áreas principales de Git

1. Working Directory  
   Lugar donde editamos los archivos.

2. Staging Area  
   Área donde se preparan los cambios antes de confirmarlos.

3. Repository  
   Base de datos donde se almacenan los commits.

---

## Objetos internos de Git

- Blob: Contenido de archivos.
- Tree: Estructura de carpetas.
- Commit: Registro de cambios.
- Tag: Marca versiones específicas.

---

## Diferencia entre git fetch y git pull

- git fetch: Descarga cambios sin aplicarlos.
- git pull: Descarga y fusiona automáticamente.

---

## Ramas (Branch)

Una rama es una línea independiente de desarrollo que permite trabajar sin afectar la rama principal.

---

## Conflictos en merge

Ocurren cuando dos cambios modifican la misma línea de un archivo.  
Se resuelven editando manualmente el archivo afectado.

---

## Comandos para revisar historial

- git log
- git diff
- git show
