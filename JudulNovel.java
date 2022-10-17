public class JudulNovel extends Novel {
    protected String Judul_Novel;
    
    public JudulNovel(String Judul_Novel, String nama_penulis) {
        super(nama_penulis);
        this.Judul_Novel = Judul_Novel;
    }
    public void infoNovel(){
        System.out.println("Nama penulis : " + super.nama_penulis);
        System.out.println("Adalah seorang penulis novel : " +this.Judul_Novel);
    }
}
