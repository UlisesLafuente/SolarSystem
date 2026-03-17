# Sistema Solar

### **Contexto**

La Agencia Espacial está desarrollando un sistema para gestionar los cuerpos celestes del sistema solar.

Se desea representar digitalmente los diferentes objetos que lo componen, incluyendo **planetas, estrellas y lunas**, con sus características propias.

---

###  **Objetivo**

Implementar un programa en **Java** que permita **registrar cuerpos celestes** del sistema solar y **consultar sus detalles**.

>  No es necesario usar una base de datos ni una interfaz gráfica.
>
>
> El correcto funcionamiento del sistema puede demostrarse en el método `main()` o mediante **pruebas unitarias**.
>
> Para resolver este ejercicio se espera que apliques principios de **programación orientada a objetos**, incluyendo **herencia**, **polimorfismo** e **interfaces**. Diseña una jerarquía de clases adecuada para modelar los cuerpos celestes y reutiliza código siempre que sea posible.
>

---

###  1 - Registro de cuerpos celestes

El sistema debe permitir registrar diferentes tipos de **cuerpos celestes** con los siguientes atributos generales:

- **Nombre** del cuerpo celeste.
- **Diámetro** (en kilómetros).
- **Duración del día** (en horas).

Cada tipo de cuerpo celeste tiene **atributos específicos**:

| Tipo | Atributos Específicos |
| --- | --- |
| **Planeta** | Número de lunas, presencia de atmósfera (`true/false`) |
| **Estrella** | Temperatura superficial (en K), tipo espectral |
| **Luna** | Planeta al que orbita (nombre), superficie rocosa (`true/false`) |

---

###  2 - Descripción científica

Cada cuerpo celeste debe implementar su propia descripción científica, generada dinámicamente a partir de sus atributos.

Ejemplos:

-  **Planeta**

  “La Tierra tiene un diámetro de 12,742 km y posee una atmósfera. Cuenta con 1 luna.”

-  **Estrella**

  “El Sol es una estrella tipo G2V con una temperatura superficial de 5,778 K. Es la fuente principal de energía del sistema solar.”

-  **Luna**

  “La Luna orbita alrededor de la Tierra. Su superficie es rocosa y su diámetro es de 3,474 km.”


>  Estas descripciones deben ser generadas desde un método específico en cada clase.
>

---

###  3 - Consultas

El sistema debe permitir realizar las siguientes operaciones:

1. **Listar todos los cuerpos celestes registrados** con su descripción.
2. **Filtrar planetas que tengan atmósfera**.
3. **Filtrar lunas que orbiten un planeta específico** (por nombre).

---

###  4 - Cuerpos habitables

Algunos cuerpos celestes, como ciertos **planetas** o **lunas**, son considerados potencialmente **habitables**.

Se ha creado la siguiente clase para imprimir informes de habitabilidad:

```java
public class HabitabilityPrinter {
    public void printReport(Habitable body) {
        System.out.println("Habitability Analysis:");
        System.out.println(body.getHabitabilityReport());
    }
}
```

Haz que los planetas y  las lunas sean compatibles con esta funcionalidad.