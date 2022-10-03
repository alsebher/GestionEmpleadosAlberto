/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Alumno Mañana
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private static int contador;

    public Persona() {
        this.idPersona = ++Persona.contador;
    }

    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Persona.contador = contador;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
    
    
    

    
    
    

   
    
    
    
    
}
