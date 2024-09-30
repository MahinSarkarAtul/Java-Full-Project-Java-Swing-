import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;


public class Information extends JFrame{
    
    private Font ft, fn;
    private Container c;
    private JLabel con,wc,user,image,pass,reg,user1;
    private ImageIcon icon,img1,img2,img3,img4;
    private JTextField tf1,tf2;
    private JPasswordField pf;
    private JButton b1, b2, b3;
    private Cursor cr;
	private JCheckBox check;

    Information(){

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

        img1= new ImageIcon(getClass().getResource("Profile.gif"));
        image = new JLabel(img1);
        image.setBounds(0,0,550,250);
        c.add(image);
        

        tf1 = new JTextField();
        tf1.setBounds(200,270,150,30);
        tf1.setFont(fn);
        tf1.setForeground(Color.BLACK);
        tf1.setBackground(Color.WHITE);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        tf1.setToolTipText("Please Enter Your Username...");
        c.add(tf1);
        
        pf = new JPasswordField();
        pf.setBounds(200,310,150,30);
        pf.setFont(fn);
        pf.setForeground(Color.BLACK);
        pf.setBackground(Color.WHITE);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
       
        pf.setToolTipText("Please enter your Password...");
        c.add(pf);
		check= new JCheckBox("Show Password");
        check.setBounds(360,310,200,30);
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
				pf.setEchoChar('*');
			}
		}
   });	
c.add(check); 
        
        user = new JLabel("New Username:");
        user.setBounds(80,270,150,30);
        user.setForeground(Color.WHITE);
        
        user.setBackground(Color.BLACK);
        user.setFont(fn);
        c.add(user);

        pass = new JLabel();
        pass.setForeground(Color.WHITE);
       
        pass.setBackground(Color.BLACK);
        pass.setText("New Password:");
        pass.setBounds(80,315,150,30);
        pass.setFont(fn);
        c.add(pass);
		user1 = new JLabel("New E-Mail ID        :");
        user1.setBounds(80,350,150,30);
        user1.setForeground(Color.WHITE);
        
        user1.setBackground(Color.BLACK);
        user1.setFont(fn);
        c.add(user1);
        tf2 = new JTextField();
        tf2.setBounds(200,350,220,30);
        tf2.setFont(fn);
        tf2.setForeground(Color.BLACK);
        tf2.setBackground(Color.WHITE);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.setToolTipText("Please Enter Your E-Mail...");
        c.add(tf2);


        img2= new ImageIcon(getClass().getResource("Save.png"));
        b1 = new JButton(img2);
        
        b1.setCursor(cr);
        b1.setBounds(150,400,63,24);
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
		try{
    BufferedWriter b = new BufferedWriter(new FileWriter("save1.txt"));
    b.write(tf2.getText());
     b.close();
     }catch(Exception ex){
     ex.printStackTrace();
        }
				}
	});
        c.add(b1);

        img3= new ImageIcon(getClass().getResource("Back.png"));
        b2 = new JButton(img3);
        
        b2.setCursor(cr);
        b2.setBounds(250,400,108,24);
        c.add(b2);
		
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
        setTitle("DIVERSE- Profile Change");
        setResizable(false);

    }

    public static void main(String[] args) {
        
        Information l = new Information();

       
    }
}