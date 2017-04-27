package com.ejemplo

object Perezoso extends App {
  println((1 to 1000000000).view.filter(_ % 2 == 0).take(1000000000).toList)
}