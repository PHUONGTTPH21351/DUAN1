/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Service;



import DuAnNhom4_domainModel.SanPham;
import DuAnNhom4_repository.SanPham_Repository;
import java.util.List;

/**
 *
 * @author acer
 */
public class SanPham_Service {
     public static List<SanPham> getAllSP() {
        return SanPham_Repository.getAllSP();
    }

    public static SanPham getLoaiSPbyMa(String ma) {
        return SanPham_Repository.getSPbymaSP(ma);
    }
    
}
