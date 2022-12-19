package uappbo;

public class Barang extends Produk {
    private String barcode;
    private String expired;
    private String kategori;
    
    public Barang(){}
    
    public Barang(String barcode){
        this.barcode = barcode;
    }
    
    public Barang(String namaProduk,String kategori){
        super(namaProduk);
        this.kategori = kategori;
    }
    
    public Barang(String barcode,String namaProduk,double harga, int jumlah,double diskon,String expired, String kategori){
        super(namaProduk,harga,jumlah,diskon);
        this.barcode = barcode;
        this.expired = expired;
        this.kategori = kategori;
//        kategori.add(kat = new Kategori(nama_kategori));
        
    }
    
    public boolean isExpired(){
        return true;
    }
    
    public Kategori addKategori(){
       return null;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getExpired() {
        return expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
