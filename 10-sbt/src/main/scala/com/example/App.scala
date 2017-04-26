package com.example

import javax.validation.Validation
import com.ejemplo.Persona

object HelloWorld extends App {
  var factory = Validation.buildDefaultValidatorFactory
  var validator = factory.getValidator
  
  var p = new Persona("Victor",19)
  
  var errores = validator.validate(p)
  
  println(errores)
  
}
