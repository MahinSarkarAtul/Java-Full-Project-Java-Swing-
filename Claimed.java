
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Claimed extends JFrame{
    
    private Font ft, fn,f,fb;
    private Container c;
    private JLabel con,wc,user,image,pass,reg;
    private ImageIcon icon,img1,img2,img3,img4,img5;
    private JTextField tf1; //tf2;
    private JPasswordField pf;
    private JButton b1, b2, b3, b4;
    private Cursor cr;

    Claimed(){

        components();
    }

    public void components(){

        
        c= this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
		
		ft = new Font("Debug",Font.BOLD,16);
		f = new Font("Debug",Font.BOLD,36);
		fb = new Font("Debug",Font.BOLD,20);
        fn = new Font("Calibri", Font.BOLD, 24);
        cr= new Cursor(Cursor.HAND_CURSOR);
		
		img1= new ImageIcon(getClass().getResource("clam.gif"));
        image = new JLabel(img1);
        image.setBounds(0,0,550,250);
        c.add(image);
		
		icon = new ImageIcon(getClass().getResource("Icon.png"));
        this.setIconImage(icon.getImage());
		
		user=new JLabel("DOWNLOADING");
		user.setBounds(120,330,300,45);
        user.setForeground(Color.WHITE);
		user.setBackground(Color.BLACK);
        user.setOpaque(true);
        user.setFont(f);
        c.add(user);
	    
        b4 = new JButton("<-Back");
        b4.setBorder(null);
		b4.setFont(fb);
	    b4.setCursor(cr);
    b4.setBackground(Color.BLACK);
    b4.setForeground(Color.WHITE);
    //b4.setBorder(null);
        b4.setCursor(cr);
        b4.setBounds(0,452,77,30);
        c.add(b4);
		
		b4.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b4)
        {
			
           
			setVisible(false);
			FreeGame r=new FreeGame();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
		
		setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400,100,550,520);
        setTitle("Online payment");
        setResizable(false);
		
		

        
    }

    public static void main(String[] args) {
        
        Claimed l = new Claimed();
    }
}