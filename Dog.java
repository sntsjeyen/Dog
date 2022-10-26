import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dog extends JFrame
{
    static String breed = "Poodle";
    static String tagNumber = "12345";
    static String color = "White";
    
    JLabel breedLabel = new JLabel();
    JLabel tagNumberLabel = new JLabel();
    JLabel colorLabel = new JLabel();
    
    JTextField breedTextField = new JTextField();
    JTextField tagNumberTextField = new JTextField();
    JTextField colorTextField = new JTextField();
    
    JButton confirmButton = new JButton();
    JButton exitButton = new JButton();
    
    public Dog()
    {
        setVisible(true);
        setTitle("Dog Information");
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        breedLabel.setText("Breed");
        c.gridx = 0;
        c.gridy = 0;
        getContentPane().add(breedLabel, c);
        
        tagNumberLabel.setText("Tag Number");
        c.gridx = 0;
        c.gridy = 1;
        getContentPane().add(tagNumberLabel, c);
        
        colorLabel.setText("Color");
        c.gridx = 0;
        c.gridy = 2;
        getContentPane().add(colorLabel, c);
        
        breedTextField.setText("");
        breedTextField.setColumns(10);
        c.gridx = 1;
        c.gridy = 0;
        getContentPane().add(breedTextField, c);
        
        tagNumberTextField.setText("");
        tagNumberTextField.setColumns(10);
        c.gridx = 1;
        c.gridy = 1;
        getContentPane().add(tagNumberTextField, c);
        
        colorTextField.setText("");
        colorTextField.setColumns(10);
        c.gridx = 1;
        c.gridy = 2;
        getContentPane().add(colorTextField, c);
        
        confirmButton.setText("OK");
        c.gridx = 0;
        c.gridy = 3;
        getContentPane().add(confirmButton, c);
        
        confirmButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                confirmButtonActionPerformed(e);
            }
        });
        
        exitButton.setText("EXIT");
        c.gridx = 1;
        c.gridy = 3;
        getContentPane().add(exitButton, c);
        
        pack();
    }
    
    private void confirmButtonActionPerformed(ActionEvent e)
    {
        breed = breedTextField.getText();
        tagNumber = tagNumberTextField.getText();
        color = colorTextField.getText();
        printInfo(breed, tagNumber, color);
    }
    
    public void printInfo(String breed, String tagNumber, String color)
    {
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Breed : " + breed + "\nTag Number : " + tagNumber + "\nColor : " + color, "Dog Information", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args)
    {
        Dog myDog = new Dog();
        myDog.printInfo(breed, tagNumber, color);
    
    }
    
}
    
  

