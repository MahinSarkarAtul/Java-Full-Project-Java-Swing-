import java.awt.Color;
import java.awt.Font;
import java.awt.Container;
import java.awt.Cursor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Login extends JFrame {
    
    private Font ft, fn;
    private Container c;
    private JLabel con,wc,user,image,pass,reg;
    private ImageIcon icon,img1,img2,img3,img4,img5;
    private JTextField tf1; 
    private JPasswordField pf;
    private JButton b1, b2, b3,b4;
    private Cursor cr;
	private JCheckBox check;

    Login(){

        components();
    }

    public void components(){

        
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        icon = new ImageIcon(getClass().getResource("Icon.png"));
        this.setIconImage(icon.getImage());
        

        ft = new Font("Debug",Font.PLAIN,12);
        fn = new Font("Calibri", Font.BOLD, 18);
        cr= new Cursor(Cursor.HAND_CURSOR);

        img1= new ImageIcon(getClass().getResource("Welcome.gif"));
        image = new JLabel(img1);
        image.setBounds(0,0,550,250);
        c.add(image);
        
       tf1 = new JTextField();
   
      tf1.setBounds(200,270,150,30);
        tf1.setFont(fn);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setToolTipText("Please Enter Your Username..");
        c.add(tf1);
        
        pf = new JPasswordField();
		
        pf.setBounds(200,310,150,30);
        pf.setFont(fn);
        pf.setForeground(Color.BLACK);
        pf.setBackground(Color.WHITE);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        
        pf.setToolTipText("Please enter your Password");
        c.add(pf);
        
        user = new JLabel("Username:");
        user.setBounds(110,270,120,30);
        user.setForeground(Color.WHITE);
       
        user.setBackground(Color.BLACK);
        user.setFont(fn);
        c.add(user);

        pass = new JLabel();
        pass.setForeground(Color.WHITE);
        
        pass.setBackground(Color.BLACK);
        pass.setText("Password:");
		check= new JCheckBox("Show Password");
        check.setBounds(370,310,200,30);
		check.setBackground(Color.BLACK);
		check.setForeground(Color.WHITE);
		check.setFont(ft);
		check.setCursor(cr);
        check.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(check.isSelected()){
				pf.setEchoChar((char)0);
			}
			else{
				pf.setEchoChar('•');
			}
		}
   });	
c.add(check);   
      
        pass.setBounds(115,315,120,30);
        pass.setFont(fn);
        c.add(pass);

        reg = new JLabel();
        reg.setText("Not a user? Sign up");
        reg.setForeground(Color.WHITE);
   
        reg.setBackground(Color.BLACK);
        reg.setBounds(160,380,250,100);
        reg.setFont(fn);
        

        img2= new ImageIcon(getClass().getResource("login.png"));
        b1 = new JButton(img2);
      
        b1.setCursor(cr);
        b1.setBounds(200,360,60,22);
        c.add(b1);
		 b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	String usernamex=tf1.getText();
	String passwordx=pf.getText();
try{
	File file =new File ("save.txt");
	Scanner scan= new Scanner(file);
	scan.useDelimiter("[,\n]");
	while(scan.hasNext()){
		String username=scan.next();
		String password=scan.next();
		if(username.equals(usernamex)&& password.equals(passwordx))
        {
		JOptionPane.showMessageDialog(null,"Login sueccsful");
        setVisible(false);
		HomePage h=new HomePage();
		h.setVisible(true);
            
            }
		else {JOptionPane.showMessageDialog(null,"Invalid information");}	
	}
}
	catch(IOException ioe){}

		}			
	  
	
	});

        img3= new ImageIcon(getClass().getResource("close.png"));
        b2 = new JButton(img3);
      
        b2.setCursor(cr);
        b2.setBounds(270,360,60,22);
        c.add(b2);
		
		 b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b2)
        {
			
            dispose();
            }
	    }			
	  
	
	   });

        img4 = new ImageIcon(getClass().getResource("here.png"));
        b3 = new JButton(img4);
        
        b3.setCursor(cr);
        b3.setBounds(305,420,53,22);
        c.add(b3);
		
		b3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b3)
        {
			
          
			setVisible(false);
			Registration r=new Registration();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
		
		img5 = new ImageIcon(getClass().getResource("forgot.png"));
        b4 = new JButton(img5);
        
        b4.setCursor(cr);
        b4.setBounds(190,390,146,27);
        c.add(b4);
		
		b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b4)
        {
			
            
			setVisible(false);
			Verify r=new Verify();
			r.setVisible(true);
            }
	    }			
	  
	
	   });

        c.add(reg);
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,100,550,520);
        setTitle("DIVERSE- Log In");
        setResizable(false);
    }

    public static void main(String[] args) {
        
        Login l = new Login();

       
    }
}