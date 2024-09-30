import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pay extends JFrame{
    
    private Font ft, fn,f;
    private Container c;
    private JLabel con,wc,user,image,pass,reg;
    private ImageIcon icon,img1,img2,img3,img4,img5;
    private JTextField tf1; //tf2;
    private JPasswordField pf;
    private JButton b1, b2, b3, b4;
    private Cursor cr;

    Pay(){

        components();
    }

    public void components(){

        
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
		
		ft = new Font("Debug",Font.BOLD,16);
		f = new Font("Debug",Font.BOLD,20);
        fn = new Font("Calibri", Font.BOLD, 30);
        cr= new Cursor(Cursor.HAND_CURSOR);
		
		img1= new ImageIcon(getClass().getResource("pay.gif"));
        image = new JLabel(img1);
        image.setBounds(0,0,550,250);
        c.add(image);
		
		icon = new ImageIcon(getClass().getResource("Icon.png"));
        this.setIconImage(icon.getImage());
		user=new JLabel("Please select anyone");
		user.setBounds(120,260,270,50);
        user.setForeground(Color.WHITE);
		user.setBackground(Color.BLACK);
        user.setOpaque(true);
        user.setFont(fn);
        c.add(user);
		
		 img2= new ImageIcon(getClass().getResource("bb.png"));
        b1 = new JButton(img2);
        b1.setBorder(null);
        b1.setCursor(cr);
        b1.setBounds(150,320,80,30);
        c.add(b1);
		
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b1)
        {
			setVisible(false);
			Bkash r=new Bkash();
			r.setVisible(true);
        }
	    }			
	  
	
	   });
		
		img3= new ImageIcon(getClass().getResource("nagad.png"));
        b2 = new JButton(img3);
        b2.setCursor(cr);
          b2.setBounds(300,320,80,30);
        c.add(b2);
		
				b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b2)
        {
			
            //dispose ();
			setVisible(false);
			Nagad r=new Nagad();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
		
		img4 = new ImageIcon(getClass().getResource("master.png"));
        b3 = new JButton(img4);
        b3.setBorder(null);
        b3.setCursor(cr);
        b3.setBounds(190,380,150,30);
        c.add(b3);
		
				b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b3)
        {
			
            //dispose ();
			setVisible(false);
			Master r=new Master();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
	    
        b4 = new JButton("<-Back");
        b4.setBorder(null);
		b4.setFont(f);
	    b4.setCursor(cr);
    b4.setBackground(Color.BLACK);
    b4.setForeground(Color.WHITE);
    b4.setBorder(null);
        b4.setCursor(cr);
        b4.setBounds(0,452,77,30);
        c.add(b4);
		
				b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b4)
        {
			
            //dispose ();
			setVisible(false);
			Game r=new Game();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
		
    /*b1 = new JButton("BKASH");
    b1.setBounds(150,320,80,30);
    b1.setFont(ft);
    b1.setBorder(null);
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setCursor(cr);
    c.add(b1);
	
	    b2 = new JButton("NAGAD");
    b2.setBounds(300,320,80,30);
    b2.setFont(ft);
    b2.setBorder(null);
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    b2.setCursor(cr);
    c.add(b2);
	
	    b3 = new JButton("ROCKET");
    b3.setBounds(150,380,80,30);
    b3.setFont(ft);
    b3.setBorder(null);
    b3.setBackground(Color.BLACK);
    b3.setForeground(Color.WHITE);
    b3.setCursor(cr);
    c.add(b3);
	
	    b4 = new JButton("MASTER CARD");
    b4.setBounds(300,380,120,30);
    b4.setFont(ft);
    b4.setBorder(null);
    b4.setBackground(Color.BLACK);
    b4.setForeground(Color.WHITE);
    b4.setCursor(cr);
    c.add(b4);*/
		
		
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,100,550,520);
        setTitle("Online payment");
        setResizable(false);
		setVisible(true);

        
    }

    public static void main(String[] args) {
        
        Pay l = new Pay();
       
    }
}