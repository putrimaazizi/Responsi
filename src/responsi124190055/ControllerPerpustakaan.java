package responsi124190055;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author putrimaazizi
 */
public class ControllerPerpustakaan {
    ModelPerpustakaan model;
    ViewPerpustakaan viewperpus;
    ViewDaftar viewdaftar;
    ViewHome viewhome;
    ViewAboutUs viewaboutus;
    ViewPinjam viewpinjam;
    ViewTampil viewtampil;
    ViewEdit viewedit;

    public ControllerPerpustakaan(ModelPerpustakaan model, ViewPerpustakaan viewperpus, ViewDaftar viewdaftar, ViewHome viewhome, ViewAboutUs viewaboutus, ViewPinjam viewpinjam, ViewTampil viewtampil, ViewEdit viewedit) {
        this.model = model;
        this.viewperpus = viewperpus;
        this.viewdaftar = viewdaftar;
        this.viewhome = viewhome;
        this.viewaboutus = viewaboutus;
        this.viewpinjam = viewpinjam;
        this.viewtampil = viewtampil;
        this.viewedit = viewedit;
        //Login
        viewperpus.jblogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = viewperpus.getUsername();
                String password = viewperpus.getPassword();
                model.cekAccount(username, password);
            }
        });
        
        viewperpus.jbdaftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewperpus.setVisible(false);
                viewdaftar.setVisible(true);
            }
        });
        
        viewperpus.jbexit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewperpus.dispose();
            } 
        });
        //Daftar
        viewdaftar.jbbatal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewdaftar.setVisible(false);
                viewperpus.setVisible(true);
            }
        });
        
        viewdaftar.jbdaftar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String username = viewperpus.getUsername();
                String password = viewperpus.getPassword();
                model.insertAccount(username, password);
            }
        });
        
        viewdaftar.jbexit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewdaftar.dispose();
            } 
        });
        //Home
        viewhome.jbhome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewhome.setVisible(true);
            }
        });
        
        viewhome.jbaboutus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewhome.setVisible(false);
                viewaboutus.setVisible(true);
            }
        });
        
        viewhome.jblogout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewhome.setVisible(false);
                viewperpus.setVisible(true);
            } 
        });
        
        viewhome.jbpinjam.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewhome.setVisible(false);
                viewpinjam.setVisible(true);
            } 
        });
        
        viewhome.jbtampil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewhome.setVisible(false);
                viewtampil.setVisible(true);
            } 
        });
        //About us
        viewaboutus.jbaboutus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewaboutus.setVisible(true);
            }
        });
        
        viewaboutus.jbhome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewaboutus.setVisible(false);
                viewhome.setVisible(true);
            }
        });
        
        viewaboutus.jblogout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewaboutus.setVisible(false);
                viewperpus.setVisible(true);
            } 
        });
        
        viewaboutus.jbpinjam.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewaboutus.setVisible(false);
                viewpinjam.setVisible(true);
            } 
        });
        
        viewaboutus.jbtampil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewaboutus.setVisible(false);
                viewtampil.setVisible(true);
            } 
        });
        //Pinjam
        viewpinjam.jbpinjam.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewpinjam.setVisible(true);
            }
        });
        
        viewpinjam.jbaboutus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewpinjam.setVisible(false);
                viewaboutus.setVisible(true);
            }
        });
        
        viewpinjam.jblogout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewpinjam.setVisible(false);
                viewperpus.setVisible(true);
            } 
        });
        
        viewpinjam.jbhome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewpinjam.setVisible(false);
                viewhome.setVisible(true);
            } 
        });
        
        viewpinjam.jbtampil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewpinjam.setVisible(false);
                viewtampil.setVisible(true);
            } 
        });
        
        viewpinjam.jbtambah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String id = viewpinjam.getIDanggota();
                String nama = viewpinjam.getNama();
                String idbuku = viewpinjam.getIDbuku();
                String judul = viewpinjam.getJudul();
                model.insertPinjambuku(id, nama, idbuku, judul);
            } 
        });
        
        viewpinjam.jbbatal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewpinjam.jtidanggota.setText("");
                viewpinjam.jtnama.setText("");
                viewpinjam.jtidbuku.setText("");
                viewpinjam.jtjudul.setText("");
            }
        });
        //Tampil
        viewtampil.jbtampil.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewtampil.setVisible(true);
            }
        });
        
        viewtampil.jbaboutus.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewtampil.setVisible(false);
                viewaboutus.setVisible(true);
            }
        });
        
        viewtampil.jblogout.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewtampil.setVisible(false);
                viewperpus.setVisible(true);
            } 
        });
        
        viewtampil.jbhome.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewtampil.setVisible(false);
                viewhome.setVisible(true);
            } 
        });
        
        viewtampil.jbpinjam.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                viewtampil.setVisible(false);
                viewpinjam.setVisible(true);
            } 
        });
        
        viewtampil.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewtampil.tabel.getSelectedRow();
                int kolom = viewtampil.tabel.getSelectedColumn(); 

                String dataterpilih = viewtampil.tabel.getValueAt(baris, 1).toString();
                System.out.println(dataterpilih);
                
                viewtampil.jbhapus.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        int input = JOptionPane.showConfirmDialog(null,
                            "Hapus data pinjam buku oleh Id Anggota " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                        if (input == 0) {
                            model.deletePinjambuku(dataterpilih);
                            String dataPinjambuku[][] = model.readPinjambuku();
                            viewtampil.tabel.setModel(new JTable(dataPinjambuku, viewtampil.namaKolom).getModel());
                        } else {
                            JOptionPane.showMessageDialog(null, "Hapus Data Batal");
                        }
                    }
                });
                //Edit
                viewtampil.jbedit.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        viewtampil.setVisible(false);
                        viewedit.setVisible(true);
                        viewedit.jtidanggota.setText(dataterpilih);
                        
                        viewedit.jbedit.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                String id = dataterpilih;
                                String nama = viewedit.getNama();
                                String idbuku = viewedit.getIDbuku();
                                String judul = viewedit.getJudul();
                                model.updatePinjambuku(id, nama, idbuku, judul);
                            }
                        });
                        
                        viewedit.jbbatal.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent ae) {
                                viewedit.jtidanggota.setText("");
                                viewedit.jtnama.setText("");
                                viewedit.jtidbuku.setText("");
                                viewedit.jtjudul.setText("");
                            }
                        });
                    } 
                }); 
            }
        });
    }


}

   