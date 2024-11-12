import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tugas3_B1 {
    public static void main(String[] args) {
        // Membuat frame utama
        JFrame frame = new JFrame("Login and Register");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Mengatur CardLayout untuk mengganti antar form
        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);

        // Panel Login
        JPanel loginPanel = new JPanel(new BorderLayout());
        loginPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        loginPanel.setBackground(new Color(230, 240, 250));

        JLabel loginLabel = new JLabel("LOGIN", SwingConstants.CENTER);
        loginLabel.setFont(new Font("Arial", Font.BOLD, 24));
        loginLabel.setForeground(new Color(33, 97, 140));

        JPanel loginForm = new JPanel(new GridLayout(2, 2, 5, 5));
        loginForm.setBackground(new Color(230, 240, 250));
        loginForm.add(new JLabel("Email:"));
        JTextField loginEmailField = new JTextField();
        loginForm.add(loginEmailField);
        loginForm.add(new JLabel("Password:"));
        JPasswordField loginPasswordField = new JPasswordField();
        loginForm.add(loginPasswordField);

        JButton loginButton = new JButton("Login");
        JButton goToRegisterButton = new JButton("Go to Register");

        JPanel loginButtonPanel = new JPanel();
        loginButtonPanel.setBackground(new Color(230, 240, 250));
        loginButtonPanel.add(loginButton);
        loginButtonPanel.add(goToRegisterButton);

        loginButton.addActionListener(e -> {
            String email = loginEmailField.getText();
            String password = new String(loginPasswordField.getPassword());
            JOptionPane.showMessageDialog(frame, "Login Successful for " + email);
        });

        goToRegisterButton.addActionListener(e -> cardLayout.show(mainPanel, "Register"));

        loginPanel.add(loginLabel, BorderLayout.NORTH);
        loginPanel.add(loginForm, BorderLayout.CENTER);
        loginPanel.add(loginButtonPanel, BorderLayout.SOUTH);

        // Panel Register
        JPanel registerPanel = new JPanel(new BorderLayout());
        registerPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        registerPanel.setBackground(new Color(230, 240, 250));

        JLabel registerLabel = new JLabel("REGISTER", SwingConstants.CENTER);
        registerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        registerLabel.setForeground(new Color(33, 97, 140));

        JPanel registerForm = new JPanel(new GridLayout(3, 2, 5, 5));
        registerForm.setBackground(new Color(230, 240, 250));
        registerForm.add(new JLabel("Full Name:"));
        JTextField registerNameField = new JTextField();
        registerForm.add(registerNameField);
        registerForm.add(new JLabel("Email:"));
        JTextField registerEmailField = new JTextField();
        registerForm.add(registerEmailField);
        registerForm.add(new JLabel("Password:"));
        JPasswordField registerPasswordField = new JPasswordField();
        registerForm.add(registerPasswordField);

        JButton registerButton = new JButton("Register");
        JButton goToLoginButton = new JButton("Go to Login");

        JPanel registerButtonPanel = new JPanel();
        registerButtonPanel.setBackground(new Color(230, 240, 250));
        registerButtonPanel.add(registerButton);
        registerButtonPanel.add(goToLoginButton);

        registerButton.addActionListener(e -> {
            String name = registerNameField.getText();
            String email = registerEmailField.getText();
            String password = new String(registerPasswordField.getPassword());
            JOptionPane.showMessageDialog(frame, "Registration Successful for " + name);
        });

        goToLoginButton.addActionListener(e -> cardLayout.show(mainPanel, "Login"));

        registerPanel.add(registerLabel, BorderLayout.NORTH);
        registerPanel.add(registerForm, BorderLayout.CENTER);
        registerPanel.add(registerButtonPanel, BorderLayout.SOUTH);

        // Menambahkan panel login dan register ke mainPanel
        mainPanel.add(loginPanel, "Login");
        mainPanel.add(registerPanel, "Register");

        frame.add(mainPanel);
        cardLayout.show(mainPanel, "Login"); // Form login secara default
        frame.setVisible(true);
    }
}
