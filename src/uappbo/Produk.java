package uappbo;

public class Produk {
    private String oldname;
    private String namaProduk;
    private double harga;
    private int jumlah;
    private double diskon;
    
    public Produk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public Produk(){}
    
    public Produk(String nama_produk,double harga){
        this.namaProduk = nama_produk;
        this.harga = harga;
    }
    
    public Produk(String nama_produk, double harga,int jumlah,double diskon,String oldname){
        this.namaProduk = nama_produk;
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
        this.oldname = oldname;
    }
    
    public Produk(String nama_produk,double harga, int jumlah,double diskon){
        this.namaProduk = nama_produk;
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }
    
    private double hargaDiskon(){
        return harga - (harga*diskon);
    }

    public String getNama_produk() {
        return namaProduk;
    }

    public void setNama_produk(String nama_produk) {
        this.namaProduk = nama_produk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public String getOldname() {
        return oldname;
    }

    public void setOldname(String oldname) {
        this.oldname = oldname;
    }
}
