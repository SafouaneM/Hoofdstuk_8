
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class EindOpdr extends Applet {
    TextField tekstvak;
    TextField tekstvak2;

    Button plus;
    Button min;
    Button delen;
    Button keer;
    Label label;
    double  getal;

    public void init() {
        //1
        tekstvak = new TextField("", 20);
        add(tekstvak);
        //2
        tekstvak2 = new TextField("",20);
        add(tekstvak2);

        plus = new Button("+");
        plusListener pl = new plusListener();
        plus.addActionListener( pl );
        add(plus);

        min = new Button("-");
        minListener ml = new minListener();
        min.addActionListener( ml );
        add(min);

        delen = new Button("/");
        delenListener dl = new delenListener();
        delen.addActionListener( dl );
        add(delen);

        keer = new Button("x");
        keerListener kl = new keerListener();
        keer.addActionListener( kl );
        add(keer);



    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is " + getal, 150, 100 );
        this.setSize(450,100);
    }

    class plusListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            double num1 = Double.parseDouble(tekstvak.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());

            getal = round(num1 + num2, 2);
            repaint();
        }

    }

    class minListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            double num1 = Double.parseDouble(tekstvak.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());

            getal = round(num1 - num2,2);
            repaint();
        }

    }
    class delenListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            double num1 = Double.parseDouble(tekstvak.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());

            getal = round(num1 / num2,2);
            repaint();
        }

    }
    class keerListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            double num1 = Double.parseDouble(tekstvak.getText());
            double num2 = Double.parseDouble(tekstvak2.getText());

            getal = round(num1 * num2,2);
            repaint();
        }
    }


    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }



}
