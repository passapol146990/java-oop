import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
class Frame3{
    public static void main(String[] args){
        JFrame app = new JFrame("สุ่มวางปุ่มดิ้");
        Panel tap = new Panel(null);
        int width, height;
        width = 600;
        height = 600;
        app.setSize(width,height);
        for(int i=0; i<30; i++){
            Button btn = new Button(String.valueOf(i));
            btn.setLocation((int)(Math.random()*(width-20)+1),(int)(Math.random()*(height-20)+1));
            btn.setSize(50,50);
            btn.setBackground(new Color((int)(Math.random()*255+1),(int)(Math.random()*255+1),(int)(Math.random()*255+1)));
            Font font = new Font(String.valueOf(i),Font.BOLD, (i+10));
            btn.setFont(font);
            tap.add(btn);
        }
        app.add(tap);
        app.setVisible(true);
    }
}
