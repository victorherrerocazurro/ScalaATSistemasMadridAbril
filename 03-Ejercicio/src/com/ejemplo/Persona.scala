package com.ejemplo

class Persona (var nombre : String, edad : Int){
  
  var _edad : Int = 0
  
  this.edad_=(edad)
  
  def edad() : Int = _edad
  
  def edad_=(edad : Int) : Unit = {
    if (edad >= 18)
      _edad = edad
    else
      throw new Exception("Edad no valida")
  }
  
}

class Cliente(
    nombre : String, 
    edad : Int, 
    numCuenta: String) extends Persona(nombre, edad) {
  
  var _numCuenta : String = null
  
  def numCuenta_=(numCuenta : String) : Unit = {_numCuenta = numCuenta}
  
}

class Agente (
    nombre : String, 
    edad : Int, 
    nomina: String) extends Persona(nombre, edad) {
  
}