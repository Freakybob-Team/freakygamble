package site.freakybob;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class game extends JPanel implements ActionListener {
    private JButton spinButton;
    private JLabel resultLabel;

    public game() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.PINK);
        setLayout(new BorderLayout());

        spinButton = new JButton("Spin");
        spinButton.addActionListener(this);
        add(spinButton, BorderLayout.SOUTH);

        resultLabel = new JLabel("Press 'Spin' to start spending all your freaky money away", SwingConstants.CENTER);
        resultLabel.setForeground(Color.WHITE);
        add(resultLabel, BorderLayout.CENTER);
    }

    public void start() {
        JFrame frame = new JFrame("FreakyBob Gambling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == spinButton) {
            Random rand = new Random();
            int result = rand.nextInt(90); 
            resultLabel.setText("You spun a: " + result);
        }
    }
}
