/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Service;


import java.util.List;
import DuAnNhom4_Viewmodel.vSanPham;
import DuAnNhom4_repository.vSanPham_Repository;

/**
 *
 * @author acer
 */
public class vSanPham_Service {

    public static List<vSanPham> getAllVSP() {
        return vSanPham_Repository.getAllVSP();
    }

    public static vSanPham getVSPbyMa(String mavsp) {
        return vSanPham_Repository.getVSPbymaSP(mavsp);
    }

    public static int themSP(vSanPham vsp) {
        return vSanPham_Repository.themSanPham(vsp);
    }

    public static int suaSP(vSanPham vsp) {
        return vSanPham_Repository.suaSanPham(vsp);
    }
}
