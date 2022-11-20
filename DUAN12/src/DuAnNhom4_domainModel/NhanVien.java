/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_domainModel;

import java.util.Date;

/**
 *
 * @author acer
 */
public class NhanVien {

    private String idNV;
    private String maNV;
    private String hotenNV;
    private String gioiTinh;
    private Date ngaySinhNV;
    private String diachi;
    private String email;
    private String sdtnv;
    private String taikhoannv;
    private String mknv;
    private String hinhAnh;
    private int trangthai;

    public NhanVien() {
    }

    public NhanVien(String idNV, String maNV, String hotenNV, String gioiTinh, Date ngaySinhNV, String diachi, String email, String sdtnv, String taikhoannv, String mknv, String hinhAnh, int trangthai) {
        this.idNV = idNV;
        this.maNV = maNV;
        this.hotenNV = hotenNV;
        this.gioiTinh = gioiTinh;
        this.ngaySinhNV = ngaySinhNV;
        this.diachi = diachi;
        this.email = email;
        this.sdtnv = sdtnv;
        this.taikhoannv = taikhoannv;
        this.mknv = mknv;
        this.hinhAnh = hinhAnh;
        this.trangthai = trangthai;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHotenNV() {
        return hotenNV;
    }

    public void setHotenNV(String hotenNV) {
        this.hotenNV = hotenNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinhNV() {
        return ngaySinhNV;
    }

    public void setNgaySinhNV(Date ngaySinhNV) {
        this.ngaySinhNV = ngaySinhNV;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdtnv() {
        return sdtnv;
    }

    public void setSdtnv(String sdtnv) {
        this.sdtnv = sdtnv;
    }

    public String getTaikhoannv() {
        return taikhoannv;
    }

    public void setTaikhoannv(String taikhoannv) {
        this.taikhoannv = taikhoannv;
    }

    public String getMknv() {
        return mknv;
    }

    public void setMknv(String mknv) {
        this.mknv = mknv;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public String trangThai() {
        if (trangthai == 0) {
            return "Ngưng hoạt động";
        } else {
            return "Hoạt động";
        }
    }

    @Override
    public String toString() {
        return "NhanVien{" + "idNV=" + idNV + ", maNV=" + maNV + ", hotenNV=" + hotenNV + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinhNV + ", diachi=" + diachi + ", email=" + email + ", sdtnv=" + sdtnv + ", taikhoannv=" + taikhoannv + ", mknv=" + mknv + ", hinhAnh=" + hinhAnh + ", trangthai=" + trangThai() + '}';
    }

}
