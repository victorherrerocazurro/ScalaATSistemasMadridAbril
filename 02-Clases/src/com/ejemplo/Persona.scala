package com.ejemplo

object Aplicaicon extends App {
  var p = new Persona("Juan")
  
  p.nombre = "Victor"
}

//Getter y Setter
class Persona(var nombre: String) {
  
  //private String nombre;
  
  //Pesona(nombre)
  
  //getNombre
  
  //setNombre
}

//Getter
class Cliente(val nombre: String) {
  //private String nombre;
  
  //Pesona(nombre)
  
  //getNombre
}

//Parametro de construccion, que se alamcena deforma interna en la clase para su uso interno (privado)
class Empleado(nombre: String) {
  //private String nombre;
  
  //Pesona(nombre)
}

//Parametro de construccion, que se almacena de forma interna en la clase para su uso interno (privado)
//y en este caso tendremos un atributo de lectura/escritura (var) que es privado, que podemos encapsular con Accesor y Mutator
class Agente(nombre: String) {
  //private String nombre;
  
  private var _nombre = nombre
  
  //Pesona(nombre)
  
  def nombre(nombre : String): Unit = _nombre = nombre
  
  def nombre() : String = _nombre
  
}