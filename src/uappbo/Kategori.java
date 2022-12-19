package uappbo;

public class Kategori {
    private Produk produk  = new Produk();
    private String nama_kategori;

    public Kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public Kategori() {
    }
    
    public Produk getProduk(){
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public String getNama_kategori() {
        return nama_kategori;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
}
