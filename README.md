💳 Cajero Automatizado en Java - Banco Doussett Première

Bienvenido al sistema de 'Cajero Automatizado', un proyecto educativo desarrollado en Java que simula de forma funcional y elegante un entorno bancario. Esta aplicación representa una interfaz de consola que permite realizar operaciones básicas como consultar saldo, depositar, retirar, cambiar NIP y revisar el historial de movimientos de una cuenta.

> Diseñado para fortalecer los principios de Programación Orientada a Objetos (POO), la lógica de control de flujos, la seguridad de datos, y la interacción con el usuario desde consola.

Objetivos del Proyecto

- Simular la experiencia de uso de un cajero automático real.
- Aplicar conceptos fundamentales de POO: clases, encapsulamiento, métodos, atributos.
- Reforzar estructuras de control, manejo de errores y validaciones.
- Brindar una experiencia de usuario clara, funcional y con seguimiento de historial.


> Estructura del Proyecto

```
CajeroAutomatizado/
│
├── Cuenta.java         # Lógica de la cuenta bancaria
├── Cajero.java         # Interfaz principal e interacción con el usuario
└── README.md           # Documentación del proyecto (tú estás aquí)
```

> Funcionalidades

- 🔐 Autenticación por NIP (con 3 intentos)
- 📊 Consulta de saldo en tiempo real
- 💵 Depósitos y retiros de efectivo
- 🔁 Cambio de NIP con confirmación
- 🧾 Historial completo de movimientos
- 👥 Manejo de múltiples cuentas de usuario

Ejecución del Programa

1. Asegúrate de tener [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-usuario/cajero-automatizado.git
   ```
3. Compila los archivos:
   ```bash
   javac Cajero.java Cuenta.java
   ```
4. Ejecuta el programa:
   ```bash
   java Cajero
   ```


> Ejemplo de Uso

```plaintext
╔════════════════════════════════╗
║     Banco Doussett Premiere    ║
║      Bienvenido al sistema     ║
╚════════════════════════════════╝

Seleccione su cuenta:
1. Jorge Doussett
2. Enrique Doussett
3. Ruiz Vargas
> 1

Ingrese su NIP de 4 dígitos:
> ****

=== MENÚ PRINCIPAL ===
1. Consulta de saldo
2. Retiro de efectivo
3. Depósito en efectivo
4. Cambiar NIP
5. Ver historial de movimientos
6. Salir
```

> Reflexión

Este proyecto no es solo un ejercicio de programación: es una declaración de principios sobre cómo se diseña, piensa y ejecuta una solución realista desde cero. Representa el puente entre la teoría académica y las aplicaciones prácticas del mundo real, donde el código se convierte en herramienta de innovación.


> Agradecimientos

A quienes aman aprender y crear desde cero. A los que ven en la programación una forma de transformar el mundo.

> “Dominar la tecnología no es solo programar. Es imaginar, crear, equivocarse, corregir, y finalmente construir.”


> Contacto

¿Tienes sugerencias, mejoras o simplemente te gustó el proyecto?

- GitHub: [@tu-usuario](https://github.com/tu-usuario)
- Email: tu-correo@example.com

---

🪪 Licencia

Este proyecto es de uso libre para fines educativos. Puedes modificarlo, mejorarlo o compartirlo siempre que mantengas el crédito correspondiente.

