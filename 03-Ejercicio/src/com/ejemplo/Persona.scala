package com.ejemplo

class Persona (var nombre : String, private var _edad : Int){  
  
  //Accesor
  def edad = _edad
  
  //Mutator
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
  
  private var _numCuenta : String = numCuenta
  
  //Para solo escritura
  //def numCuenta = _numCuenta
  
  /*def numCuenta_=(numCuenta : String) {
    _numCuenta = numCuenta
  }*/
  
  //Debido a las restricciones, sería mas interesante renombrar el método a modificarMiNumeroDeCuentaA
  def modificarMiNumeroDeCuentaA(numCuenta : String) : Unit = {_numCuenta = numCuenta}
  
  override def toString() : String = {
    s"Cliente[nombre=$nombre,edad=$edad,numCuenta=${_numCuenta}]"
  }
  
}

class Agente (
    nombre : String, 
    edad : Int, 
    nomina: String) extends Persona(nombre, edad) {
  
}