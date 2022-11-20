/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Service;



import DuAnNhom4_domainModel.KhachHang;
import DuAnNhom4_repository.KhachHang_Repository;
import java.util.List;

/**
 *
 * @author acer
 */
public class KhacHang_Service {
     public static List<KhachHang> getAllKhachHang() {
        return KhachHang_Repository.getAllKhachHang();
    }

    public static KhachHang getKHbyMaKH(String makh) {
        return KhachHang_Repository.getKhbyMaKH(makh);
    }
}
