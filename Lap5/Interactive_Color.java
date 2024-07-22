import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;


class Interactive_Color {
    public static void main(String[] args){
        JFrame frame = new JFrame("Interactive Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        // frame.setLayout(null);
        frame.setBounds(150,100,400,500);

        JPanel boxInput = new JPanel(new FlowLayout());
        JTextField textfiled = new JTextField(38);
        boxInput.add(textfiled);

        JPanel boxShowColor = new JPanel(new FlowLayout());
        boxShowColor.setPreferredSize(new Dimension(400,300));
        boxShowColor.setBackground(new Color(0,0,0));
        boxShowColor.setBounds(0,100,400,200);
        // boxShowColor.setz
        // boxShowColor.addMouseListener(new MouseAdapter() {
        //     public void mouseClicked(MouseEvent e) {
        //         System.out.println("Mouse clicked at: (" + e.getX() + ", " + e.getY() + ")");
        //     }
        // });
        boxShowColor.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                String title = String.format("x = %s, y = %s",e.getX(),e.getY());
                textfiled.setText(title);
            }
        });

        frame.add(boxInput);
        frame.add(boxShowColor);
        frame.setVisible(true);
    }
}