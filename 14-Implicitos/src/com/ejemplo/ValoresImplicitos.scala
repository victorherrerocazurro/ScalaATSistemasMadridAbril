package com.ejemplo

object ValoresImplicitos extends App {

  def metodo(parametroNormal: Int)(implicit parametroImplicito: ParametroImplicito,
                                   otroParametroImplicito: OtroParametroImplicito): Unit = {
    println(parametroNormal + "-" +
      parametroImplicito.i + "-" +
      otroParametroImplicito.i)
  }

  def PrimerContexto() {
    import Contexto._

    /*implicit val valorDeContexto = ParametroImplicito(12)
  	implicit val otroValorDeContexto = OtroParametroImplicito(27)*/

    println(metodo(123))
  }
  
  def SegundoContexto() {
    implicit val valorDeContexto = ParametroImplicito(456)
  	implicit val otroValorDeContexto = OtroParametroImplicito(7)

    println(metodo(12))
  }

  PrimerContexto()
  SegundoContexto()
}

case class ParametroImplicito(i: Int)
case class OtroParametroImplicito(i: Int)

object Contexto {
  implicit val valorDeContexto: ParametroImplicito = ParametroImplicito(12)
  implicit val otroValorDeContexto: OtroParametroImplicito = OtroParametroImplicito(27)
}