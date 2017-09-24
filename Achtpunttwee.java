import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Achtpunttwee extends Applet {
    int Man, Vrouw,  potentiëlevrouw, potentiëleman, totaal;
    Button man, vrouw, vrouw2, man2;
    TextField tekstvak;
    String s;


    public void init() {
        Man = 0;
        Vrouw = 0;
        potentiëlevrouw = 0;
        potentiëleman = 0;
        totaal = 0;



        man = new Button("Man");
        manListener ml = new manListener();
        man.addActionListener( ml );
        add (man);

        vrouw = new Button("Vrouw");
        vrouwListener vl = new vrouwListener();
        vrouw.addActionListener( vl );
        add (vrouw);

        man2 = new Button("potentiële Man");
        man2Listener m2l = new man2Listener();
        man2.addActionListener( m2l );
        add (man2);

        vrouw2 = new Button("potentiële Vrouw");
        vrouw2Listener v2l = new vrouw2Listener();
        vrouw2.addActionListener( v2l );
        add (vrouw2);

    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen               :"+ Man, 20,50);
        g.drawString("Aantal vrouwen              :"+ Vrouw, 20,80);
        g.drawString("Aantal potentiele Mannen    :"+ potentiëleman , 20,110);
        g.drawString("Aantal potentiele Vrouwen   :"+ potentiëlevrouw, 20,140);
        g.setColor( new Color (255, 0, 29));
        totaal = Man + Vrouw + potentiëlevrouw + potentiëleman;
        g.drawString("Totaal mensen aanwezig   :" + totaal, 20,170);

    }

    class manListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Man++ ;
            repaint();
        }

    }

    class vrouwListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            Vrouw++ ;
            repaint();
        }

    }
    class man2Listener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {
            potentiëleman++;
            repaint();
        }

    }
    class vrouw2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            potentiëlevrouw++;
            repaint();
        }
    }
}