package responsi124190055;
import javax.swing.*;
/**
 *
 * @author putrimaazizi
 */
public class ViewAboutUs extends JFrame{
    JLabel jlperpus = new JLabel("PERPUSTAKAAN");
    JLabel jlabout = new JLabel("ABOUT US");
    
    JButton jblogout = new JButton("Logout");
    JButton jbhome = new JButton("Home");
    JButton jbpinjam = new JButton("Pinjam");
    JButton jbtampil = new JButton("Tampil");
    JButton jbaboutus = new JButton("About Us");
   
    public ViewAboutUs(){
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
        setLayout(null);
        setSize(500,450);
        
        add(jblogout);
        jblogout.setBounds(370, 20, 90, 20);
        add(jlperpus);
        jlperpus.setBounds(200, 80, 150, 20);
        
        add(jbhome);
        jbhome.setBounds(90, 130, 90, 35);
        add(jbpinjam);
        jbpinjam.setBounds(90, 180, 90, 35);
        add(jbtampil);
        jbtampil.setBounds(90, 230, 90, 35);
        add(jbaboutus);
        jbaboutus.setBounds(90, 280, 90, 35);
        
        add(jlabout);
        jlabout.setBounds(250, 180, 190, 20);
    }
}
