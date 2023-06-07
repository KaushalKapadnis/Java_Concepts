import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class FrameDemo6
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}

class Demo
{
        public String DataDe()
        {
            return "Jay Ganesh...";
        }
}

class MarvellousFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj,tobj1,tobj2 ;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj = new Button("Marvellous");
        tobj = new TextField();
        tobj1 = new TextField();
        tobj2 = new TextField();

        tobj.setBounds(60,60,170,20);
        tobj1.setBounds(100,200,270,20);
        tobj2.setBounds(140,200,270,20);
        bobj.setBounds(110, 130,90,20);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(tobj1);
        fobj.add(tobj2);

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        bobj.addActionListener(this);
        fobj.addWindowListener(this);
    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

   public void actionPerformed(ActionEvent obj)
    {
        Demo dobj = new Demo();
        String str = dobj.DataDe();
        tobj.setText(str);
    }
}

