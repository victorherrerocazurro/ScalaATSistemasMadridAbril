package com.ejemplo

object InvocacionParcial extends App {
  
  def saludo(prefijo : String = "Hola ", sufijo : String = "!!!!", nombre : String) {
    println(prefijo + nombre + sufijo)
  }
  
  val prefijo = "Hola "
  val sufijo = "!!!!"
  
  saludo(nombre = "Victor")
  
  saludo(nombre = "Juan")
  
  saludo(nombre = "Maria")
  
  saludo(prefijo = "Adios ",nombre = "Maria")
  
  var saludoInicial = saludo("Hola ", "!!!!", _ : String)
  
  saludoInicial("Victor")
  saludoInicial("Juan")
  saludoInicial("Maria")
  
  var saludoDespedida = saludo("Adios ", "", _ : String)
  
  saludoDespedida("Victor")
  saludoDespedida("Juan")
  saludoDespedida("Maria")
  
  
}