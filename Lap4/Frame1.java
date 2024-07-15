import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;
class Frame1{
    public static void main(String[] args){
        Frame app = new Frame();
        app.setTitle("ข้อที่1ปุ่ม20ปุ่ม");
        app.setLayout(new GridLayout(5,4));
        app.setSize(400,400);
        for(int i=0;i<20;i++){
            Button btn = new Button("button"+(i+1));
            app.add(btn);
        }
        app.setVisible(true);
    }
}