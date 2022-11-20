/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_domainModel.KhachHang;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import DuAnNhom4_Viewmodel.vKhachHang;

/**
 *
 * @author acer
 */
public class vKhachHang_Repository {
      public static List<vKhachHang> getAllVKhachHang() {
        List<vKhachHang> listVKH = new ArrayList();
        ResultSet rs;
        String sql = "select ID, MAKH, HOTEN, GIOITINH, NGAYSINH, SDT, EMAIL, DIACHI, THANHPHO, QUOCGIA, TrangThai\n"
                + "from KhachHang ";

        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idkh = rs.getString(1);
                String makhachhang = rs.getString(2);
                String hoten = rs.getString(3);
                String gioitinh = rs.getString(4);
                Date ngaySinh = rs.getDate(5);
                String sdt = rs.getString(6);
                String email = rs.getString(7);
                String diachi = rs.getString(8);
                String thanhPho = rs.getString(9);
                String quocgia = rs.getString(10);
                int trangThai = rs.getInt(11);
                vKhachHang vkh = new vKhachHang(idkh, makhachhang, hoten, gioitinh, ngaySinh, sdt, email, diachi, thanhPho, quocgia, trangThai);
                listVKH.add(vkh);
            }
            return listVKH;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static vKhachHang getvKhbyMaKH(String makh) {
        vKhachHang vkh = new vKhachHang();
        ResultSet rs;
        String sql = "select ID, MAKH, HOTEN, GIOITINH, NGAYSINH, SDT, EMAIL, DIACHI, THANHPHO, QUOCGIA, TrangThai\n"
                + "from KhachHang "
                + "where MAKH = ? ";

        rs = JDBC_Helper.selectTongQuat(sql, makh);
        try {
            while (rs.next()) {
                 String idkh = rs.getString(1);
                String makhachhang = rs.getString(2);
                String hoten = rs.getString(3);
                String gioitinh = rs.getString(4);
                Date ngaySinh = rs.getDate(5);
                String sdt = rs.getString(6);
                String email = rs.getString(7);
                String diachi = rs.getString(8);
                String thanhPho = rs.getString(9);
                String quocgia = rs.getString(10);
                int trangThai = rs.getInt(11);
                vkh = new vKhachHang(idkh, makhachhang, hoten, gioitinh, ngaySinh, sdt, email, diachi, thanhPho, quocgia, trangThai);

            }
            return vkh;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static void main(String[] args) {
        // check các chức năng tại đây
        List<vKhachHang> listCheck = new ArrayList<>();
        listCheck = getAllVKhachHang();
        for (vKhachHang x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
