import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class NewUser extends JFrame{
    
    private Font ft, fn;
    private Container c;
    private JLabel con,wc,user,image,pass,reg,npass;
    private ImageIcon icon,img1,img2,img3,img4;
    private JTextField tf1; //tf2;
    private JPasswordField pf,pf2;
    private JButton b1, b2, b3;
    private Cursor cr;
	private JCheckBox check1,check2;

    NewUser(){

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

        img1= new ImageIcon(getClass().getResource("cover.png"));
        image = new JLabel(img1);
        image.setBounds(0,0,550,520);
        
        img4 = new ImageIcon(getClass().getResource("forget.gif"));
        con = new JLabel(img4);
        con.setBounds(0,0,550,255);
        c.add(con);

        tf1 = new JTextField();
        tf1.setBounds(220,270,150,30);
        tf1.setFont(fn);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setToolTipText("Please Enter Your Username..");
        c.add(tf1);
        
        pf = new JPasswordField();
        pf.setBounds(220,310,150,30);
        pf.setFont(fn);
        pf.setForeground(Color.BLACK);
        pf.setBackground(Color.WHITE);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        
        pf.setToolTipText("Please enter your Password");
        c.add(pf);
	    check1= new JCheckBox("Show Password");
        check1.setBounds(370,310,200,30);
		check1.setBackground(Color.BLACK);
		check1.setForeground(Color.WHITE);
		check1.setFont(ft);
		check1.setCursor(cr);
        check1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(check1.isSelected()){
				pf.setEchoChar((char)0);
			}
			else{
				pf.setEchoChar('•');
			}
		}
   });	
c.add(check1); 
        
        user = new JLabel("New Username        :");
        user.setBounds(60,270,150,30);
        user.setForeground(Color.WHITE);
        
        user.setBackground(Color.BLACK);
        user.setFont(fn);
        c.add(user);

        pass = new JLabel();
        pass.setForeground(Color.WHITE);
       
        pass.setBackground(Color.BLACK);
        pass.setText("New Password         :");
        pass.setBounds(60,310,150,30);
        pass.setFont(fn);
        c.add(pass);
		npass = new JLabel();
        npass.setForeground(Color.WHITE);
       
        npass.setBackground(Color.BLACK);
        npass.setText("Confirm Password   :");
		npass.setToolTipText("Please confirm new your Password");
        npass.setBounds(60,350,150,30);
        npass.setFont(fn);
        c.add(npass); 
		pf2 = new JPasswordField();
        pf2.setBounds(220,350,150,30);
        pf2.setFont(fn);
        pf2.setForeground(Color.BLACK);
        pf2.setBackground(Color.WHITE);
        pf2.setHorizontalAlignment(JPasswordField.CENTER);
        
        pf2.setToolTipText("Please enter new your Password");
        c.add(pf2);
		check2= new JCheckBox("Show Password");
        check2.setBounds(370,350,200,30);
		check2.setBackground(Color.BLACK);
		check2.setForeground(Color.WHITE);
		check2.setFont(ft);
		check2.setCursor(cr);
        check2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			if(check2.isSelected()){
				pf2.setEchoChar((char)0);
			}
			else{
				pf2.setEchoChar('•');
			}
		}
   });	
c.add(check2); 

        img2= new ImageIcon(getClass().getResource("Save.png"));
        b1 = new JButton(img2);
       
        b1.setCursor(cr);
        b1.setBounds(150,400,63,23);
		b1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {  
	 try{
    BufferedWriter bw = new BufferedWriter(new FileWriter("save.txt"));
    bw.write(tf1.getText()+","+pf.getText());
	 JOptionPane.showMessageDialog(null,"Saved");
     bw.close();
     }catch(Exception ex){
     ex.printStackTrace();
        }
				}
	});
        c.add(b1);

        img3= new ImageIcon(getClass().getResource("Back.png"));
        b2 = new JButton(img3);
        //b2.setBorder(null);
        b2.setCursor(cr);
        b2.setBounds(270,400,104,24);
        c.add(b2);
        c.add(image);
		
		b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b2)
        {
			
            dispose ();
			Login r=new Login();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
		
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,100,550,520);
        setTitle("DIVERSE- New Username and Password ");
        setResizable(false);

    }

    public static void main(String[] args) {
        
        NewUser l = new NewUser();

       
    }
}