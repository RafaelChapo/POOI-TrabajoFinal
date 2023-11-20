package model.DAO;

import java.util.ArrayList;
import model.Usuario;

public class Base {
public static ArrayList<Usuario> usuarios;
    
    public static void inicia(){
        
        usuarios = new ArrayList<>();
        
        Usuario usuario1 = new Usuario(1, "empleado", 'M', "22/05/1998", "984213501", "empleado@gmail.com", "124896531", "emplado", 1);
        Usuario usuario2 = new Usuario(2, "admin", 'M', "12/03/1990", "999632152", "admin@gmail.com", "896321456", "admin", 2);
        
        usuarios.add(usuario1);
        usuarios.add(usuario2);          
    }
}
