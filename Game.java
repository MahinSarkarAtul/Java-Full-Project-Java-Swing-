import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame{

    private JLabel V,Sa,hood,flag,punk,cry;
    private Container c;
    private Font f,fn;
    private ImageIcon icon,imgV,imgSA,imgHood,imgFlag,imgPunk,imgCry;
    private JButton btV,btSA,btHood,btFlag,btPunk,btCry, btNext,b1;
    private Cursor cr;
	//private ImageIcon trailer,buy,icon

    Game(){

        components();
    }

    public void components(){
      
     //c = new Container();
     c = this.getContentPane();
     c.setLayout(null);
     c.setBackground(Color.BLACK);
	 icon = new ImageIcon(getClass().getResource("Icon.png"));
     this.setIconImage(icon.getImage());

    f = new Font("Debug",Font.BOLD,14);
	fn = new Font("Debug",Font.BOLD,16);
	f = new Font("Debug",Font.BOLD,20);
    cr = new Cursor(Cursor.HAND_CURSOR);

    // ---------------------------Grand Theft Auto V-----------------------
    
    imgV = new ImageIcon(getClass().getResource("GTAV.png"));
    btV = new JButton(imgV);
    btV.setBounds(60,30,200,245);
    btV.setCursor(cr);
    c.add(btV);
	
		btV.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==btV)
        {
			
            setVisible(false);
			Info1 r=new Info1();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
    
    V = new JLabel("Grand Theft Auto V");
    V.setForeground(Color.WHITE);
    V.setBounds(60,190,250,210);
    V.setFont(f);
    c.add(V);

    // ------------------------GTA San Andreas-----------------------

    imgSA = new ImageIcon(getClass().getResource("GTASA.png"));
    btSA = new JButton(imgSA);
    btSA.setBounds(318,30,200,245);
    btSA.setCursor(cr);
    c.add(btSA);
	
	btSA.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==btSA)
        {
			
            setVisible(false);
			Info1 r=new Info1();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
    
	
    Sa = new JLabel("GTA San Andreas");
    Sa.setForeground(Color.WHITE);
    Sa.setBounds(318,190,250,210);
    Sa.setFont(f);
    c.add(Sa);

    // ---------------Assassins Creed Brotherhood----------------

    imgHood = new ImageIcon(getClass().getResource("ACB.png"));
    btHood = new JButton(imgHood);
    btHood.setBounds(580,30,200,245);
    btHood.setCursor(cr);
    c.add(btHood);
	
			btHood.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==btHood)
        {
			
            setVisible(false);
			Info3 r=new Info3();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
    

    hood = new JLabel("Assassins Creed Brotherhood");
    hood.setForeground(Color.WHITE);
    hood.setBounds(545,190,300,210);
    hood.setFont(f);
    c.add(hood);

    //------------------ Assassins Creed Black Flag-----------------------
    imgFlag = new ImageIcon(getClass().getResource("ACBF.png"));
    btFlag = new JButton(imgFlag);
    btFlag.setBounds(60,340,200,245);
    btFlag.setCursor(cr);
    c.add(btFlag);
	
	btFlag.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==btFlag)
        {
			
            setVisible(false);
			Info4 r=new Info4();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
    
    flag = new JLabel("Assassins Creed Black Flag");
    flag.setForeground(Color.WHITE);
    flag.setBounds(60,490,280,210);
    flag.setFont(f);
    c.add(flag);

    // ---------------Cyberpunk  2077-------------------

    imgPunk = new ImageIcon(getClass().getResource("Cyberpunk.png"));
    btPunk = new JButton(imgPunk);
    btPunk.setBounds(318,340,200,245);
    btPunk.setCursor(cr);
    c.add(btPunk);
	
	btPunk.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==btPunk)
        {
			
            setVisible(false);
			Info5 r=new Info5();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
    

    punk = new JLabel("Cyberpunk 2077");
    punk.setForeground(Color.WHITE);
    punk.setBounds(350,490,280,210);
    punk.setFont(f);
    c.add(punk);

    // ----------------------Far Cry 6----------------------------

    imgCry = new ImageIcon(getClass().getResource("FC6.png"));
    btCry = new JButton(imgCry);
    btCry.setBounds(580,340,200,245);
    btCry.setCursor(cr);
    c.add(btCry);
	
	btCry.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==btCry)
        {
			
            setVisible(false);
			Info6 r=new Info6();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
    
    cry = new JLabel("Far Cry 6");
    cry.setForeground(Color.WHITE);
    cry.setBounds(580,490,280,210);
    cry.setFont(f);
    c.add(cry);

    btNext = new JButton("Next->");
    btNext.setBounds(765, 610, 77, 30);
	btNext.setFont(f);
	btNext.setCursor(cr);
    btNext.setBackground(Color.BLACK);
    btNext.setForeground(Color.WHITE);
    btNext.setBorder(null);
	btNext.setCursor(cr);
    c.add(btNext);
	
	btNext.addActionListener(new ActionListener(){
			
		
		public void actionPerformed(ActionEvent e) {  
	    if(e.getSource()==btNext)
        {
			setVisible(false);
			FreeGame r=new FreeGame();
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
    b1.setBounds(0,610,77,30);
    c.add(b1);
	
		
		b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==b1)
        {
			
            setVisible(false);
			HomePage r=new HomePage();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
	
	    setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300,0,850,700);
        setTitle("Diverse Purchasable Games");


}

    public static void main(String[] args) {
        
        Game frame = new Game();
    }
}