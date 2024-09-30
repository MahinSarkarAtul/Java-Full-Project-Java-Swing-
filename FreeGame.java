import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FreeGame extends JFrame{
    private JLabel L_apex, L_cod, L_counter, L_fortnite, L_minecraft, L_valorant;
    private Container c;
    private Font f;
    private ImageIcon icon,I_apex, I_cod, I_counter, I_fortnite,  I_minecraft, I_valorant;
    private JButton B_apex,b1, B_cod, B_counter, B_fortnite, B_minecraft, B_valorant, B_back;
    private Cursor cr;

    FreeGame()
    {
        component();

    }

    public void component(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);
		
				icon = new ImageIcon(getClass().getResource("Icon.png"));
        this.setIconImage(icon.getImage());

        f = new Font("Debug", Font.BOLD, 20);
        // fn = new Font("Debug",Font.BOLD,16);
        cr = new Cursor(Cursor.HAND_CURSOR);


        // ---------------------------APEX----------------------------

        I_apex = new ImageIcon(getClass().getResource("apex.jpg"));
        B_apex = new JButton(I_apex);
        B_apex.setBounds(60,30,200,245);
        B_apex.setCursor(cr);
        B_apex.setBorder(BorderFactory.createLineBorder(Color.white));
        c.add(B_apex);
		
			B_apex.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==B_apex)
        {
			
            setVisible(false);
			Inf1 r=new Inf1();
			r.setVisible(true);
            }
	    }			
	  
	
	   });

        L_apex = new JLabel("Apex Legends");
        L_apex.setForeground(Color.WHITE);
        L_apex.setBounds(90, 190, 250, 210);
        L_apex.setFont(f);
        c.add(L_apex);

        // -------------------------COD---------------------------------

        I_cod = new ImageIcon(getClass().getResource("cod.png"));
        B_cod = new JButton(I_cod);
        B_cod.setBounds(318, 30, 200, 245);
        B_cod.setCursor(cr);
        B_cod.setBorder(BorderFactory.createLineBorder(Color.white));
        c.add(B_cod);
		
					B_cod.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==B_cod)
        {
			
            setVisible(false);
			Inf2 r=new Inf2();
			r.setVisible(true);
            }
	    }			
	  
	
	   });

        L_cod = new JLabel("Call of Duty");
        L_cod.setForeground(Color.WHITE);
        L_cod.setBounds(360,190,250,210);
        L_cod.setFont(f);
        c.add(L_cod);

        // --------------------------Counter Strike---------------------------

        I_counter = new ImageIcon(getClass().getResource("counter.png"));
        B_counter = new JButton(I_counter);
        B_counter.setBounds(580,30,200,245);
        B_counter.setCursor(cr);
        B_counter.setBorder(BorderFactory.createLineBorder(Color.white));
        c.add(B_counter);
		
							B_counter.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==B_counter)
        {
			
            setVisible(false);
			Inf3 r=new Inf3();
			r.setVisible(true);
            }
	    }			
	  
	
	   });

        L_counter = new JLabel("Counter Strike");
        L_counter.setForeground(Color.WHITE);
        L_counter.setBounds(610,190,280,210);
        L_counter.setFont(f);
        c.add(L_counter);

        // --------------------------Fortnite----------------------------------

        I_fortnite = new ImageIcon(getClass().getResource("fortnite.jpg"));
        B_fortnite = new JButton(I_fortnite);
        B_fortnite.setBounds(60,340,200,245);
        B_fortnite.setCursor(cr);
        B_fortnite.setBorder(BorderFactory.createLineBorder(Color.white));
        c.add(B_fortnite);
		
		B_fortnite.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==B_fortnite)
        {
			
            setVisible(false);
			Inf4 r=new Inf4();
			r.setVisible(true);
            }
	    }			
	  
	
	   });

        L_fortnite = new JLabel("Fortnite");
        L_fortnite.setForeground(Color.WHITE);
        L_fortnite.setBounds(120,500,280,210);
        L_fortnite.setFont(f);
        c.add(L_fortnite);

        // ----------------------------Minecraft---------------------------------

        I_minecraft = new ImageIcon(getClass().getResource("Minecraft.png"));
        B_minecraft = new JButton(I_minecraft);
        B_minecraft.setBounds(318,340,200,245); 
        B_minecraft.setCursor(cr);
        B_minecraft.setBorder(BorderFactory.createLineBorder(Color.white));
        c.add(B_minecraft);
		
				B_minecraft.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==B_minecraft)
        {
			
            setVisible(false);
			Inf5 r=new Inf5();
			r.setVisible(true);
            }
	    }			
	  
	
	   });


        L_minecraft = new JLabel("Minecraft");
        L_minecraft.setForeground(Color.WHITE);
        L_minecraft.setBounds(370,500,280,210);
        L_minecraft.setFont(f);
        c.add(L_minecraft);

        // -------------------------------Valorant---------------------------------

        I_valorant = new ImageIcon(getClass().getResource("valorant.jpg"));
        B_valorant = new JButton(I_valorant);
        B_valorant.setBounds(580,340,200,245);
        B_valorant.setCursor(cr);
        B_valorant.setBorder(BorderFactory.createLineBorder(Color.white));
        c.add(B_valorant);
		
		B_valorant.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==B_valorant)
        {
			
            setVisible(false);
			Inf6 r=new Inf6();
			r.setVisible(true);
            }
	    }			
	  
	
	   });



        L_valorant = new JLabel("Valorant");
        L_valorant.setForeground(Color.WHITE);
        L_valorant.setBounds(645, 500, 280, 210);
        L_valorant.setFont(f);
        c.add(L_valorant);

        B_back = new JButton("<-BACK");
        B_back.setBorder(null);
        B_back.setFont(f);
        B_back.setCursor(cr);
        B_back.setBackground(Color.BLACK);
        B_back.setForeground(Color.WHITE);
        B_back.setBounds(0,610,100,30);
        c.add(B_back);
		
				B_back.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {  
	
        if(e.getSource()==B_back)
        {
			
            setVisible(false);
			Game r=new Game();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
	      setVisible(true);
        setResizable(false);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(300,0,850,700);
        setTitle("Diverse");
        

    }

    public static void main(String[] args) {
        FreeGame frame = new FreeGame();


    }

}