package com.sergio.persoas.Persoal;

/**
 *
 * @author Sauky
 */
public class Persoal {
    
    private String telefono;
    private String correo;

    public Persoal() {
    }

    public Persoal(String telefono, String correo) {
        this.telefono = telefono;
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Persoal" + "\ntelefono=" + telefono + "\ncorreo=" + correo;
    }
    
    
    
    
    
    
    
    
}
