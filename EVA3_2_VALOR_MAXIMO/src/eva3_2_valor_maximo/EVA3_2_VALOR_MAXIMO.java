/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_valor_maximo;

/**
 *
 * @author invitado
 */
public class EVA3_2_VALOR_MAXIMO {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      //UTILIZAR EL VALOR DIRECTAMENTE DE LA FUNCIÓN
      System.out.println(buscarMaximo(100,200));
      //GUARDAR EL VALOR EN UNA VARIABLE
      int resu = buscarMaximo(100,200);
      System.out.println(resu);
      //LLAMAR A LA FUNCIÓN E IGNORAR EL RESULTADO
      buscarMaximo(100,200);
   }
   
   public static int buscarMaximo(int val1, int val2){
      int resultado;
      if(val1 > val2)
         resultado = val1;
      else
         resultado = val2;
      
      return resultado;
   }
   
}
