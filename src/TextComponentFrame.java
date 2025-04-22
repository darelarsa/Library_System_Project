import javax.swing.*;
import java.awt.*;

public class TextComponentFrame extends JFrame {
    public static final int TEXTAREA_ROWS = 40;
    public static final int TEXTAREA_COLUMNS = 90;
    public TextComponentFrame() {
        JPanel titlePanel = new JPanel(); // south panel

        JTextField textField = new JTextField();
        JTextField passwordField = new JTextField(); // input for password
        JTextField authorField = new JTextField();
        JTextField publisherField = new JTextField();
        JTextField publishedDateField = new JTextField();
        JTextField pagesField = new JTextField();

        JPanel northPanel = new JPanel(); // north panel
        northPanel.setLayout(new GridLayout(2, 2));
        northPanel.add(new JLabel("Inset Book name: ", SwingConstants.RIGHT));
        northPanel.add(textField); // username input field
        northPanel.add(new JLabel("Book ISBN: ", SwingConstants.RIGHT));
        northPanel.add(passwordField); // password input field
        northPanel.add(new JLabel("Author: ", SwingConstants.RIGHT));
        northPanel.add(authorField); // username input field
        northPanel.add(new JLabel("Publisher : ", SwingConstants.RIGHT));
        northPanel.add(publisherField); // password input field
        northPanel.add(new JLabel("Published date: ", SwingConstants.RIGHT));
        northPanel.add(publishedDateField); // username input field
        northPanel.add(new JLabel("Number of Pages : ", SwingConstants.RIGHT));
        northPanel.add(pagesField); // password input field
        add(northPanel, BorderLayout.CENTER); // top section of the frame

        JPanel southPanel = new JPanel(); // south panel
        JButton insertButton = new JButton("Insert");
        southPanel.add(insertButton); // add button to panel
        // event handler for button click
        insertButton.addActionListener(event -> {
            String bookname = textField.getText(); // get text from text field
            String ISBN = passwordField.getText(); // get password as char array
            String author = authorField.getText();
            String publisher = publisherField.getText();
            String publishDate = publishedDateField.getText();
            String numofpages = pagesField.getText();
            Novel newnovel = new Novel(bookname, author, publisher, publishDate, ISBN, numofpages);
        });
        add(southPanel, BorderLayout.SOUTH); // bottom section of the frame
        pack(); // sizes the frame according to contents
    }
}