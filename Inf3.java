import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Inf3 extends JFrame{

    private Container c;
    private JButton bt1,b1, bt2, bt3,search,discover,b4,b,feedback,news;
    private JLabel l1,l2,l3,price,dev,date;
    private Font f,f1;
    private ImageIcon trailer,buy,icon,cart;
    private Cursor cr;
	private JTextField gprice;


    Inf3(){

        Show();
    }

    public void Show(){

     c = this.getContentPane();
     c.setLayout(null);
     c.setBackground(Color.BLACK);
	 icon = new ImageIcon(getClass().getResource("Icon.png"));
     this.setIconImage(icon.getImage());

    f = new Font("Debug",Font.BOLD,20);
    f1 = new Font("Debug",Font.ITALIC,16);
    cr = new Cursor(Cursor.HAND_CURSOR);

    icon = new ImageIcon(getClass().getResource("counter.jpg"));
    l3 = new JLabel(icon);
    l3.setCursor(cr);
    l3.setBounds(850,50,200,180);   
    c.add(l3); 
    
    trailer = new ImageIcon(getClass().getResource("counter.gif"));
    l1 = new JLabel(trailer);
    l1.setCursor(cr);
    l1.setBounds(120,50,700,400);
    c.add(l1);

    bt2 = new JButton("Store");
    bt2.setBounds(0,40,100,30);
    bt2.setFont(f);
    bt2.setBorder(null);
    bt2.setBackground(Color.BLACK);
    bt2.setForeground(Color.WHITE);
    bt2.setCursor(cr);
    c.add(bt2);
   
    b4= new JButton("Library");
    b4.setBounds(0,100,100,30);
    b4.setFont(f);
    b4.setBorder(null);
    b4.setBackground(Color.BLACK);
    b4.setForeground(Color.WHITE);
    b4.setCursor(cr);
    c.add(b4);

    b= new JButton("Wishlist");
    b.setBounds(0,160,100,30);
    b.setFont(f);
    b.setBorder(null);
    b.setBackground(Color.BLACK);
    b.setForeground(Color.WHITE);
    b.setCursor(cr);
    c.add(b);

	search = new JButton("Search ");
	search.setFont(f);
	search.setCursor(cr);
	search.setBounds(120,0,80,50);
	search.setBorder(null);
    search.setBackground(Color.BLACK);
    search.setForeground(Color.WHITE);
	c.add(search);

	discover = new JButton("Discover");
    discover.setFont(f);
	discover.setCursor(cr);
	discover.setBounds(250,0,100,50);
	discover.setBorder(null);
    discover.setBackground(Color.BLACK);
    discover.setForeground(Color.WHITE);
	c.add(discover);

    news = new JButton("News");
    news.setFont(f);
	news.setCursor(cr);
	news.setBounds(380,0,100,50);
	news.setBorder(null);
    news.setBackground(Color.BLACK);
    news.setForeground(Color.WHITE);
	c.add(news);

    feedback = new JButton("Feedback");
	feedback.setFont(f);
	feedback.setCursor(cr);
	feedback.setBounds(500,0,100,50);
	feedback.setBorder(null);
    feedback.setBackground(Color.BLACK);
    feedback.setForeground(Color.WHITE);
	c.add(feedback);
	

    l2 = new JLabel("Play Counter-Strike: Global Offensive");
    l2.setForeground(Color.WHITE);
    l2.setBounds(120,430,800,100);
    l2.setFont(f);
    l2.setCursor(cr);
    c.add(l2);
    
    price = new JLabel("Price $:");
    price.setForeground(Color.WHITE);
    price.setBounds(850,240,80,50);
    price.setFont(f);
    price.setCursor(cr);
    c.add(price);

	gprice = new JTextField();
	gprice.setText("FREE");
	gprice.setBackground(Color.BLACK);
    gprice.setForeground(Color.WHITE);
    gprice.setBounds(930,258,80,20);
	gprice.setBorder(null);
    gprice.setFont(f);
    gprice.setCursor(cr);
    c.add(gprice);
	
    buy = new ImageIcon(getClass().getResource("GET.png"));
    bt1 = new JButton(buy);
    bt1.setBounds(850,290,200,47);
    bt1.setCursor(cr);
    c.add(bt1);
	
		
		bt1.addActionListener(new ActionListener(){
			
		
		public void actionPerformed(ActionEvent e) {  
	    if(e.getSource()==bt1)
        {
			setVisible(false);
			Claimed r=new Claimed();
			r.setVisible(true);
            }
	    }			
	  
	
	   });

    cart = new ImageIcon(getClass().getResource("cart.png"));
    bt3 = new JButton(cart);
	bt3.setCursor(cr);
    bt3.setBounds(850,345,200,47); 
    c.add(bt3);
    
    dev = new JLabel("Developer: Nexon");
    dev.setForeground(Color.WHITE);
    dev.setBounds(850,390,300,40);
    dev.setFont(f1);
    dev.setCursor(cr);
    c.add(dev);

    date = new JLabel("Released in : November 9, 2000");
    date.setForeground(Color.WHITE);
    date.setCursor(cr);
    date.setBounds(850,420,300,40);
    date.setFont(f1);
    c.add(date);


    	b1 = new JButton("<-Back");
    b1.setBorder(null);
    b1.setFont(f);
	b1.setCursor(cr);
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    //b1.setBorder(null);
    b1.setCursor(cr);
    b1.setBounds(0,530,77,30);
    c.add(b1);
	
		b1.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e) {  
	    if(e.getSource()==b1)
        {
			setVisible(false);
			FreeGame r=new FreeGame();
			r.setVisible(true);
            }
	    }			
	  
	
	   });
	
               
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,0,1100,600);
        setTitle("Counter Strike");
    }


    public static void main(String[] args) {
        
        Inf3 frame = new Inf3();
     }
}
    