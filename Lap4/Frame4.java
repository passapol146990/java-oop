import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
class Frame4 {
    public static void main(String[] args){
        JFrame app = new JFrame("read File");
        int width,height;
        width = 600;
        height = 600;
        app.setSize(width, height);
        app.setLayout(new FlowLayout());
        
        Panel tap1 = new Panel(new FlowLayout());
        TextArea textArea = new TextArea("",height/20,width/10,TextArea.SCROLLBARS_NONE);
        tap1.add(textArea);

        Panel tap2 = new Panel(new FlowLayout());
        Button btnOpen = new Button("Open File");
        Button btnSave = new Button("Save File");
        Button btnClear = new Button("Clear Screen");
        
        tap2.add(btnOpen);
        tap2.add(btnSave);
        tap2.add(btnClear);

        app.add(tap1,BorderLayout.CENTER);
        app.add(tap2,BorderLayout.CENTER);
        app.setVisible(true);
    }
}
