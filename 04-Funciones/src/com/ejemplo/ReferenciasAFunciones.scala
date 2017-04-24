package com.ejemplo

object ReferenciasAFunciones extends App {
  
  def funcion(): String = {
    println("Ejecutando la funcion"); 
    "Victor"
  }
  //Invocando la funcion
  ReferenciasAFunciones.funcion()
  
  var func : () => String = ReferenciasAFunciones.funcion
  
  println("Antes de ejecutar nada")
  
  println(func())
  
}