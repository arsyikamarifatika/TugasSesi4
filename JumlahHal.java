public class JumlahHal extends Novel {
    protected int jml_hal;
    
    public JumlahHal(int jml_hal, String nama_penulis)  {
        super(nama_penulis);
        this.jml_hal = jml_hal;
    }
    
public void infoNovel(){
    System.out.println("Nama Penulis: " + super.nama_penulis);
    System.out.println("Jumlah hal pada novel: " + this.jml_hal + "Halaman");
}
}
