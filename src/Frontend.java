import java.awt.*;
import javax.swing.*;
public class Frontend {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new TextComponentFrame(); // creates GUI window
            frame.getContentPane().setSize(800,400);
            frame.setTitle("TextComponentTest"); // sets title
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // allows window to close
            frame.setVisible(true); // displays the GUI
        });
    }
}