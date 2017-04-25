package com.ejemplo

import scala.collection.mutable.Seq
import scala.collection.mutable.ArrayBuffer

//1, 2, 3, 4, 5, 6, 7,  8,  9, 10, 11
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

object Fibonnacci extends App {
  def calcularElNesimoNumeroDeFibonnacci(n: Int): Int = {
    if (n == 0) {
      throw new Exception
    } else if (n <= 2){
      n - 1
    } else {
      calcularElNesimoNumeroDeFibonnacci(n-1) + calcularElNesimoNumeroDeFibonnacci(n-2) 
    }
  }
  
  def calcularElNesimoNumeroDeFibonnacciConPatternMatching(n: Int): Int = {
    n match {
      case 0 => throw new Exception("No hay elemento 0 en la serie Fibonacci")
      case n if n < 3 => n - 1
      case _ => calcularElNesimoNumeroDeFibonnacciConPatternMatching(n - 1) + calcularElNesimoNumeroDeFibonnacciConPatternMatching(n - 2)
    }
  }
  
  val rango = Vector.range(1, 11);
  
  var resultado = ArrayBuffer.empty[Int]
  
  for (item <- rango){
    resultado += calcularElNesimoNumeroDeFibonnacci(item)
  }
  
  println(resultado)

  //Aprovechando las funcionalidades del api de colecciones como map
  
  val fibonacci = rango.map(calcularElNesimoNumeroDeFibonnacci(_))
  
  rango.map(
      (i) => {
        calcularElNesimoNumeroDeFibonnacci(i)
     }
  )
  
  println(rango)
  println(fibonacci)
}