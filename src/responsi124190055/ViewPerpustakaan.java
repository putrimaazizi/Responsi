package responsi124190055;
import javax.swing.*;
/**
 *
 * @author putrimaazizi
 */
public class ViewPerpustakaan extends JFrame {
    
    JLabel jllogin = new JLabel("LOGIN");
    JLabel jlusername = new JLabel("Username : ");
    JTextField jtusername = new JTextField();
    JLabel jlpassword = new JLabel("Password : ");
    JTextField jtpassword = new JTextField();
    
    JButton jbexit = new JButton("Exit");
    JButton jblogin = new JButton("Login");
    JButton jbdaftar = new JButton("Daftar");        
    
    public ViewPerpustakaan(){
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        setVisible(true);
        setLayout(null);
        setSize(500,450);
        
        add(jbexit);
        jbexit.setBounds(370, 20, 90, 20);
        add(jllogin);
        jllogin.setBounds(220, 80, 90, 20);
        
        add(jlusername);
        jlusername.setBounds(120, 180, 90, 20);
        add(jtusername);
        jtusername.setBounds(190, 180, 180, 20);
        
        add(jlpassword);
        jlpassword.setBounds(120, 210, 90, 20);
        add(jtpassword);
        jtpassword.setBounds(190, 210, 180, 20);
    
        add(jblogin);
        jblogin.setBounds(150, 300, 90, 20);
        add(jbdaftar);
        jbdaftar.setBounds(250, 300, 90, 20);
    }

    public String getUsername() {
        return jtusername.getText();
    }

    public String getPassword() {
        return jtpassword.getText();
    }
 
}


