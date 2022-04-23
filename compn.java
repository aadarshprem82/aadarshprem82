import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class compn extends Applet{
    List l1;
    Choice C;
    TextArea T;
    Scrollbar S;
    public void init(){
        l1=new List();
        l1.add("Blue");
        l1.add("White");
        l1.add("Black");
        l1.add("Red");
        l1.add("Cyan");
        C= new Choice();
        C.add("Sans Serif");
        C.add("Calibri");
        C.add("Monospaced");
        T=new TextArea();
        C.addItemListener(new ItemListener(){
            public void itemStateChanged(ItemEvent e){
                if(e.getStateChange()==1){
                if(e.getItem()=="Blue")
                    T.setBackground(Color.BLUE);
                else if(e.getItem()=="White")
                    T.setBackground(Color.WHITE);
                else if(e.getItem()=="Black"){
                    T.setForeground(Color.WHITE);
                    T.setBackground(Color.BLACK);}
                else if(e.getItem()=="Red")
                    T.setBackground(Color.RED);
                else if(e.getItem()=="Cyan")
                    T.setBackground(Color.CYAN);
                else
                    T.setBackground(Color.BLACK);
                }
                else
                    T.setForeground(Color.RED);
            }
        });
        add(l1);
        add(C);
        add(T);
    }
}
/*
<applet code="compn.class" width="500" height="300"></applet>
*/