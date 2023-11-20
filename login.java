import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class InterfazLogin extends JFrame {

    private static final long serialVersionUID = 1L;
    private Map<String, String> usuarios;

    public InterfazLogin() {
        // Inicializar la base de datos de usuarios
        usuarios = new HashMap<>();
        usuarios.put("usuario1", "contrasena1");
        usuarios.put("usuario2", "contrasena2");
        usuarios.put("usuario3", "contrasena3");

        // Configurar la interfaz gráfica
        setTitle("Login - Cine");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear componentes
        JLabel labelUsuario = new JLabel("Usuario:");
        JLabel labelContrasena = new JLabel("Contraseña:");
        JTextField campoUsuario = new JTextField(15);
        JPasswordField campoContrasena = new JPasswordField(15);
        JButton botonIniciarSesion = new JButton("Iniciar Sesión");

        // Configurar el diseño de la interfaz
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Agregar componentes a la interfaz
        add(labelUsuario);
        add(campoUsuario);
        add(labelContrasena);
        add(campoContrasena);
        add(botonIniciarSesion);

        // Configurar el evento de clic para el botón de inicio de sesión
        botonIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String contrasena = new String(campoContrasena.getPassword());

                // Verificar las credenciales
                if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena)) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. ¡Bienvenido, " + usuario + "!");
                    dispose(); // Cerrar la ventana después del inicio de sesión exitoso
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Inténtelo de nuevo.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazLogin ventana = new InterfazLogin();
                ventana.setVisible(true);
            }
        });
    }
}

