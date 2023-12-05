/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kode;
import java.sql.ResultSet;

/**
 *
 * @author LENOVO
 */
public class peminjaman {
    private String peminjaman; 
    private String pelanggan; 
    private String mobil; 
    private String pegawai; 
    private String ptanggal; 
    private String pbulan; 
    private String ptahun; 
    private String lama; 
    private String ktahun;
    private String biaya;
    private String telat;
    private String denda;

    public peminjaman (){ }
    public String getPem(){ return peminjaman; }
    public String getPel(){ return pelanggan; }
    public String getMobil(){ return mobil; }
    public String getPetugas(){ return pegawai; }
    public String getPtanggal(){ return ptanggal; }
    public String getPbulan(){ return pbulan; }
    public String getPtahun(){ return ptahun; }
    public String getLama(){ return lama; }
    public String getKtahun(){ return ktahun; }
    public String getBiaya(){ return biaya; }
    public String getTelat(){ return telat; }
    public String getDenda(){ return denda; }
    public void setPem(String peminjaman){ this.peminjaman = peminjaman; }
    public void setPel(String pelanggan){ this.pelanggan = pelanggan; }
    public void setMobil(String mobil){ this.mobil = mobil; }
    public void setPtanggal(String ptanggal){ this.ptanggal = ptanggal; } 
    public void setPbulan(String pbulan){ this.pbulan = pbulan; } 
    public void setPtahun(String ptahun){ this.ptahun = ptahun; }
    public void setLama(String lama){ this.lama = lama; }
    public void setKtahun(String ktahun){ this.ktahun = ktahun; } 
    public void setPegawai(String pegawai){ this.pegawai = pegawai; } 
    public void setBiaya(String biaya){ this.biaya = biaya; } 
    public void setTelat(String telat){ this.telat = telat; }
    public void setDenda(String denda){ this.denda = denda; } 
    
    public void insertPeminjaman(){ 
        koneksi kon = new koneksi();
        String s = "insert into peminjaman values ('" + this.peminjaman + "', '" + this.pelanggan + "', '" + this.mobil + "','" + this.pegawai + "', '" + this.ptanggal + "/" + this.pbulan + "/" + this.ptahun + "','" + this.ktahun + "', '" + this.lama + "', '0', '" + this.biaya + "', '0')";
        kon.query(s);
    } 
    
    public void updatePeminjaman(){
        koneksi kon = new koneksi();
        String s = "update peminjaman set telat = '" + this.telat + "', denda ='" + this.denda + "' where id_peminjaman = '" + this.peminjaman + "'";
        kon.query(s);
    }
    
    public void deletePeminjaman(){
        koneksi kon = new koneksi();
        String s = "delete from peminjaman where id_peminjaman ='" + this.peminjaman + "'";
        kon.query(s);
    }

    public ResultSet getPeminjaman(){
        ResultSet r = null;
        koneksi kon = new koneksi();
        String s = "insert into peminjaman values ( '" + this.peminjaman + "','" + this.pelanggan + "', '" + this.mobil + "' ,'" + this.pegawai + "', ' " + this.ptanggal + "/" + this.pbulan + "/" + this.ptahun + " ' , '" + this.ktahun + "', '" + this.lama + "', '0', '" + this.biaya + "', '0')";
        kon.query(s);
        return r;
    }
}
