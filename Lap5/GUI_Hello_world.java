import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI_Hello_world extends JFrame{
    GUI_Hello_world(){
        setTitle("Hello World");
        setLayout(new FlowLayout());
        setBounds(150,100,400,140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        GUI_Hello_world frame = new GUI_Hello_world();
        JTextField field = new JTextField();
        field.setBounds(0,0,400,50);

        JButton btn = new JButton("ok");
        btn.setBounds(0,50,400,50);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println(field.getText());
            }
        });

        frame.add(field);
        frame.add(btn);
    }
}