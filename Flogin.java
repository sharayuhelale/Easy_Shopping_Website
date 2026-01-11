
import java.awt.*;
public class Flogin extends Frame
{
           Flogin()
           {
              Label lbl1=new Label("USERNAME");
              Label lbl2=new Label("PASSWORD");
              TextField txt1 =new TextField();
              TextField txt2 =new TextField();
               Button btn1=new Button("Cancel");
               Button btn2=new Button("Login");
               lbl1.setBounds(250,250,80,40);
               txt1.setBounds(350,250,300,40);
               lbl2.setBounds(250,325,80,40);
               txt2.setBounds(350,325,300,40);
               btn1.setBounds(250,400,150,40);
               btn2.setBounds(450 ,400,150,40);
               add(lbl1);
               add(txt1);
               add(lbl2);
               add(txt2);
               add(btn1);
               add(btn2);
               setTitle("First Frame");
               setSize(800,800);
               setLayout(null);
               setVisible(true);
            }
            public static void main(String arg[])
            {
                Flogin obj=new Flogin();
            }
}