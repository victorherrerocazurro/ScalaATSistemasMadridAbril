package com.ejemplo

object AzucarSintactico extends App {
  
  //Definiendo una funcion sin parametros
  def sinParametros() : Unit = {
    
  }
  
  //Definiendo una funcion sin parametros
  def sinParametrosSinParentesis : Unit = {
    
  }
  
  //Invocando una funcion sin parametros definada con ()
  sinParametros()
  
  //Creandoun alias de la funcion
  var nuevaFuncion : () => Unit = sinParametros
  
  nuevaFuncion()
  
  //Invocando una funcion sin parametros definada sin ()
  sinParametrosSinParentesis
  
  def retornaUnit(nombre : String) {
    nombre
  }
  
  def retornaString(nombre: String, edad : Int) = {
    ""
  }
  
  AzucarSintactico.retornaUnit("")
  
  retornaUnit("")
  
  AzucarSintactico retornaUnit ""
  
  //retornaUnit ""
  
  AzucarSintactico.retornaString("", 2)
  
  //AzucarSintactico retornaString "", 2
  
}