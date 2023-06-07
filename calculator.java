import java.lang.*;
import java.awt.*;
import java.awt.event.*;



class Arithmatic
{
	public int iNo1;
	public int iNo2;
	
	public Arithmatic(int x, int y)
	{
		this.iNo1 = x;
		this.iNo2 = y;
	}
    public int Addition()
    {
		return this.iNo1 + this.iNo2;
    }
}

class MarvellousFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj1,  tobj2;//tobj3;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj = new Button("+");
         tobj1 = new TextField("no 1");
         tobj2 = new TextField("no 2");
         //tobj3 = new TextField("no 2");
		 

         tobj2.setBounds(60,60,170,20);
         tobj1.setBounds(160,160,170,20);
         //tobj3.setBounds(200,200,170,20);
		 
		 tobj1.setLocation(100,100);
		 tobj2.setLocation(100,200);
		 //tobj3.setLocation(100,220);
        bobj.setBounds(100, 250,50,20);

        fobj.add(bobj);
         fobj.add(tobj1);
         fobj.add(tobj2);
         //fobj.add(tobj3);

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
		/*/int i = Integer.parseInt(tobj2.getText());
        int j = Integer.parseInt(tobj3.getText());
		
		Arithmatic aobj = new Arithmatic(i,j);
		int k = aobj.Addition();*/
    }
}

class FrameDemo5
{
    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("Calculator");

    }
}

