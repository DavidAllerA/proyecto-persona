
public class Persona
{
    // instance variables - replace the example below with your own
    private int edad;
    private String nombre;

    /**
     * Constructor for objects of class persona
     */
    public Persona(int laEdad, String elNombre)
    {
        // initialise instance variables
        edad = laEdad;
        nombre = elNombre;
    }
    public int getEdadPersona() {
        return edad;
    }
    public String getNombrePersona () {
        return nombre;
    }
    
    public void imprimirDetalles () {
        System.out.print("Nombre: " + nombre + ", Edad: " + edad);
    }
    public boolean esMayorDeEdad () {
        if (edad >= 18) {
            return true;
        }
        else {
            return false;
        }
        
    }
    public void cumplirAnos () {
        edad = edad+1;
    }
    
    public String obtenerEtapaDeVida () {
        
        if (edad >= 65) {
            return "Jubilado";
        }
        if (edad >= 18) {
            return "Adulto";
        }
        else {
            return "Menor de edad";
        }
        
    }
   
}