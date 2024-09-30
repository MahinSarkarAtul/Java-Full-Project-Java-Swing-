import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class Registration 
    extends JFrame
     {
	private ImageIcon icon,img1,bt1,bt2;
    private JLabel image;	 
    private Container c;
   // private JLabel title;
    private JLabel name;
	private JLabel mno;
	private JButton b;
    private JTextField tname;
    private JPasswordField pf;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
	private JTextField tadd;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private Cursor cr;
   
    private JButton sub;
	private JCheckBox check;

 
    private String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    private String months[]
        = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
 
   
    public Registration()
    {
        setTitle("Registration Form");
        setBounds(300, 20, 700, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
 
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        cr= new Cursor(Cursor.HAND_CURSOR);
		icon = new ImageIcon(getClass().getResource("Icon.png"));
        this.setIconImage(icon.getImage());
		
        img1= new ImageIcon(getClass().getResource("Registration.gif"));
        image = new JLabel(img1);
        image.setBounds(0,0,700,200);
        c.add(image);

        name = new JLabel("Name       :");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setForeground(Color.WHITE);
        name.setBackground(Color.BLACK);
        name.setSize(100, 20);
        name.setLocation(100, 280);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(150, 20);
        tname.setLocation(200, 280);
        tname.setHorizontalAlignment(JPasswordField.CENTER);
        tname.setToolTipText("Please Enter Your Username..");
        tname.setCursor(cr);
        c.add(tname);
 
        mno = new JLabel("Password :");
        mno.setFont(new Font("Arial", Font.PLAIN, 20));
        mno.setSize(100, 20);
        mno.setLocation(100, 320);
        mno.setForeground(Color.WHITE);
        mno.setBackground(Color.BLACK);
        c.add(mno);
 
        pf = new JPasswordField();
        pf.setFont(new Font("Arial", Font.PLAIN, 15));
        pf.setSize(150, 20);
        pf.setLocation(200, 320);
		pf.setHorizontalAlignment(JPasswordField.CENTER);
        pf.setToolTipText("Please enter your Password");
        pf.setCursor(cr);
        c.add(pf);
			check= new JCheckBox("Show Password");
        check.setBounds(370,315,200,30);
		check.setBackground(Color.BLACK);
		check.setForeground(Color.WHITE);
		//check.setFont(ft);
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
 
        gender = new JLabel("Gender   :");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 360);
        gender.setForeground(Color.WHITE);
        gender.setBackground(Color.BLACK);
        c.add(gender);
 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 360);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 360);
        c.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        dob = new JLabel("DOB     :");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 400);
        dob.setForeground(Color.WHITE);
        dob.setBackground(Color.BLACK);
        c.add(dob);
        add = new JLabel("E-mail Address :");
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setHorizontalAlignment(JPasswordField.CENTER);
        add.setSize(150, 20);
        add.setLocation(100, 440);

        c.add(add);
 
        tadd = new JTextField();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setHorizontalAlignment(JPasswordField.CENTER);
        tadd.setToolTipText("Please Enter Your E-mail ID");
        tadd.setSize(200, 20);
        tadd.setCursor(cr);
        tadd.setLocation(250, 440);
		//tadd.setImageIcon(img);
       // tadd.setLineWrap(true);
        c.add(tadd);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 400);
        c.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 400);
        c.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 400);
        c.add(year);

        bt1 = new ImageIcon(getClass().getResource("Submit.png"));
        sub = new JButton(bt1);
        sub.setBounds(200, 500,64,24);
	    sub.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
		    try{
    BufferedWriter bw = new BufferedWriter(new FileWriter("save.txt"));
    bw.write(tname.getText()+","+pf.getText());
     bw.close();
     }catch(Exception ex){
     ex.printStackTrace();
        }
		    try{
    BufferedWriter b = new BufferedWriter(new FileWriter("save1.txt"));
    b.write(tadd.getText());
	JOptionPane.showMessageDialog(null,"Your Registration Completed ");
     b.close();
     }catch(Exception ex){
     ex.printStackTrace();
        }
	}
	});
		
        c.add(sub);

        bt2 = new ImageIcon(getClass().getResource("Back.png"));
		b=new JButton(bt2);
        b.setBounds(300, 500,104,24);
		c.add(b);
		b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b)
        {
			
            dispose ();
			Login r=new Login();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
		
		
		setVisible(true);
	}
		public static void main (String [] args){
		new Registration();
	}
		
	}
 

