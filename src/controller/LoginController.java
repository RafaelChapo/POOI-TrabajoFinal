package controller;

import PRINCIPAL.Login;
import model.DAO.UsuarioDAO;
import model.Usuario;

public class LoginController {
private final Login formLogin;   
    private UsuarioDAO userDao;
    
    public LoginController(Login view) {
        this.formLogin = view;
    }

    public Usuario loginSistema(Usuario usuario){
       Usuario u;
       userDao = new UsuarioDAO();
       u = userDao.seleccionaPorNombreContrasena(usuario);
       
        if(u != null){
           return u; 
       }
       return null; 
    }
}
