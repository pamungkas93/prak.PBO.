/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

/**
 *
 * @author ASUS
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;


public class MyInputForm1941723014Dhuta extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JPanel panel;

    public MyInputForm1941723014Dhuta() {
        createTextField();
        createButton();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void crateTextField(){
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai C: ");
        cLabel = new JLabel("Hasil: ");
        
        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new  JTextField(FIELD_WIDTH);
        bField.setText("0");
    }
    
    private void createButton(){
        button = JButton("Calculate");//Membuat tombol "Calculate"
        class AddInterestListener implements ActionListener{
            //untuk event klik
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.valueOf(aField.getText());//mengambil inputan textbox
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil: " + c);
            }            
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }
    
    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(cLabel);
        add(panel);
    }
    
    private void createTextField() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JButton JButton(String calculate) {
        return null;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args){
        JFrame frame = new MyInputForm1941723014Dhuta();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
