package view;

import javax.swing.*;

import business.UserController;
import core.Helper;
import entity.User;

import java.awt.*;

public class LoginUI extends JFrame {

    private JPanel container;
    private UserController userController;

    public LoginUI() {

        this.userController = new UserController();
        // Frame settings
        this.setTitle("Müşteri Yönetim Sistemi");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // center on screen

        // Container panel with BorderLayout
        container = new JPanel(new BorderLayout());
        this.add(container);

        // Title Label at the top
        JLabel titleLabel = new JLabel("Müşteri Yönetim Sistemi", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Top margin
        container.add(titleLabel, BorderLayout.NORTH);

        // Form panel in center using GridBagLayout
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30)); // Padding
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8); // space between components
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Email label
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.3;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel emailLabel = new JLabel("E-posta adresiniz:");
        formPanel.add(emailLabel, gbc);

        // Email field
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        JTextField emailField = new JTextField();
        formPanel.add(emailField, gbc);

        // Password label
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;
        JLabel passwordLabel = new JLabel("Şifreniz:");
        formPanel.add(passwordLabel, gbc);

        // Password field
        gbc.gridx = 1;
        gbc.weightx = 0.7;
        JPasswordField passwordField = new JPasswordField();
        formPanel.add(passwordField, gbc);

        // Login button (span 2 columns)
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.weightx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton loginButton = new JButton("Giriş Yap");
        formPanel.add(loginButton, gbc);

        loginButton.addActionListener(e -> {
            JTextField[] checkList = {emailField, passwordField};
            
            if (!Helper.isEmailValid(emailField.getText())){
                Helper.showMsg("Geçerli bir e posta giriniz.");
            }
            
            else if (Helper.isFieldEmpty(checkList)){
                Helper.showMsg("fill");
            }else{
                User user = this.userController.findByLogin(emailField.getText(), passwordField.getText());
                if(user == null) {
                    Helper.showMsg("Kullanıcı bulunamadı !");
                }else{
                    this.dispose();
                    DashboardUI dashboardUI = new DashboardUI(user);
                }

            }
        });


        // Add form panel to center of container
        container.add(formPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
