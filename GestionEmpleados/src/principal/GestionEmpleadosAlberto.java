/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import dominio.Persona;
/**
 *
 * @author Alumno Mañana
 */
public class GestionEmpleadosAlberto {
    public static void main(String[] args) {
        Persona t1 = new Persona("Marco","Asensio");
        Persona t2 = new Persona("Lil","Uzi");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
