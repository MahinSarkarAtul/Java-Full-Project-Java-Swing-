
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Bkash extends JFrame{
    
    private Font ft, fn,f;
    private Container c;
    private JLabel con,wc,user,image,pass,reg;
    private ImageIcon icon,img1,img2,img3,img4;
    private JTextField tf1; //tf2;
    private JPasswordField pf;
    private JButton b1, b2, b3, b4;
    private Cursor cr;

    Bkash(){

        components();
    }

    public void components(){

        
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);
		
		ft = new Font("Debug",Font.BOLD,16);
        fn = new Font("Calibri", Font.BOLD, 24);
		f = new Font("Debug",Font.BOLD,20);
        cr= new Cursor(Cursor.HAND_CURSOR);
		
		img1= new ImageIcon(getClass().getResource("bkash.gif"));
        image = new JLabel(img1);
        image.setBounds(0,0,550,250);
		image.setCursor(cr);
        c.add(image);
		
		icon = new ImageIcon(getClass().getResource("Icon.png"));
        this.setIconImage(icon.getImage());
		
		user=new JLabel("Welcome to Bkash ");
		user.setBounds(150,260,230,30);
        user.setForeground(Color.BLACK);
        user.setOpaque(true);
        user.setBackground(Color.WHITE);
        user.setFont(fn);
		user.setCursor(cr);
        c.add(user);
		
		con=new JLabel("Bkash Number    :");
		con.setBounds(100,300,150,30);
        con.setForeground(Color.BLACK);
        con.setOpaque(true);
        con.setBackground(Color.WHITE);
        con.setFont(ft);
		con.setCursor(cr);
        c.add(con);
		
        tf1 = new JTextField();
        tf1.setBounds(250,305,150,30);
        tf1.setFont(ft);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setToolTipText("Please Enter Your Phone number");
		tf1.setCursor(cr);
        c.add(tf1);
		
		wc=new JLabel("Bkash PIN           :");
		wc.setBounds(100,350,230,30);
        wc.setForeground(Color.BLACK);
        wc.setOpaque(true);
        wc.setBackground(Color.WHITE);
        wc.setFont(ft);
		wc.setCursor(cr);
        c.add(wc);
		
		pf = new JPasswordField();
		//pf.setForeground(Color.black);
        pf.setBounds(250,355,150,30);
        pf.setFont(fn);
        pf.setForeground(Color.BLACK);
        pf.setBackground(Color.WHITE);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        pf.setToolTipText("Enter Bkash PIN only five digit");
		pf.setCursor(cr);
        c.add(pf);
		

	b4 = new JButton("Done");
    b4.setBounds(235,420,80,30);
    b4.setFont(f);
    b4.setBorder(null);
    b4.setBackground(Color.BLACK);
    b4.setForeground(Color.WHITE);
    b4.setCursor(cr);
    c.add(b4);
	
	b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b4)
        {
			
        
			setVisible(false);
			Purchase r=new Purchase();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
	
	b1 = new JButton("<-Back");
    b1.setBorder(null);
    b1.setFont(f);
	b1.setCursor(cr);
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setBorder(null);
    b1.setCursor(cr);
    b1.setBounds(0,452,77,30);
    c.add(b1);
	
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b1)
        {
			
            
			setVisible(false);
			Pay r=new Pay();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
		
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,100,550,520);
        setTitle("Online payment with Master Card");
        setResizable(false);
		setVisible(true);
		

        
    }

    public static void main(String[] args) {
        
        Bkash l = new Bkash();
       
    }
}