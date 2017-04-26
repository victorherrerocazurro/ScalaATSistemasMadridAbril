package com.ejemplo

object ConversorMonedas extends App {
  
  val factorDeConversionEuroDollar = 1.09403
  
  val factorConversionDollarYen = 110.889332
  
  def euroDollar(euro : Double) : Double = {
    euro * factorDeConversionEuroDollar
  }
  
  def dollarYen(dolar : Double) : Double = {
    dolar * factorConversionDollarYen
  }
  
  //Definicion de composer generico para cualquier intercambio de 
  //monedas
  def composicionConversionMonetaria(
      deMonedaOrigenAIntermedia : (Double) => Double,
      deMonedaIntermediaADestino : (Double) => Double
  ) = (origen : Double) => {
     
    deMonedaIntermediaADestino(deMonedaOrigenAIntermedia(origen)) 
    
  } : Double
  
  //EuroAYen
  
  var euroYen = composicionConversionMonetaria(
                                      euroDollar, dollarYen)
  
  println(euroYen(12))
  
  def composicionConversionMonetariaPrima(
      deMonedaOrigenAIntermedia : (Double) => Double,
      deMonedaIntermediaADestino : (Double) => Double,
      origen : Double) : Double = {
     
    deMonedaIntermediaADestino(deMonedaOrigenAIntermedia(origen)) 
    
  } 
  
  var euroYenPrima = composicionConversionMonetariaPrima(
                                      euroDollar, dollarYen, _ : Double)
                                      
  println(euroYenPrima(12))
                                      
  
}