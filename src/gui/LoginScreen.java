package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen {
    public static void main(String[] args) {
        // JFrame oluştur
        JFrame frame = new JFrame("Login Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Kullanıcı adı etiketi ve metin kutusu
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        frame.add(userLabel);

        JTextField userTextField = new JTextField();
        userTextField.setBounds(150, 50, 150, 30);
        frame.add(userTextField);

        // Şifre etiketi ve şifre kutusu
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        frame.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        frame.add(passwordField);

        // Giriş düğmesi
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        frame.add(loginButton);

        // Durum etiketi
        JLabel statusLabel = new JLabel("");
        statusLabel.setBounds(50, 200, 300, 30);
        statusLabel.setForeground(Color.RED);
        frame.add(statusLabel);

        // Login düğmesi tıklama olayını dinle
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userTextField.getText();
                String password = new String(passwordField.getPassword());

                // Basit kullanıcı doğrulama
                if (username.equals("admin") && password.equals("1234")) {
                    statusLabel.setText("Login successful!");
                    statusLabel.setForeground(Color.GREEN);
                } else {
                    statusLabel.setText("Invalid username or password.");
                    statusLabel.setForeground(Color.RED);
                }
            }
        });

        // Pencereyi görünür yap
        frame.setVisible(true);
    }
}
