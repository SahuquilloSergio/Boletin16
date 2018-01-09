package boletin16;

import com.sergio.persoas.Persoal.Persoal;

/**
 *
 * @author Sauky
 */
public class Academia {
    
    private static int numReferencia=2018;
    private String nome;
    private float nota;
    Persoal alum;

    public Academia() {
    }

    public Academia(int numReferencia, String nome, float nota, Persoal alum) {
        this.numReferencia = numReferencia;
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setAlum(Persoal alum) {
        this.alum = alum;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public Persoal getAlum() {
        return alum;
    }

    @Override
    public String toString() {
        return "Academia" + "\nnumReferencia=" + numReferencia + "\nnome=" + nome + "\nnota=" + nota + "\nalum=" + alum;
    }
    
    
    
    
    
    
    
    
    
}
