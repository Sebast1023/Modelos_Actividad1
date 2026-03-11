from abc import ABC, abstractmethod


# ----- Interfaces -----

class Instrumento(ABC):
    @abstractmethod
    def tocar(self):
        pass


class Afinable(ABC):
    @abstractmethod
    def afinar(self):
        pass


# ----- Instrumentos concretos -----

class Guitarra(Instrumento, Afinable):
    def tocar(self):
        print("La guitarra está sonando 🎸")

    def afinar(self):
        print("Afinando la guitarra...")


class Bateria(Instrumento, Afinable):
    def tocar(self):
        print("La batería está sonando 🥁")

    def afinar(self):
        print("Ajustando la batería...")


class Piano(Instrumento, Afinable):
    def tocar(self):
        print("El piano está sonando 🎹")

    def afinar(self):
        print("Afinando el piano...")


class Maracas(Instrumento):
    def tocar(self):
        print("Las maracas están sonando 🪇")


# ----- Clases principales -----

class Musico:
    def __init__(self, nombre, edad, instrumento: Instrumento):
        self.nombre = nombre
        self.edad = edad
        self.instrumento = instrumento

    def tocar(self):
        print(f"{self.nombre} está tocando su instrumento.")
        self.instrumento.tocar()


class GrupoMusical:
    def __init__(self, nombre, genero):
        self.nombre = nombre
        self.genero = genero
        self.musicos = []

    def agregar_musico(self, musico: Musico):
        self.musicos.append(musico)
        print(f"{musico.nombre} se unió al grupo {self.nombre}.")

    def tocar(self):
        print(f"\nEl grupo {self.nombre} empieza a tocar:")
        for musico in self.musicos:
            musico.tocar()

    def presentarse(self, fiesta):
        print(f"El grupo {self.nombre} se presentará en {fiesta.nombre}.")


class Fiesta:
    def __init__(self, nombre, ubicacion, fecha):
        self.nombre = nombre
        self.ubicacion = ubicacion
        self.fecha = fecha
        self.grupo_musical = None

    def contratar_grupo(self, grupo: GrupoMusical):
        self.grupo_musical = grupo
        print(f"{grupo.nombre} fue contratado para la fiesta {self.nombre}.")

    def iniciar(self):
        print(f"\n🎉 La fiesta '{self.nombre}' ha comenzado en {self.ubicacion}.")
        if self.grupo_musical:
            self.grupo_musical.tocar()
        else:
            print("No hay grupo musical contratado.")


# ----- Ejemplo de uso -----

if __name__ == "__main__":
    # Instrumentos
    guitarra = Guitarra()
    bateria = Bateria()
    maracas = Maracas()

    # Músicos
    musico1 = Musico("Carlos", 25, guitarra)
    musico2 = Musico("Ana", 23, bateria)
    musico3 = Musico("Luis", 28, maracas)

    # Grupo musical
    grupo = GrupoMusical("Los Modelos", "Rock")
    grupo.agregar_musico(musico1)
    grupo.agregar_musico(musico2)
    grupo.agregar_musico(musico3)

    # Fiesta
    fiesta = Fiesta("Fiesta Universitaria", "Bogotá", "2026-03-11")
    fiesta.contratar_grupo(grupo)

    # Iniciar fiesta
    fiesta.iniciar()