import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigurationPanel {

    public static void main(String[] args) {
        // Create a new JButton
        JButton button = new JButton("Play");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to be performed when the button is clicked
            }
        });
        // Create a new JButton
        JButton button2 = new JButton("Stop");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to be performed when the button is clicked
            }
        });

    }

}
