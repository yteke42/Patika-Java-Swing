package view;

import javax.swing.*;
import java.awt.*;
import core.Helper;
import entity.User;

public class DashboardUI extends JFrame {

    private JPanel container;
    private User user;

    public DashboardUI(User user) {
        this.user = user;

        if (user == null) {
            Helper.showMsg("error");
            dispose();
            return; // exit constructor early
        }

        // Frame settings
        this.setTitle("Müşteri Yönetim Sistemi - Dashboard");
        this.setSize(1000, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Initialize container
        container = new JPanel(new BorderLayout());
        this.add(container);

        // Example content
        JLabel welcomeLabel = new JLabel("Hoşgeldiniz, " + user.getName() + "!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        container.add(welcomeLabel, BorderLayout.CENTER);

        this.setVisible(true);

        System.out.println(this.user.toString());
    }
}
