/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajofinal;

/**
 *
 * @author USER
 */
public class peliculainterfaz {
    private String idpelicula;
    private String  nombre;
    private String genero;
    private String cartelera;
    private String clasificacion;

    public peliculainterfaz(String idpelicula, String nombre, String genero, String cartelera, String clasificacion) {
        this.idpelicula = idpelicula;
        this.nombre = nombre;
        this.genero = genero;
        this.cartelera = cartelera;
        this.clasificacion = clasificacion;
    }

    public String getIdpelicula() {
        return idpelicula;
    }

    public void setIdpelicula(String idpelicula) {
        this.idpelicula = idpelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCartelera() {
        return cartelera;
    }

    public void setCartelera(String cartelera) {
        this.cartelera = cartelera;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }           
    
    public Object [] toArray (){
        Object [] obj = new Object [5];
        obj[0]= idpelicula;
        obj[1]= nombre; 
        obj[2] = genero; 
        obj[3] = cartelera;       
        obj[4] = clasificacion;
               
         return obj;       
    }
    
    
    
}

