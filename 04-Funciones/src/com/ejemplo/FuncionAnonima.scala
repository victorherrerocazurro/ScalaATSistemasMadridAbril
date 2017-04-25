package com.ejemplo

object FuncionAnonima extends App {
  
  def funcionNombrada(i : Int) : Boolean = {
    i % 2 == 0
  }
  
  var funcion = (i: Int) => i % 2 == 0
  
  funcion(2)
  
  def procesarNombreEdad(nombre1 : String, edad1 : Int) {
    println("En la nombrada")
    println(nombre1 + edad1)
  }
  
  def funcionDeOrdenMayor(
          funcion : (String, Int) => Unit, 
          nombre : String,
          edad : Int) {
    
    //Invocacion de la funcion que me han pasado por parametro
    funcion(nombre, edad)
  }
  
  funcionDeOrdenMayor(
      procesarNombreEdad,
      "Victor", 
      12)
      
  funcionDeOrdenMayor(
      (nombre : String, edad : Int) => {
        println("En la anonima")
        println(nombre + edad)
      },
      "Juan", 
      24)
}