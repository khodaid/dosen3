/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khoirul-06990
 */
import java.util.*;
public class Controller {
//    ArrayList<Pemesanan> pesan = new ArrayList<>();
    static ArrayList<Kiriman> kirim = new ArrayList<Kiriman>();
    static Kiriman k = new Kiriman();
    CustomerPembelian cp = new CustomerPembelian();
    
    static void insert(String nama, String barang, int jumlah, String alamat)
    {   
        
        String status = "Disiapkan";
        kirim.add(new Kiriman(status, nama, barang, jumlah, alamat));
    }
    
    public Controller()
    {
        
    }
        
//    static void add()
//    {
//        String status = "Disiapkan";
//        kirim.add(new Kiriman(status, cp.Nama.getText(), (String)cp.cmbBarang.getSelectedItem(), (Integer) cp.jumlahbarang.getValue(), cp.Alamat.getText()));
//    }
    
//    static Object[] data()
//    {
//        Object[] data = null;
//        for (int i = 0; i<kirim.size(); i++)
//        {
//            data =(new Object[] {
//                kirim.get(i).getNama(),
//                kirim.get(i).getNamaBarang(),
//                kirim.get(i).getJumlahBarang(),
//                kirim.get(i).getAlamatPemesanan(),
//                kirim.get(i).getHargaTotal(),
//                kirim.get(i).getStatus()});
//        }
//        return data;
//    }
    
//    static Object[][] data()
//    {
//        Object[][] data = null;
//        
//        for (int i = 0; i<kirim.size(); i++)
//        {
//            data[i][0] = (new Object[] {
//                kirim.get(i).getNama(),
//                kirim.get(i).getNamaBarang(),
//                kirim.get(i).getJumlahBarang(),
//                kirim.get(i).getAlamatPemesanan(),
//                kirim.get(i).getHargaTotal(),
//                kirim.get(i).getStatus()});
//        }
//    
//        return data;
//    }
    
    static void updateStatus(int i, String updatename, String barang, int jumlah, String alamat, String status)
    {
//            Controller.kirim.get(i).setStatus((String)cmbupdate.getSelectedItem());
        kirim.set(i, new Kiriman(status, updatename, barang, jumlah, alamat));
    }
}
