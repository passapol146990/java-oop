import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.TextArea;
class Frame2 {
    public static void main(String[] args){
        Frame app = new Frame("20 ปุ่ม 20 แอร์เรีย");
        app.setLayout(new GridLayout(8,5));
        app.setSize(400,400);
        for(int i=0; i<20; i++){
            Button btn = new Button("Button"+(i+1));
            TextArea textArea = new TextArea("",1,1,TextArea.SCROLLBARS_NONE);
            app.add(btn);
            app.add(textArea);
        }
        app.setVisible(true);
    }
}
