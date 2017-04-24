package com.ejemplo

object Visibilidades extends App {
  
}

package vida {
   package trabajo {
      class Trabajador {
         private[trabajo] var proyectoAsignado = null
         private[vida] var nombre = null
         private[this] var salario = null

         def hablar(compi : Trabajador) {
            println(compi.proyectoAsignado)
            //println(compi.salario) //ERROR: A los compañeros no les cuento mi salario, que luego tienen envidia ;-)
         }
      }
      
      class Cliente {
        def hablar(subcontratado : Trabajador) {
          //println(subcontratado.salario) 
        }
      }
   }
   
   class Pareja {
     
     import com.ejemplo.vida.trabajo.Trabajador
     
     def hablar(pareja : Trabajador) {
          //println(pareja.proyectoAsignado) 
        }
   }
}