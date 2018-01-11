package boletin16;

import com.sergio.persoas.Persoal.Persoal;
import java.util.Scanner;
public class Aplicacion {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Persoal persoal1 = new Persoal("Sergio","986986986");
       Academia alumno1 = new Academia(2018, "Sergio",8, persoal1);
        //System.out.println(alumno1.toString());

        //com.sergio.validar.Validacion.validar();
        System.out.println("Introduce la media de boletines hechos");
        boletin15.Boletins.setPorcentaxe(sc.nextInt());
        boletin15.Boletins.calcularMediaBoletins();
        System.out.println("Introduce la nota de la prueba practica");
        boletin15.ProbaPractica.setNota1ProbaPractica(sc.nextFloat());
        boletin15.ProbaPractica.calcularPorcentaxe();
        System.out.println("Introduce las 2 notas de las pruebas practicas");
        boletin15.ProbasEscritas.setNota1ProbaEscrita(sc.nextFloat());
        boletin15.ProbasEscritas.setNota2ProbaEscrita(sc.nextFloat());
        boletin15.ProbasEscritas.calcularMediaProbasEscritas();
        boletin15.ProbasEscritas.calcularPorcentaxe();
        System.out.println("Nota Final:"+(boletin15.ProbasEscritas.getPorcentaxePE())+(boletin15.ProbaPractica.getPorcentaxePP()));
        
        
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
