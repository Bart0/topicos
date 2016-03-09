package jtable;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class tble extends JFrame {
 public tble() {
 super("Ejemplo de un jtable");

 
 Object[][] data = {
 
 {"el brayam", "huirache", "ir por cocas", new Integer(5), new Boolean(false)},
 {"carlos", "reyes", "andar en moto", new Integer(5), new Boolean(false), },
 {"ferguz", "valencia", "dormir", new Integer(5), new Boolean(false) },
 {"andres ", "fernandez", "estar con su ipad", new Integer(5), new Boolean(false)}
         
 };

 String[] columnNames = {"Nombre", "Apellido", "Pasatiempo",
 "Años de Practica", "Soltero(a)"};
 
 final JTable table = new JTable(data, columnNames);
 table.setPreferredScrollableViewportSize(new Dimension(500, 70));
 
 JScrollPane scrollPane = new JScrollPane(table);

 
 getContentPane().add(scrollPane, BorderLayout.CENTER);
 
 addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
 System.exit(0);
 }
 });
 }
 public static void main(String[] args) {
 tble frame = new tble();
 frame.pack();
 frame.setVisible(true);
 }
}
