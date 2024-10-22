package projetoManha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDono extends JFrame {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginDono() {
        setTitle("Login Dono");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel lblUsername = new JLabel("Usuário:");
        lblUsername.setBounds(10, 10, 80, 25);
        panel.add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(100, 10, 160, 25);
        panel.add(txtUsername);

        JLabel lblPassword = new JLabel("Senha:");
        lblPassword.setBounds(10, 40, 80, 25);
        panel.add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(100, 40, 160, 25);
        panel.add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 80, 160, 25);
        panel.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                if (username.equals("dono") && password.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Login Dono bem-sucedido");
                    new TelaDono().setVisible(true);
                    dispose();  // Fecha a tela de login
                } else {
                    JOptionPane.showMessageDialog(null, "Credenciais inválidas");
                }
            }
        });

        add(panel);
    }
}