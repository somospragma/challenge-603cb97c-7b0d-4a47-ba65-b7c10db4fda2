# Gestión de Flujos de Eventos en Sistema de Pagos

El sistema de pagos de una fintech necesita procesar transacciones provenientes de múltiples canales (API REST, webhooks, mensajes de Kafka) de manera resiliente y escalable. Cada transacción debe ser registrada con un identificador único y persistida en una base de datos. El sistema debe ser capaz de manejar picos de carga y recuperarse de fallos temporales en los servicios externos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Programación Reactiva |
| **Nivel** | junior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Registro de Transacciones

**Objetivo:** Implementar la funcionalidad para registrar transacciones con identificador único y persistirlas en la base de datos.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identificar los canales de entrada de transacciones.
- Definir un identificador único para cada transacción.
- Persistir cada transacción en la base de datos.
- Garantizar que cada transacción se registre una sola vez (idempotencia).

**Entregable:** Sistema que registra transacciones con identificador único y las persiste en la base de datos.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo manejar la concurrencia y la idempotencia.
- Piensa en cómo garantizar que el sistema pueda recuperarse de fallos temporales.

</details>

### Fase 2: Manejo de Flujos de Eventos

**Objetivo:** Implementar la funcionalidad para manejar flujos de eventos provenientes de múltiples orígenes de manera resiliente y escalable.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Identificar los diferentes orígenes de eventos.
- Implementar la lógica para procesar eventos de manera asíncrona.
- Garantizar que el sistema pueda manejar picos de carga y recuperarse de fallos temporales en los servicios externos.

**Entregable:** Sistema que maneja flujos de eventos provenientes de múltiples orígenes de manera resiliente y escalable.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de operadores reactivos para manejar los flujos de eventos.
- Piensa en cómo implementar backpressure para manejar picos de carga.

</details>

### Fase 3: Resiliencia y Escalabilidad

**Objetivo:** Implementar la funcionalidad para garantizar la resiliencia y escalabilidad del sistema ante fallos temporales y picos de carga.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los puntos de fallo del sistema.
- Implementar la lógica para recuperarse de fallos temporales en los servicios externos.
- Asegurar que el sistema pueda manejar picos de carga sin degradar el rendimiento.

**Entregable:** Sistema que garantiza la resiliencia y escalabilidad ante fallos temporales y picos de carga.

<details>
<summary>Pistas de conocimiento</summary>

- Considera el uso de patrones de diseño para mejorar la resiliencia y escalabilidad.
- Piensa en cómo implementar retry y fallback para recuperarse de fallos temporales.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son los operadores reactivos y cómo se usan en la gestión de flujos de eventos?
- **paraQueSirve**: ¿Para qué sirve el manejo de backpressure en un sistema de pagos?
- **comoSeUsa**: ¿Cómo se usa la idempotencia en el registro de transacciones?
- **erroresComunes**: ¿Cuáles son los errores comunes al manejar flujos de eventos y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la implementación de resiliencia y escalabilidad en un sistema de pagos?

## Criterios de Evaluacion

- Implementar la funcionalidad para registrar transacciones con identificador único y persistirlas en la base de datos.
- Implementar la funcionalidad para manejar flujos de eventos provenientes de múltiples orígenes de manera resiliente y escalable.
- Implementar la funcionalidad para garantizar la resiliencia y escalabilidad del sistema ante fallos temporales y picos de carga.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
