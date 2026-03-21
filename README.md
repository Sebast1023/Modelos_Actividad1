# Modelos_Actividad1

Integrantes

- Yhoan Mauricio Bermudez Tique (20242020242)

- Sebastian David Trujillo Vargas (20242020217)

- David Felipe Batanero Molina (20241020092)

Descripción del Ejercicio

Este proyecto consiste en el modelado de un sistema orientado a objetos que representa la estructura y funcionamiento de un grupo musical que participa en distintos eventos o fiestas.

El objetivo principal es aplicar conceptos fundamentales de Programación Orientada a Objetos (POO) y modelado UML, tales como:

- Clases y atributos
- Métodos
- Interfaces
- Asociaciones
- Agregación
- Multiplicidad
- Delegación de responsabilidades

---

Estructura del Modelo

El sistema está compuesto por las siguientes clases principales:

GrupoMusical

Representa el conjunto de músicos que conforman el grupo.
Contiene un arreglo (o lista) de músicos y permite agregar integrantes y ejecutar la acción de tocar como conjunto.

Músico (clase abstracta)

Representa a cada integrante del grupo.

Instrumentista

Hereda de músico y tiene un instrumento que toca

Cantante

Hereda de músico y solo canta

Instrumento (Interfaz)

Define el comportamiento general que todo instrumento debe implementar, específicamente el método "tocar()".

Afinable (Interfaz)

Define el comportamiento "afinar()", el cual solo es implementado por aquellos instrumentos que requieren afinación.
Esto permite un diseño más flexible y evita forzar métodos innecesarios en clases que no lo requieren.

Fiesta

Representa el evento donde el grupo musical se presenta.
Contiene una referencia al grupo musical contratado y puede iniciar el evento.

---

Relaciones Entre Clases

- Existe una agregación entre "GrupoMusical" y "Musico", ya que el grupo está compuesto por músicos, pero estos pueden existir independientemente.
- Existe una asociación entre "Instrumentista" e "Instrumento", ya que cada Instrumentista utiliza un instrumento.
- "Instrumento" es implementada por clases concretas como "Guitarra", "Bateria", "Piano" y "Maracas".
- Algunos instrumentos implementan adicionalmente la interfaz "Afinable".
- "Fiesta" se asocia con "GrupoMusical", ya que una fiesta contrata a un grupo.

---

Diagrama UML

El diagrama de clases que representa el modelo puede visualizarse en la imagen o accederse directamente mediante el enlace a Mermaid.

```mermaid
---
config:
  layout: elk
---
classDiagram
direction TB
class GrupoMusical {
	-nombre : String
	-genero : String
	-musicos : List
	+agregarMusico(m: Musico)
	+tocar()
}

class Musico {
	-nombre : String
	-edad : int
	+actuar()
}

class Instrumentista {
	-instrumento : Instrumento
	+actuar()
}

class Cantante {
	+actuar()
}

class Fiesta {
	-nombre : String
	-ubicacion : String
	-fecha : String
	-grupoMusical : GrupoMusical
	+iniciar()
	+contratarGrupo(g: GrupoMusical)
}

class Instrumento {
	+tocar()
}

class Afinable {
	+afinar()
}

class Guitarra {
}

class Bateria {
}

class Piano {
}

class Maracas {
}

<<abstract>> Musico
<<interface>> Instrumento
<<interface>> Afinable

GrupoMusical "1" o-- "1..*" Musico : tiene
GrupoMusical "1" <-- "0..*" Fiesta : contrata
Musico <|-- Cantante
Musico <|-- Instrumentista
Instrumentista "1" o-- "1" Instrumento : tiene
Instrumento <|.. Guitarra
Instrumento <|.. Bateria
Instrumento <|.. Maracas
Instrumento <|.. Piano
Afinable <|.. Guitarra
Afinable <|.. Piano
```

[Link mermaid](https://mermaid.ai/d/5e0c97cc-1f04-449a-b1a1-717b3c54f549)
