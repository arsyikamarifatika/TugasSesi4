public class Buku {
    public static void main(String[] args) {
        Novel novelku = null;
        
        JudulNovel Judulnovel = new JudulNovel ("My Youth", "Giantara Alam");
        JumlahHal jml_hal = new JumlahHal(368, "Giantara Alam");
        novelku = Judulnovel;
        novelku.infoNovel();
        
        novelku = jml_hal;
        novelku.infoNovel();
        
    }
      
}
