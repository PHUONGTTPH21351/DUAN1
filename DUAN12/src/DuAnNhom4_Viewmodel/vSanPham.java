/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Viewmodel;

import java.math.BigDecimal;

/**
 *
 * @author acer
 */
public class vSanPham {

    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private String HinhAnh;
    private String Size;
    private String MauSac;
    private String ChatLieu;
    private BigDecimal GiaNhap;
    private BigDecimal GiaBan;
    private String idloaisp;
    private String MaLoai;
    private String TenLoai;

    public vSanPham() {
    }

    public vSanPham(String MaSanPham, String TenSanPham, int SoLuong, String HinhAnh, String Size, String MauSac, String ChatLieu, BigDecimal GiaNhap, BigDecimal GiaBan, String idloaisp, String MaLoai, String TenLoai) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.HinhAnh = HinhAnh;
        this.Size = Size;
        this.MauSac = MauSac;
        this.ChatLieu = ChatLieu;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
        this.idloaisp = idloaisp;
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getMauSac() {
        return MauSac;
    }

    public void setMauSac(String MauSac) {
        this.MauSac = MauSac;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public BigDecimal getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(BigDecimal GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(BigDecimal GiaBan) {
        this.GiaBan = GiaBan;
    }

    public String getIdloaisp() {
        return idloaisp;
    }

    public void setIdloaisp(String idloaisp) {
        this.idloaisp = idloaisp;
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
        return "vSanPham{" + "MaSanPham=" + MaSanPham + ", TenSanPham=" + TenSanPham + ", SoLuong=" + SoLuong + ", HinhAnh=" + HinhAnh + ", Size=" + Size + ", MauSac=" + MauSac + ", ChatLieu=" + ChatLieu + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + ", idloaisp=" + idloaisp + ", MaLoai=" + MaLoai + ", TenLoai=" + TenLoai + '}';
    }

    
    
    
}
