package LambdaExp;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow {
    public static void main(String[] args) {
        // Window : object of JFrame
        JFrame frame = new JFrame("My Window"); // My Window is the title of the window.
        frame.setSize(400, 400); // set the size of the window (height = 400, width = 400)
        // frame.setLayout(null); // If we pass 'null' in the argument of setLayout then
        // it'll invisible the click
        // me button and not allow to click on the window screen.
        frame.setLayout(new FlowLayout());

        // Crerate button and add Jframe
        JButton button = new JButton("Click Me !!");
        // Every time we click on the button, it'll generate an event (Action Listener).
        // We can handle this event by using ActionListener interface.
        // button.addActionListener(new ActionListener() {
            // anonymous class
            /* @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Click");
                JOptionPane.showMessageDialog(null, "Hello, Button Click");
            }
        }); */

        button.addActionListener( e -> {
            System.out.println("Button Click");
            JOptionPane.showMessageDialog(null, "Hello, Button Click");
        });

        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse Dragged");
            }
            
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse Moved");
            }
        });
        
        frame.add(button); // It allow whole width to click.

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
