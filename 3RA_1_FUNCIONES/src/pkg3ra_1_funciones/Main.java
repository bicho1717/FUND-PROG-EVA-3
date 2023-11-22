/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg3ra_1_funciones;


/**
 *
 * @author invitado
 */
public class Main {

   public static void main(String[] args) {
      //LLamada a función o procedimiento
      imprimirMensaje("Hola mundo!!!!!!",5);
      
   }
   
   public static void imprimirMensaje(String mensaje, int cant){
      for (int i = 0; i < cant; i++) {
         System.out.println(mensaje);
      }
      System.out.println(mensaje);
      //No tiene return porque tiene void
   }
   
}
