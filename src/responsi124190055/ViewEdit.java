package responsi124190055;
import javax.swing.*;
/**
 *
 * @author putrimaazizi
 */
public class ViewEdit extends JFrame{
    JLabel jlperpus = new JLabel("PERPUSTAKAAN");
    JLabel jlidanggota = new JLabel("ID Anggota : ");
    JTextField jtidanggota = new JTextField();
    JLabel jlnama = new JLabel("Nama : ");
    JTextField jtnama = new JTextField();
    JLabel jlidbuku = new JLabel("ID Buku : ");
    JTextField jtidbuku = new JTextField();
    JLabel jljudul = new JLabel("Judul Buku : ");
    JTextField jtjudul = new JTextField();
    
    JButton jbbatal = new JButton("Batal");
    JButton jbedit = new JButton("Edit");
    
    public ViewEdit(){
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
        setLayout(null);
        setSize(500,450);
        
        add(jlperpus);
        jlperpus.setBounds(200, 80, 150, 20);
        add(jlidanggota);
        jlidanggota.setBounds(120, 130, 90, 20);
        add(jtidanggota);
        jtidanggota.setBounds(200, 130, 180, 20);
        
        add(jlnama);
        jlnama.setBounds(120, 170, 90, 20);
        add(jtnama);
        jtnama.setBounds(200, 170, 180, 20);
        
        add(jlidbuku);
        jlidbuku.setBounds(120, 210, 90, 20);
        add(jtidbuku);
        jtidbuku.setBounds(200, 210, 180, 20);
        
        add(jljudul);
        jljudul.setBounds(120, 250, 90, 20);
        add(jtjudul);
        jtjudul.setBounds(200, 250, 180, 20);
        
        add(jbbatal);
        jbbatal.setBounds(150, 300, 90, 20);
        add(jbedit);
        jbedit.setBounds(250, 300, 90, 20);
    }
    
    public String getNama() {
        return jtnama.getText();
    }
    
    public String getIDbuku() {
        return jtidbuku.getText();
    }

    public String getJudul() {
        return jtjudul.getText();
    }
}
