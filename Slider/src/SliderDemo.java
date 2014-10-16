import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class SliderDemo extends JFrame
{
   public JPanel panel;
   public JLabel label;
   public JSlider jslider1,jslider2,jslider3;
   SliderDemo()
   {
	   
	   JLabel jlblRed = new JLabel("    RED");
	   JLabel jlblGreen = new JLabel("GREEN");
	   JLabel jlblBlue = new JLabel("  BLUE");
       panel=new JPanel();
       panel.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),new EmptyBorder(2, 2, 2, 2)));
       label=new JLabel("Change color");
       //label.setForeground(Color.BLACK);
       panel.add(label);
       jslider1=new JSlider(JSlider.HORIZONTAL);
       jslider2=new JSlider(JSlider.HORIZONTAL);
       jslider3=new JSlider(JSlider.HORIZONTAL);
       //Register listener for the scroll bars
       ChangeListener listener1=new Listener1();
       ChangeListener listener2=new Listener2();
       ChangeListener listener3=new Listener3();
       jslider1.addChangeListener(listener1);
       jslider2.addChangeListener(listener2);
       jslider3.addChangeListener(listener3);
       
       //add jsliders and jlabels to panel
       panel.add(jslider1);
       panel.add(jlblRed);
       panel.add(jslider2);
       panel.add(jlblGreen);
       panel.add(jslider3);
       panel.add(jlblBlue);
       add(panel);
   }
   public static void main(String[] args)
   {
       SliderDemo scr=new SliderDemo();
       scr.setSize(300, 200);
       scr.setLocationRelativeTo(null);
       scr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       scr.setVisible(true);  
   }
   class Listener1 implements ChangeListener
   {
      
       public void stateChanged(ChangeEvent e)
       {
           label.setForeground(Color.RED);
       }  
   }
   class Listener2 implements ChangeListener
   {
       public void stateChanged(ChangeEvent e)
       {
           label.setForeground(Color.GREEN);
       }  
   }
   class Listener3 implements ChangeListener
   {
 
       public void stateChanged(ChangeEvent e)
       {
           label.setForeground(Color.BLUE);
       }  
   }
}

