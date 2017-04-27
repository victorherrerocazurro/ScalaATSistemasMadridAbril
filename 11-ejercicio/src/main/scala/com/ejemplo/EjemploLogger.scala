

package com.ejemplo

import org.apache.commons.logging.LogFactory

object EjemploLogger extends App {
  var log = LogFactory.getLog(getClass)
  
  log.info("Mensajito de log")
}