import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;


public class Verify extends JFrame{
    
    private Font ft, fn;
    private Container c;
    private JLabel con,wc,user,image,pass,reg;
    private ImageIcon icon,img1,img2,img3,img4,bt2;
    private JTextField tf1; //tf2;
    private JPasswordField pf;
    private JButton b1, b2, b3,b;
    private Cursor cr;

    Verify(){

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

        img1= new ImageIcon(getClass().getResource("verify.gif"));
        image = new JLabel(img1);
        image.setBounds(0,0,550,250);
        c.add(image);
        user = new JLabel("E-Mail :");
        user.setBounds(100,350,60,30);
        user.setForeground(Color.WHITE);
       
        user.setBackground(Color.BLACK);
        user.setFont(ft);
        c.add(user);
        tf1 = new JTextField();
        tf1.setBounds(180,350,230,30);
        tf1.setFont(fn);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setToolTipText("Please Enter Your E-Mail");
        c.add(tf1);
        
        con = new JLabel("Please verify your E-Mail..");
        con.setFont(ft);
        con.setBounds(170,290,300,30);
        con.setForeground(Color.WHITE);
        c.add(con);

        

        img2= new ImageIcon(getClass().getResource("Verify.png"));
        b1 = new JButton(img2);
       
        b1.setCursor(cr);
        b1.setBounds(320,420,63,23);
        c.add(b1);
       b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {  
        String mailx=tf1.getText();
        
    try{
        File file =new File ("save1.txt");
        Scanner scan= new Scanner(file);
        scan.useDelimiter("[,\n] ");
        while(scan.hasNext()){
            String use=scan.next();
            if(use.equals(mailx))
            {
                JOptionPane.showMessageDialog(null,"Verify sueccsful");
                dispose();
            NewUser f =new NewUser();
          
             f.setVisible(true);
                }
            else {JOptionPane.showMessageDialog(null,"Invalid Email ");}	
        }
    }
        catch(IOException ioe){}
    
            }			
          
        
        });
        c.add(b1);
		
		bt2 = new ImageIcon(getClass().getResource("Back.png"));
		b=new JButton(bt2);
        b.setBounds(150, 420,104,24);
		c.add(b);
		b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b)
        {
			
            
			setVisible(false);
			Login r=new Login();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
		

      
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,100,550,520);
        setTitle("Verification Page");
        setResizable(false);

    }

    public static void main(String[] args) {
        
        Verify l = new Verify();
       
    }
}