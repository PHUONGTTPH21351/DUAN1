/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_domainModel;

/**
 *
 * @author TRAN VAN DUONG
 */
public class LoaiSanPham {
    String IDLoaiSanPham;
    String MaLoai;
    String TenLoai;

    public LoaiSanPham() {
    }

    public LoaiSanPham(String IDLoaiSanPham, String MaLoai, String TenLoai) {
        this.IDLoaiSanPham = IDLoaiSanPham;
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
    }

    public String getIDLoaiSanPham() {
        return IDLoaiSanPham;
    }

    public void setIDLoaiSanPham(String IDLoaiSanPham) {
        this.IDLoaiSanPham = IDLoaiSanPham;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    @Override
    public String toString() {
        return "LoaiSanPham{" + "IDLoaiSanPham=" + IDLoaiSanPham + ", MaLoai=" + MaLoai + ", TenLoai=" + TenLoai + '}';
    }
    
}
