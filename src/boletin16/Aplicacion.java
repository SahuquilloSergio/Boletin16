package boletin16;

import com.sergio.persoas.Persoal.Persoal;
public class Aplicacion {

    public static void main(String[] args) {
       Persoal persoal1 = new Persoal("Sergio","986986986");
       Academia alumno1 = new Academia(2018, "Sergio",8, persoal1);
        System.out.println(alumno1.toString());
        System.out.println(alumno1.calcularNota());
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
