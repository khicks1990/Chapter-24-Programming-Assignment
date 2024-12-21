import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;


public class ImageViewer extends JFrame
{
     private JPanel imagePanel;        // A panel to hold an image label
     private JPanel buttonPanel;       // A panel to hold a button
     private JLabel imageLabel;        // A label to hold an image
     private JButton button;           // A button to get an image
     private JFileChooser fileChooser; // For the open dialog box
     private Container contentPane;    // To reference the content pane


    /**
        Constructor
    */

     public ImageViewer()
     {
          // Set the title.
          setTitle("Image Viewer");

          // Specify what happens when the close button is clicked.
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          // Create a BorderLayout manager for the content pane.
          setLayout(new BorderLayout());

          // Build the panels.
          buildImagePanel();
          buildButtonPanel();

          // Add the panels to the content pane.
          add(imagePanel, BorderLayout.CENTER);
          add(buttonPanel, BorderLayout.SOUTH);

          // Create a file chooser.
          fileChooser = new JFileChooser(".");

          // Pack and display the window.
          pack();
          setVisible(true);
     }

     /**
         The buildImagePanel method adds an empty label
         to a panel.
     */

     private void buildImagePanel()
     {
          // Create a panel.
          imagePanel = new JPanel();

          // Create a label.
          imageLabel = new JLabel("Click the button to get an image.");

          // Add the label to the panel.
          imagePanel.add(imageLabel);
     }

     /**
         The buildButtonPanel method adds a button
         to a panel.
     */

     private void buildButtonPanel()
     {

     }

     /**
         Private inner class that handles the event when
         the user clicks the button.
     */

     private class ButtonListener implements ActionListener
     {
          public void actionPerformed(ActionEvent e)
          {
               File selectedFile;     // To reference the selected image file
               ImageIcon image;       // To read the image from the file
               String filename;       // To hold the name and path of the file
               int fileChooserStatus; // Indicates status of the open dialog box



               //add code here

               
               }
          }
     }


}
