
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ResetKnop extends Applet {
    TextField tekst;
    Label label;
    String s;
    Button knop;

    public void init() {
        tekst = new TextField("", 17);
        label = new Label("Ga je gang en type wat ehe");
        knop = new Button("Reset");
        knop.addActionListener(new KnopListener());
        add(label);
        add(tekst);
        s = "";
        add(knop);
        knop = new Button("Sman");
        knop.addActionListener(new ResetListener());
        add(knop);

    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 70);
    }

    class KnopListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            tekst.setText("");

            repaint();

        }

    }

    class ResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            s = tekst.getText();

            repaint();

        }
    }
}