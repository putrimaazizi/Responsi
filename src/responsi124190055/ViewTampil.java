package responsi124190055;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author putrimaazizi
 */
public class ViewTampil extends JFrame{
    JLabel jlperpus = new JLabel("PERPUSTAKAAN");
    JLabel jllist = new JLabel("LIST BUKU YANG DIPINJAM");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID", "Nama", "ID Buku", "Judul Buku"};
    
    JButton jblogout = new JButton("Logout");
    JButton jbhome = new JButton("Home");
    JButton jbpinjam = new JButton("Pinjam");
    JButton jbtampil = new JButton("Tampil");
    JButton jbaboutus = new JButton("About Us");
    JButton jbhapus = new JButton("Hapus");
    JButton jbedit = new JButton("Edit");
 
    public ViewTampil(){
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
        setLayout(null);
        setSize(500,450);
        
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        add(scrollPane);
        scrollPane.setBounds(20, 140, 320, 250);
        
        add(jblogout);
        jblogout.setBounds(370, 20, 90, 20);
        add(jlperpus);
        jlperpus.setBounds(150, 40, 150, 20);
        add(jbhapus);
        jbhapus.setBounds(100, 80, 90, 20);
        add(jbedit);
        jbedit.setBounds(200, 80, 90, 20);
        add(jllist);
        jllist.setBounds(130, 120, 190, 20);
        add(jbhome);
        jbhome.setBounds(370, 130, 90, 35);
        add(jbpinjam);
        jbpinjam.setBounds(370, 180, 90, 35);
        add(jbtampil);
        jbtampil.setBounds(370, 230, 90, 35);
        add(jbaboutus);
        jbaboutus.setBounds(370, 280, 90, 35);
        
    }
}
