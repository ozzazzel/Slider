import java.awt.Color;
import javax.swing.BoundedRangeModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
//Create a class named ScrollBarDemo extends JFrame.
public class ScrollBar extends JFrame
{
   //Create user interface using JPanel, JLabel, JScrollBar.
   
    public JPanel panel;
    public JLabel label;
    public JScrollBar scroll1,scroll2,scroll3;
   ScrollBar()
   {
       panel=new JPanel();
       //Use TitleBorder on the panel that holds the scroll bars
       panel.setBorder(new CompoundBorder(new TitledBorder("Choose colors"),new EmptyBorder(2, 2, 2, 2)));
       label=new JLabel("RED-----------------GREEN-----------------BLUE");//
       //label.setForeground(Color.BLACK);
       panel.add(label);
       scroll1=new JScrollBar(JScrollBar.HORIZONTAL);
       scroll2=new JScrollBar(JScrollBar.HORIZONTAL);
       scroll3=new JScrollBar(JScrollBar.HORIZONTAL);
       BoundedRangeModel model1 = scroll1.getModel();
       BoundedRangeModel model2 = scroll2.getModel();
       BoundedRangeModel model3 = scroll3.getModel();
       //Register listener for the scroll bars
       ChangeListener listener1=new Listener1();
       ChangeListener listener2=new Listener2();
       ChangeListener listener3=new Listener3();
       model1.addChangeListener(listener1);
       model2.addChangeListener(listener2);
       model3.addChangeListener(listener3);
       panel.add(scroll1);
       panel.add(scroll2);
       panel.add(scroll3);
       add(panel);
   }
   public static void main(String[] args)
   {
       ScrollBar scr=new ScrollBar();
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

