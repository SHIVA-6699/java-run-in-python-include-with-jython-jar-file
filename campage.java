import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import org.python.util.PythonInterpreter;

class campage extends JFrame implements ActionListener
{
    JButton btn1;
    campage() {

        JFrame frame1 = new JFrame();
     btn1=new JButton();

        btn1.setText("submit");
        this.add(btn1);
        btn1.addActionListener(this);
        btn1.setBounds(3,33,66,66);

        this.setLayout(null);
        this.setBounds(0, 0, 950, 750);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
System.out.println("mad");
            PythonInterpreter python=new PythonInterpreter();
            python.exec("import os;os.system('start microsoft.windows.camera:')");
        }

    }
    public static void main(String a[])
    {

        campage demo = new campage();
    }
}