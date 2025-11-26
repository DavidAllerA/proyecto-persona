
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
    
    public void imprimirSiEsMayorQue (int edadAComparar) {
        if (edad > edadAComparar) {
            System.out.print(nombre + " tiene mas de " + edadAComparar + " años");
        }
        else if (edad == edadAComparar) {
            System.out.print(nombre + " tiene " + edadAComparar + " años");
        }
        else {
            System.out.print(nombre + " tiene menos de " + edadAComparar + " años");
        }
        
    }
    
    public void diagnosticoDeVoto() {
        boolean puedeVotar;
        if (edad >= 18) {
            puedeVotar = true;
            System.out.print("Puede votar");
            
            if (edad < 60) {
                System.out.print(" y Votara a un partido progresista");
            }
            else {
              System.out.print(" y Votara a un partido conservador");  
            }
        }
            
        
        else {
            puedeVotar = false;
            System.out.print("No tiene edad para votar");
        }
        
    }
   
}