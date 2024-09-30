import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JFrame{
    
    private Font ft, fn;
    private Container c;
    private JLabel con,wc,user,image,pass,reg;
    private ImageIcon icon,img1,img2,img3,img4;
    private JTextField tf1;
    private JPasswordField pf;
    private JButton b1, b2, b3;
    private Cursor cr;

    HomePage(){

        components();
    }

    public void components(){

        
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        icon = new ImageIcon(getClass().getResource("Icon.png"));
        this.setIconImage(icon.getImage());
        

        ft = new Font("Debug",Font.BOLD,16);
        fn = new Font("Calibri", Font.PLAIN, 18);
        cr= new Cursor(Cursor.HAND_CURSOR);


        
        img2= new ImageIcon(getClass().getResource("Continue.png"));
        b1 = new JButton(img2);
        
        b1.setCursor(cr);
        b1.setBounds(160,400,80,30);
        c.add(b1);
		
				b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b1)
        {
			setVisible(false);
			Game r=new Game();
			r.setVisible(true);
            }
	    }			
	  
	
	   });

        img3= new ImageIcon(getClass().getResource("Settings.png"));
        b2 = new JButton(img3);
        //b2.setBorder(null);
        b2.setCursor(cr);
        b2.setBounds(290,400,80,30);
        c.add(b2);
		
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b2)
        {
			setVisible(false);
            
			Information r=new Information();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
		
		
		img1= new ImageIcon(getClass().getResource("Magic.gif"));
        image = new JLabel(img1);
        image.setBounds(0,0,500,500);
		c.add(image);
		
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,100,550,520);
        setTitle("Welcome to Home Page");
        setResizable(false);
    }

    public static void main(String[] args) {
        
        HomePage l = new HomePage();

       
    }
}