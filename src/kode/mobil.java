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
public class mobil {
    private String id;
    private String jenis;
    private String sewa;
    private String stok;
    
    public String getId(){
        return id;
    }
    
    public String getJenis() {
        return jenis;
    }

    public String getSewa() {
        return sewa;
    }

    public String getStok() {
        return stok;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setSewa(String sewa) {
        this.sewa = sewa;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
    
    
    public void insertMobil() {
        koneksi kon = new koneksi();
        String s = "INSERT INTO t_mobilxxx VALUES ('" + this.id + "', '" + this.jenis + "', '" + this.sewa + "', '" + this.stok + "')";
        kon.query(s);
    }

    public void updateMobil() {
        koneksi kon = new koneksi();
        String s = "UPDATE t_mobilxxx SET id_mobil = '" + this.id + "', jenis = '" + this.jenis + "', sewa = '" + this.sewa + "', stok = '" + this.stok + "' WHERE id_mobil = '" + this.id + "'";
        kon.query(s);
    }

    public void deleteMobil() {
        koneksi kon = new koneksi();
        String s = "DELETE FROM t_mobilxxx WHERE id_mobil = '" + this.id + "'";
        kon.query(s);
    }

    public ResultSet getMobil() {
        ResultSet r = null;
        koneksi kon = new koneksi();
        String s = "INSERT INTO t_mobilixxx VALUES ('" + this.id + "', '" + this.jenis + "', '" + this.sewa + "', '" + this.stok + "')";
        kon.query(s);
        return r;
    }
}
