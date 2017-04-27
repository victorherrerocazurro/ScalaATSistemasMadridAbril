package com.ejemplo

object MetodosImplicitos extends App {
  
  //Tipologia que pretende extender las caracteristicas del tipo *Int* de Scala
  class MyInteger(i: Int) {
    def myNewMethod = println("hello from myNewMethod " + i)
  }

  //Wrapper implicito, que permite convertir un Int en un MyInteger, para permitir que se puedan invocar funcionalidades de MyInteger desde un Int
  implicit def int2MyInteger(i: Int) = new MyInteger(i)

  //Se esta empleando de forma implicita la conversion a MyInteger
  1.myNewMethod
}