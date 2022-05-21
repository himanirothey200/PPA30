import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame extends WindowAdapter
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj = new Button("Marvellous");
        tobj = new TextField();

        tobj.setBounds(60,60,170,20);
        bobj.setBounds(110,130,60,20);

        fobj.add(bobj);
        fobj.add(bobj);

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        fobj.addWindowListener(this);
    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}