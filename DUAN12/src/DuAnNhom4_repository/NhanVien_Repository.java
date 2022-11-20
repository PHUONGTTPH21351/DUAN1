/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_domainModel.NhanVien;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acer
 */
public class NhanVien_Repository {

    public static List<NhanVien> getAllNV() {
        List<NhanVien> listNV = new ArrayList();
        ResultSet rs;
        String sql = "select ID, MANV, HOTEN, GIOITINH, NgaySinh, DIACHI, EMAIL, SDT, TENTAIKHOAN, MATKHAU, TrangThai, HINHANH\n"
                + "from NHANVIEN";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idnv = rs.getString(1);
                String manv = rs.getString(2);
                String hotennv = rs.getString(3);
                String gioitinh = rs.getString(4);
                Date ngaysinh = rs.getDate(5);
                String diachi = rs.getString(6);
                String email = rs.getString(7);
                String sdtnv = rs.getString(8);
                String tentaikhoan = rs.getString(9);
                String matkhau = rs.getString(10);
                int trangthai = rs.getInt(11);
                String hinhanh = rs.getString(12);

                NhanVien nv = new NhanVien(idnv, manv, hotennv, gioitinh, ngaysinh, diachi, email, sdtnv, tentaikhoan, matkhau, hinhanh, trangthai);
                listNV.add(nv);
            }
            return listNV;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static NhanVien getNVbyma(String manhanvien) {
        NhanVien nv = new NhanVien();
        ResultSet rs;
        String sql = "select ID, MANV, HOTEN, GIOITINH, NgaySinh, DIACHI, EMAIL, SDT, TENTAIKHOAN, MATKHAU, TrangThai, HINHANH\n"
                + "from NHANVIEN"
                + "where MANV = ?";
        rs = JDBC_Helper.selectTongQuat(sql, manhanvien);
        try {
            while (rs.next()) {
                String idnv = rs.getString(1);
                String manv = rs.getString(2);
                String hotennv = rs.getString(3);
                String gioitinh = rs.getString(4);
                Date ngaysinh = rs.getDate(5);
                String diachi = rs.getString(6);
                String email = rs.getString(7);
                String sdtnv = rs.getString(8);
                String tentaikhoan = rs.getString(9);
                String matkhau = rs.getString(10);
                int trangthai = rs.getInt(11);
                String hinhanh = rs.getString(12);
                nv = new NhanVien(idnv, manv, hotennv, gioitinh, ngaysinh, diachi, email, sdtnv, tentaikhoan, matkhau, hinhanh, trangthai);
            }
            return nv;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int them(NhanVien nv) {
        String sql = "insert into NhanVien(MANV, HOTEN, GIOITINH, NgaySinh, DIACHI, EMAIL, SDT, TENTAIKHOAN, MATKHAU, TrangThai, HINHANH) values(?, ?, ?, ?, ?, ?, ?, ?, ?, 1, ?)";
        return JDBC_Helper.updateTongQuat(sql, nv.getMaNV(), nv.getHotenNV(), nv.getGioiTinh(), nv.getNgaySinhNV(), nv.getDiachi(),
                 nv.getEmail(), nv.getSdtnv(), nv.getTaikhoannv(), nv.getMknv(), nv.getTrangthai(), nv.getHinhAnh());
    }

    public static int sua(NhanVien nv) {
        String sql = "update NhanVien set HOTEN = ?, GIOITINH = ?, NgaySinh = ?, DIACHI = ?, EMAIL = ?,"
                + " SDT = ?, TENTAIKHOAN = ?, MATKHAU = ?, TrangThai = ?, HINHANH = ? where MANV=? ";
        return JDBC_Helper.updateTongQuat(sql, nv.getHotenNV(), nv.getGioiTinh(), nv.getNgaySinhNV(), nv.getDiachi(),
                 nv.getEmail(), nv.getSdtnv(), nv.getTaikhoannv(), nv.getMknv(), nv.getTrangthai(), nv.getHinhAnh(), nv.getMaNV());
    }
    
    public static void main(String[] args) {
        // check các chức năng tại đây
        List<NhanVien> listCheck = new ArrayList<>();
        listCheck = getAllNV();
        for (NhanVien x : listCheck) {
            System.out.println(x.toString());
        }
    }

}
