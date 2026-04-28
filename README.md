# Ejercicio 1: Calculadora Modular

Guia practica para trabajar Git con ramas, merges, conflictos y release.

## 1) Objetivo

Construir una calculadora modular en Java y practicar un flujo de trabajo ordenado con:

- `main`
- `develop`
- 3 ramas `feature/*`
- 1 rama `release/1.0`

Al finalizar, la version estable debe quedar publicada en `main` con el tag `v1.0`.

## 2) Requisitos previos

- Tener este repositorio clonado.
- Tener Git instalado y configurado.
- Saber crear ramas, hacer commits y resolver conflictos.

## 3) Consigna del ejercicio

Debes completar la logica de la calculadora a partir de `src/Main.java`.

### Que si debes hacer

- Implementar funcionalidades usando ramas `feature/*`.
- Integrar todo en `develop`.
- Abrir una rama `release/1.0` para cierre de version.
- Publicar version final en `main` y crear tag `v1.0`.

### Que no debes hacer

- No mergear ninguna `feature/*` directo a `main`.
- No saltear la rama `release/1.0`.
- No usar mensajes de commit genericos.

## 4) Ramas obligatorias

Minimo esperado en el historial:

- `main`
- `develop`
- `feature/suma-resta`
- `feature/multiplicacion-division`
- `feature/menu-validaciones`
- `release/1.0`

Puedes usar otros nombres en `feature/*`, pero deben ser claros y consistentes.

## 5) Flujo de trabajo (paso a paso)

1. Crear `develop` desde `main`.
2. Crear cada `feature/*` desde `develop`.
3. Desarrollar y committear en cada `feature/*`.
4. Mergear cada `feature/*` a `develop`.
5. Crear `release/1.0` desde `develop`.
6. Ajustar detalles finales en `release/1.0`.
7. Mergear `release/1.0` a `main`.
8. Crear el tag `v1.0` en `main`.
9. Mergear `release/1.0` de regreso a `develop`.

## 6) Conflicto intencional (obligatorio)

El conflicto debe ocurrir en el bloque `switch` de `src/Main.java`.

Para cumplir este punto:

- Al menos dos ramas `feature/*` deben modificar las mismas lineas del `switch`.
- Debe quedar registro de la resolucion del conflicto en el historial.

Importante: no se evalua evitar el conflicto, se evalua resolverlo bien.

## 7) Convencion de commits (obligatoria)

Formato obligatorio:

`<tipo>(<scope>): <descripcion en imperativo>`

Tipos permitidos:

- `feat`
- `fix`
- `docs`
- `refactor`
- `test`
- `chore`

### Ejemplos validos

- `feat(calculadora): agregar opcion de suma`
- `fix(calculadora): corregir validacion de division por cero`
- `docs(readme): aclarar flujo de release`

### Ejemplos invalidos

- `update`
- `cambios varios`
- `arreglo`

## 8) Errores que invalidan la entrega

- Mergear `feature/*` directo a `main`.
- No crear `release/1.0`.
- No crear el tag `v1.0`.
- No evidenciar conflicto/resolucion en el `switch`.
- Commits fuera de convencion.

## 9) Entregable

URL del fork en GitHub con historial limpio y completo.

## 10) Checklist de autoevaluacion

Antes de entregar, verifica:

- Estan todas las ramas obligatorias.
- No hay features mergeadas directo a `main`.
- Existe `release/1.0` y se mergeo correctamente.
- Existe tag `v1.0` en `main`.
- Se produjo y resolvio conflicto en `src/Main.java`.
- Todos los commits cumplen formato obligatorio.

Comandos utiles:

```bash
git log --graph --oneline --decorate --all
git branch
git tag
```
