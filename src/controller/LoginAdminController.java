package controller;

import PRINCIPAL.LoginAdmin;
import model.DAO.UsuarioDAO;
import model.Usuario;

public class LoginAdminController {
private final LoginAdmin formLogin;   
    private UsuarioDAO userDao;
    
    public LoginAdminController(LoginAdmin view) {
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
