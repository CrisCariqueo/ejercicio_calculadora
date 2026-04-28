# Ejercicio 1 - Calculadora Modular (Base del proyecto)

Este repositorio es una plantilla para practicar flujo de trabajo con Git (ramas, merges, conflictos y release).

## Objetivo

Construir una calculadora modular en Java trabajando con ramas `feature/*` sobre `develop`, integrando una rama `release/1.0` y publicando la version final en `main` con tag `v1.0`.

## Punto de partida

- Proyecto Java base en `src/Main.java`.
- El codigo inicial **no resuelve el ejercicio**; solo deja la estructura para que el equipo lo complete.
- El conflicto intencional debe producirse en el bloque `switch` de `Main.java`.

## Ramas obligatorias

- `main`
- `develop`
- 3 ramas `feature/*`
- 1 rama `release/1.0`

Ejemplo de nombres validos para features:

- `feature/suma-resta`
- `feature/multiplicacion-division`
- `feature/menu-validaciones`

## Flujo obligatorio

1. Crear `develop` desde `main`.
2. Crear cada `feature/*` desde `develop`.
3. Mergear cada `feature/*` a `develop` (nunca directo a `main`).
4. Crear `release/1.0` desde `develop`.
5. Mergear `release/1.0` a `main`.
6. Crear tag `v1.0` sobre `main`.
7. Mergear `release/1.0` de regreso a `develop`.

## Conflicto intencional (obligatorio)

Durante el trabajo en features, al menos dos ramas deben editar las mismas lineas del `switch` en `Main.java` para forzar un conflicto real de merge.

No se evalua evitar el conflicto; se evalua **resolverlo correctamente**.

## Convencion de commits (obligatoria)

Formato:

`<tipo>(<scope>): <descripcion en imperativo>`

Tipos permitidos:

- `feat`
- `fix`
- `docs`
- `refactor`
- `test`
- `chore`

Ejemplos:

- `feat(calculadora): agregar opcion de suma en el menu`
- `fix(calculadora): corregir validacion de division por cero`
- `docs(readme): detallar flujo de release`

Reglas:

- No usar mensajes vagos como `update`, `cambios`, `arreglo`.
- Un commit debe representar un cambio logico concreto.
- Mantener consistencia de idioma y estilo.

## Criterios de evaluacion del historial

- Se respetan las ramas requeridas.
- No hay merges de `feature/*` directos a `main`.
- Existe evidencia del conflicto y su resolucion en el historial.
- El release pasa por `release/1.0`.
- Existe tag `v1.0` en la version final.
- Commits cumplen la convencion obligatoria.

## Entregable

URL del fork con historial limpio y completo.

## Comandos utiles de verificacion

```bash
git log --graph --oneline --decorate --all
git branch
git tag
```
