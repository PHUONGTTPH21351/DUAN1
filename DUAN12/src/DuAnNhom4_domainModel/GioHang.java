/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_domainModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author TRAN VAN DUONG
 */
public class GioHang {
    String ID;
    KhachHang IDKhachHang;
    SanPham IDSanPham;
    Date NgayThemVaoGioHang;
    int SoLuong;
    BigDecimal DonGia;
    String HinhAnh;

    public GioHang() {
    }

    public GioHang(String ID, KhachHang IDKhachHang, SanPham IDSanPham, Date NgayThemVaoGioHang, int SoLuong, BigDecimal DonGia, String HinhAnh) {
        this.ID = ID;
        this.IDKhachHang = IDKhachHang;
        this.IDSanPham = IDSanPham;
        this.NgayThemVaoGioHang = NgayThemVaoGioHang;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.HinhAnh = HinhAnh;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public KhachHang getIDKhachHang() {
        return IDKhachHang;
    }

    public void setIDKhachHang(KhachHang IDKhachHang) {
        this.IDKhachHang = IDKhachHang;
    }

    public SanPham getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(SanPham IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public Date getNgayThemVaoGioHang() {
        return NgayThemVaoGioHang;
    }

    public void setNgayThemVaoGioHang(Date NgayThemVaoGioHang) {
        this.NgayThemVaoGioHang = NgayThemVaoGioHang;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public BigDecimal getDonGia() {
        return DonGia;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    @Override
    public String toString() {
        return "GioHang{" + "ID=" + ID + ", IDKhachHang=" + IDKhachHang + ", IDSanPham=" + IDSanPham + ", NgayThemVaoGioHang=" + NgayThemVaoGioHang + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + ", HinhAnh=" + HinhAnh + '}';
    }
    
}
