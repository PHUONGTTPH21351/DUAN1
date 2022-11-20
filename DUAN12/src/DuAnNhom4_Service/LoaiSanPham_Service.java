/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Service;


import DuAnNhom4_domainModel.LoaiSanPham;
import DuAnNhom4_repository.LoaiSanPham_Repository;
import java.util.List;

/**
 *
 * @author acer
 */
public class LoaiSanPham_Service {

    public static List<LoaiSanPham> getAllLoaiSP() {
        return LoaiSanPham_Repository.getAllLoaiSP();
    }

    public static LoaiSanPham getLoaiSPbyMa(String maloai) {
        return LoaiSanPham_Repository.getLoaiSPbymaloai(maloai);
    }

    public static int themLoaiSP(LoaiSanPham loaisp) {
        return LoaiSanPham_Repository.themLoaiSanPham(loaisp);
    }

    public static int suaLoaiSP(LoaiSanPham loaisp) {
        return LoaiSanPham_Repository.suaLoaiSanPham(loaisp);
    }
}
