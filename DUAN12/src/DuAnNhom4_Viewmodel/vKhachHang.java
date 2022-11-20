/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Viewmodel;

import java.util.Date;

/**
 *
 * @author acer
 */
public class vKhachHang {
    private String idKH;
    private String maKH;
    private String hotenKH;
    private String gioiTinh;
    private Date ngaySinhKH;
    private String sdtKH;
    private String email;
    private String diachi;
    private String thanhPho;
    private String quocGia;
    private int trangthai;

    public vKhachHang() {
    }

    
    public vKhachHang(String idKH, String maKH, String hotenKH, String gioiTinh, Date ngaySinhKH, String sdtKH, String email, String diachi, String thanhPho, String quocGia, int trangthai) {
        this.idKH = idKH;
        this.maKH = maKH;
        this.hotenKH = hotenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinhKH = ngaySinhKH;
        this.sdtKH = sdtKH;
        this.email = email;
        this.diachi = diachi;
        this.thanhPho = thanhPho;
        this.quocGia = quocGia;
        this.trangthai = trangthai;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHotenKH() {
        return hotenKH;
    }

    public void setHotenKH(String hotenKH) {
        this.hotenKH = hotenKH;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinhKH() {
        return ngaySinhKH;
    }

    public void setNgaySinhKH(Date ngaySinhKH) {
        this.ngaySinhKH = ngaySinhKH;
    }

    public String getSdtKH() {
        return sdtKH;
    }

    public void setSdtKH(String sdtKH) {
        this.sdtKH = sdtKH;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }
    public String trangThai(){
        if(trangthai == 0){
            return "Ngừng hoạt động";
        } else {
            return "Hoạt động";
        }
    }
    @Override
    public String toString() {
        return "vKhachHang{" + "idKH=" + idKH + ", maKH=" + maKH + ", hotenKH=" + hotenKH + ", gioiTinh=" + gioiTinh + ", ngaySinhKH=" + ngaySinhKH + ", sdtKH=" + sdtKH + ", email=" + email + ", diachi=" + diachi + ", thanhPho=" + thanhPho + ", quocGia=" + quocGia + ", trangthai=" + trangThai() + '}';
    }
    

}
