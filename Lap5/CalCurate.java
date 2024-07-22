import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class CalCurate {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setBounds(150,100,400,500);

        JPanel boxon = new JPanel(new FlowLayout());
        boxon.setBounds(0, 0,400,10);
        JTextField textField = new JTextField(38);
        textField.setBounds(0, 0,400,100);
        boxon.add(textField);

        JPanel boxcenter = new JPanel(new FlowLayout());
        boxcenter.setBounds(0,0,400,300);
        JTextArea textArea = new JTextArea(23,38);
        boxcenter.add(textArea);

        JPanel boxunder = new JPanel(new FlowLayout());
        boxunder.setBounds(0,0,400,100);
        JButton button = new JButton("ok");
        Dimension size = new Dimension(400,30);
        button.setPreferredSize(size);
        boxunder.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean checkNumber = true;
                for(String i : textField.getText().split("")){
                    if("0123456789".indexOf(i)==-1){
                        textArea.setText("Input number error !!!");
                        checkNumber = false;
                        break;
                    }
                }
                if(checkNumber){
                    String title = "";
                    for(int num=1;num<13;num++){
                        title += String.format("%s x %d = %d\n", textField.getText(),num,Integer.parseInt(textField.getText())*num);
                    }
                    textArea.setText(title);
                }
            }
        });


        frame.add(boxon);
        frame.add(boxcenter);
        frame.add(boxunder);
        frame.setVisible(true);
    }
}
