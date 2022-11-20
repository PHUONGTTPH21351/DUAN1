/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_utility.JDBC_Helper;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DuAnNhom4_Viewmodel.vSanPham;

/**
 *
 * @author acer
 */
public class vSanPham_Repository {

    public static List<vSanPham> getAllVSP() {
        List<vSanPham> listVSP = new ArrayList();
        ResultSet rs;
        String sql = "select MASP, TENSP, SOLUONG, HINHANH, SIZE, MAUSAC, CHATLIEU, GIANHAP, GIABAN,LOAISANPHAM.ID, LOAISANPHAM.MA, LOAISANPHAM.TEN\n"
                + "from SANPHAM join LOAISANPHAM on SANPHAM.IDLOAISP = LOAISANPHAM.ID";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {

                String masp = rs.getString(1);
                String tensp = rs.getString(2);
                int soluongsp = rs.getInt(3);
                String hinhanhsp = rs.getString(4);
                String size = rs.getString(5);
                String mausacsp = rs.getString(6);
                String chatLieu = rs.getString(7);
                BigDecimal gianhap = rs.getBigDecimal(8);
                BigDecimal giaban = rs.getBigDecimal(9);
                String idloaisp = rs.getString(10);
                String maloaisp = rs.getString(11);
                String tenloaisp = rs.getString(12);
                vSanPham vsp = new vSanPham(masp, tensp, soluongsp, hinhanhsp, size, mausacsp, chatLieu, gianhap, giaban, idloaisp, maloaisp, tenloaisp);
                listVSP.add(vsp);
            }
            return listVSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static vSanPham getVSPbymaSP(String mavsp) {
        vSanPham vsp = new vSanPham();
        ResultSet rs;
        String sql = "select MASP, TENSP, SOLUONG, HINHANH, SIZE, MAUSAC, CHATLIEU, GIANHAP, GIABAN, LOAISANPHAM.ID, LOAISANPHAM.MA, LOAISANPHAM.TEN\n"
                + "from SANPHAM join LOAISANPHAM on SANPHAM.IDLOAISP = LOAISANPHAM.ID\n"
                + "where MASP = ?  ";

        rs = JDBC_Helper.selectTongQuat(sql, mavsp);
        try {
            while (rs.next()) {
                String masp = rs.getString(1);
                String tensp = rs.getString(2);
                int soluongsp = rs.getInt(3);
                String hinhanhsp = rs.getString(4);
                String size = rs.getString(5);
                String mausacsp = rs.getString(6);
                String chatLieu = rs.getString(7);
                BigDecimal gianhap = rs.getBigDecimal(8);
                BigDecimal giaban = rs.getBigDecimal(9);
                String idloaisp = rs.getString(10);
                String maloaisp = rs.getString(11);
                String tenloaisp = rs.getString(12);
                vsp = new vSanPham(masp, tensp, soluongsp, hinhanhsp, size, mausacsp, chatLieu, gianhap, giaban, idloaisp, maloaisp, tenloaisp);

            }
            return vsp;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int themSanPham(vSanPham vsp) {
        String sql = "Declare @idloaisp uniqueidentifier\n"
                + "set @idloaisp = (select ID from LOAISANPHAM where LOAISANPHAM.MA = ?) "
                + "insert into SANPHAM( IDLOAISP, MASP, TENSP, SOLUONG, HINHANH, SIZE, MAUSAC, CHATLIEU, GIANHAP, GIABAN)"
                + " values(@idloaisp, ?,?, ?, ?, ?, ?, ?, ?, ?)";
        return JDBC_Helper.updateTongQuat(sql, 
                 vsp.getIdloaisp(),
                vsp.getMaSanPham(), 
                vsp.getTenSanPham(),
                vsp.getSoLuong(),
                vsp.getHinhAnh(), 
                vsp.getSize(), 
                vsp.getMauSac(), 
                vsp.getChatLieu(), 
                vsp.getGiaNhap(), 
                vsp.getGiaBan());
    }

    public static int suaSanPham(vSanPham vsp) {
        String sql = "update SanPham set TENSP = ?, SOLUONG = ?, HINHANH = ?, SIZE = ?, MAUSAC = ?, CHATLIEU = ?, GIANHAP = ?, GIABAN = ? where MASP=? ";
        return JDBC_Helper.updateTongQuat(sql, vsp.getTenSanPham(), vsp.getSoLuong(),vsp.getHinhAnh(), 
                vsp.getSize(), vsp.getMauSac(), vsp.getChatLieu(), vsp.getGiaNhap(), vsp.getGiaBan(), vsp.getMaSanPham());
    }

    public static void main(String[] args) {
        // check các chức năng tại đây
        List<vSanPham> listCheck = new ArrayList<>();
        listCheck = getAllVSP();
        for (vSanPham x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
