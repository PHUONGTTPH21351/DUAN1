/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

import java.math.BigDecimal;

/**
 *
 * @author TRAN VAN DUONG
 */
public class SanPham {
    String IDSanPham;
    LoaiSanPham IDLoaiSanPham;
    String MaSanPham;
    String TenSanPham;
    int SoLuong;
    String HinhAnh;
    String Size;
    String MauSac;
    String ChatLieu;
    BigDecimal GiaNhap;
    BigDecimal GiaBan;

    public SanPham() {
    }

    public SanPham(String IDSanPham, LoaiSanPham IDLoaiSanPham, String MaSanPham, String TenSanPham, int SoLuong, String HinhAnh, String Size, String MauSac, String ChatLieu, BigDecimal GiaNhap, BigDecimal GiaBan) {
        this.IDSanPham = IDSanPham;
        this.IDLoaiSanPham = IDLoaiSanPham;
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.HinhAnh = HinhAnh;
        this.Size = Size;
        this.MauSac = MauSac;
        this.ChatLieu = ChatLieu;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public LoaiSanPham getIDLoaiSanPham() {
        return IDLoaiSanPham;
    }

    public void setIDLoaiSanPham(LoaiSanPham IDLoaiSanPham) {
        this.IDLoaiSanPham = IDLoaiSanPham;
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

    @Override
    public String toString() {
        return "SanPham{" + "IDSanPham=" + IDSanPham + ", IDLoaiSanPham=" + IDLoaiSanPham + ", MaSanPham=" + MaSanPham + ", TenSanPham=" + TenSanPham + ", SoLuong=" + SoLuong + ", HinhAnh=" + HinhAnh + ", Size=" + Size + ", MauSac=" + MauSac + ", ChatLieu=" + ChatLieu + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + '}';
    }
    
}
