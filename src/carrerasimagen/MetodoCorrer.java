package carrerasimagen;
import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
public class MetodoCorrer extends Thread {       
    int limite;
    JLabel l1,l2,l3,l4,l5;
    String medallas;
    public MetodoCorrer(int limite,JLabel l1,JLabel l2,JLabel l3,JLabel l4,JLabel l5){       
       this.limite=limite;
       this.l1=l1;
       this.l2=l2;
       this.l3=l3;
       this.l4=l4;
       this.l5=l5;       
    }
    int j=0;
    public void run (){
        for(int i=0;i<limite;i++){
            try {
                l1.setLocation(j+420,0);
                l2.setLocation(j+315,0);
                l3.setLocation(j+210,0);
                l4.setLocation(j+105,0);
                l5.setLocation(j,0);
//                label.setText(nombre);
                Thread.sleep((long)(Math.random()*5000));
            } catch (InterruptedException ex) {
                Logger.getLogger(MetodoCorrer.class.getName()).log(Level.SEVERE, null, ex);
            }j+=105;
        }
      yield();
    }   
}