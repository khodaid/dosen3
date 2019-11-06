/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khoirul-06990
 */
public class Pemesanan {
    private String namaBarang, alamatPemesanan, nama;
    private int jumlahBarang, hargaTotal;
    private Kiriman kiriman;
    
    Pemesanan(String nama, String namaBarang, String alamatPemesanan, int jumlahBarang) {
        this.nama = nama;
        this.namaBarang = namaBarang;
        this.alamatPemesanan = alamatPemesanan;
        this.jumlahBarang = jumlahBarang;
        switch (namaBarang) {
            case "TV":
                this.hargaTotal = 1500000 * jumlahBarang;
                break;
            case "HandPhone":
                this.hargaTotal = 2000000 * jumlahBarang;
                break;
            case "Laptop":
                this.hargaTotal = 3500000 * jumlahBarang;
                break;
            default:
                break;
        }
    }
    
    Pemesanan(String nama, String namaBarang, String alamatPemesanan) {
        this.nama = nama;
        this.namaBarang = namaBarang;
        this.alamatPemesanan = alamatPemesanan;
    }
    
    Pemesanan(){
        
    }
    
    public String getNama() {
        return nama;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public String getAlamatPemesanan() {
        return alamatPemesanan;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public int getHargaTotal() {
        return hargaTotal;
    }
    
    public void ListPesanan()
    {
        System.out.println("Nama              : "+nama);
        System.out.println("Nama Produk       : "+namaBarang);
        System.out.println("Jumlah Barang     : "+jumlahBarang);
        System.out.println("Alamat Pengiriman : "+alamatPemesanan);
        System.out.println("Harga Total       : "+hargaTotal);
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setAlamatPemesanan(String alamatPemesanan) {
        this.alamatPemesanan = alamatPemesanan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public void setHargaTotal(int hargaTotal) {
        this.hargaTotal = hargaTotal;
    }
}
