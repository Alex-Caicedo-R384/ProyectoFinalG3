# ProyectoFinalG3

Proyecto desarrollado para la materia **ISWZ3208 - Calidad de Software**, enfocado en la aplicación de técnicas de aseguramiento de calidad en una aplicación Java.

## 👨‍💻 Autores

- Gustavo Caicedo  
- Ismael Corrales  
- Wilson Lozada  
- Alejandro Haro

## 📁 Estructura del Proyecto

```
ProyectoFinalG3/
├── src/
│   ├── main/java/       # Código fuente principal
│   └── test/java/       # Pruebas unitarias
├── docs/                # Documentación e informes generados
│   └── reportes/        # Reportes de herramientas de análisis
├── pom.xml              # Configuración de Maven y plugins
```

## 🛠 Herramientas de Calidad Utilizadas

El proyecto aplica varias herramientas de análisis estático y cobertura de pruebas:

- ✅ **Checkstyle**: Verifica el cumplimiento de estándares de codificación (Google Style).
- 🐞 **SpotBugs**: Detecta errores potenciales en el código fuente.
- 📊 **JaCoCo**: Genera métricas de cobertura de pruebas unitarias.

## 🚀 Instrucciones de Uso

### Compilación y ejecución de pruebas

```bash
mvn clean install
```

### Generación de reportes de calidad

```bash
mvn checkstyle:check spotbugs:check jacoco:report
```

### Visualización de reportes

Una vez ejecutados los comandos, los reportes se encuentran en:

- `target/site/checkstyle.html`
- `target/site/spotbugs.html`
- `target/site/jacoco/index.html`

Puedes copiarlos a la carpeta de documentación para entrega:

```bash
mkdir -p docs/reportes
xcopy /s /y target\site\checkstyle.html docs\reportes\
xcopy /s /y target\site\spotbugs.html docs\reportes\
xcopy /s /y target\site\jacoco docs\reportes\jacoco\
```

> 💡 Asegúrate de haber ejecutado los análisis antes de copiar los archivos.
