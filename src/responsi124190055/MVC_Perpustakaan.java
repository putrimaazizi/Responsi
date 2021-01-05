package responsi124190055;

/**
 *
 * @author putrimaazizi
 */
public class MVC_Perpustakaan {
    ViewPerpustakaan vp = new ViewPerpustakaan();
    ViewDaftar vd = new ViewDaftar();
    ViewHome vh = new ViewHome();
    ViewPinjam vpi = new ViewPinjam();
    ViewTampil vt = new ViewTampil();
    ViewEdit ve = new ViewEdit();
    ViewAboutUs va = new ViewAboutUs();
    ModelPerpustakaan mp = new ModelPerpustakaan();
    ControllerPerpustakaan cp = new ControllerPerpustakaan(mp, vp, vd, vh, va, vpi, vt, ve);
    
    
}
