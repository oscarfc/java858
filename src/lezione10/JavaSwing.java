/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lezione10;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tss
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("prova swing ...");
        System.out.println("modifica...");
        // https://github.com/oscarfc/java858

        JFrame f = new JFrame("Esempio Swing");

        f.setBounds(100, 100, 300, 200);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = f.getContentPane();
        cp.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton jb = new JButton("Invia");
        jb.setBounds(10, 10, 80, 25);
        cp.add(jb);
        f.setVisible(true);
    }

}
