/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khoirul-06990
 */
public class Kiriman extends Pemesanan{
    Pemesanan[] pesan;
    private String status;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Kiriman()
    {
        
    }
    
    public Kiriman(String status, String nama, String namaBarang,int jumlah, String alamatPemesanan) {
        super(nama, namaBarang, alamatPemesanan, jumlah);
        this.status = status;
    }

    public Kiriman(String nama, String namaBarang, String alamatPemesanan) {
        super(nama, namaBarang, alamatPemesanan);
    }

    public void setPesan(Pemesanan[] pesan) {
        this.pesan = pesan;
    }
            
    public void laporanKiriman()
    {
        System.out.println("nama pemesan      : "+super.getNama());
        System.out.println("nama Barang       : "+super.getNamaBarang());
        System.out.println("alamat pengiriman : "+super.getAlamatPemesanan());
    }
}
