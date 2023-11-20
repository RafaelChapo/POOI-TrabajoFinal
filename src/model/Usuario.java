package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuario {
    private int id;
    private String nombre; 
    private char sexo; 
    private Date fechaNacimiento; 
    private String telefono;
    private String email; 
    private String dni;
    private String contrasena;
    private int nivelAcceso;

    public Usuario(int id, String nombre, String contrasena, int nivelAcceso) {
        this.id = id;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.nivelAcceso = nivelAcceso;
    }
    
    

    public Usuario(int id, String nombre, char sexo, String fechaNacimiento, String telefono, String email, String dni, String contrasena, int nivelAcceso) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.telefono = telefono;
        this.email = email;
        this.dni = dni;
        this.contrasena = contrasena;
        this.nivelAcceso = nivelAcceso;
        
        try {
            this.fechaNacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fechaNacimiento);
        } catch (ParseException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", email=" + email + ", dni=" + dni + ", contrasena=" + contrasena + ", nivelAcceso=" + nivelAcceso + '}';
    }
    
}
