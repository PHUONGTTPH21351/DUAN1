/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Service;



import DuAnNhom4_Viewmodel.vKhachHang;
import DuAnNhom4_repository.vKhachHang_Repository;
import java.util.List;

/**
 *
 * @author acer
 */
public class vKhachHang_Service {
  public static List<vKhachHang> getAllVKhachHang() {
        return vKhachHang_Repository.getAllVKhachHang();
    }

    public static vKhachHang getKhbyMaKh(String makh) {
        return vKhachHang_Repository.getvKhbyMaKH(makh);
    }
        
    
}
