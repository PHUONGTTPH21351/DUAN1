/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Service;


import DuAnNhom4_domainModel.NhanVien;
import DuAnNhom4_repository.NhanVien_Repository;
import java.util.List;

/**
 *
 * @author acer
 */
public class NhanVien_Service {

    public static List<NhanVien> getALLNV() {
        return NhanVien_Repository.getAllNV();
    }

    public static NhanVien getNVbyma(String manv) {
        return NhanVien_Repository.getNVbyma(manv);
    }

    public static int them(NhanVien nv) {
        return NhanVien_Repository.them(nv);
    }

    public static int sua(NhanVien nv) {
        return NhanVien_Repository.sua(nv);
    }
}
