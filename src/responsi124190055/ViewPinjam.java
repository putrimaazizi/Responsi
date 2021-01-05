package responsi124190055;
import javax.swing.*;
/**
 *
 * @author putrimaazizi
 */
public class ViewPinjam extends JFrame {
    JLabel jlperpus = new JLabel("PERPUSTAKAAN");
    JLabel jlidanggota = new JLabel("ID Anggota : ");
    JTextField jtidanggota = new JTextField();
    JLabel jlnama = new JLabel("Nama : ");
    JTextField jtnama = new JTextField();
    JLabel jlidbuku = new JLabel("ID Buku : ");
    JTextField jtidbuku = new JTextField();
    JLabel jljudul = new JLabel("Judul Buku : ");
    JTextField jtjudul = new JTextField();
    
    JButton jblogout = new JButton("Logout");
    JButton jbhome = new JButton("Home");
    JButton jbpinjam = new JButton("Pinjam");
    JButton jbtampil = new JButton("Tampil");
    JButton jbaboutus = new JButton("About Us");
    JButton jbtambah = new JButton("Tambah");
    JButton jbbatal = new JButton("Batal");

    public ViewPinjam(){
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
        setLayout(null);
        setSize(500,450);
        
        add(jblogout);
        jblogout.setBounds(370, 20, 90, 20);
        add(jbhome);
        jbhome.setBounds(370, 130, 90, 35);
        add(jbpinjam);
        jbpinjam.setBounds(370, 180, 90, 35);
        add(jbtampil);
        jbtampil.setBounds(370, 230, 90, 35);
        add(jbaboutus);
        jbaboutus.setBounds(370, 280, 90, 35);
        
        add(jlperpus);
        jlperpus.setBounds(200, 80, 150, 20);
        add(jlidanggota);
        jlidanggota.setBounds(90, 130, 90, 20);
        add(jtidanggota);
        jtidanggota.setBounds(160, 130, 180, 20);
        
        add(jlnama);
        jlnama.setBounds(90, 170, 90, 20);
        add(jtnama);
        jtnama.setBounds(160, 170, 180, 20);
        
        add(jlidbuku);
        jlidbuku.setBounds(90, 210, 90, 20);
        add(jtidbuku);
        jtidbuku.setBounds(160, 210, 180, 20);
        
        add(jljudul);
        jljudul.setBounds(90, 250, 90, 20);
        add(jtjudul);
        jtjudul.setBounds(160, 250, 180, 20);
        
        add(jbtambah);
        jbtambah.setBounds(150, 300, 90, 20);
        add(jbbatal);
        jbbatal.setBounds(250, 300, 90, 20);
    }
    
    public String getIDanggota() {
        return jtidanggota.getText();
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
