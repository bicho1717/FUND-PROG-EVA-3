/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_f;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_8_f {

    final static String USUARIO = "TUTI";
    final static String PASSWORD = "FRUTITUTI";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usu;
        String pwd;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Usuario: ");
            usu = input.nextLine();
            System.out.println("Contraseña: ");
            pwd = input.nextLine();

        } while (!validarUsuario(usu, pwd));
        System.out.println("Bienvenido al sistema");
    }

    public static boolean validarUsuario(String usuario, String pwd) {
        if (usuario.equals(USUARIO) && pwd.equals(PASSWORD)) 
            return true;
         else 
            return false;
    }   
}



