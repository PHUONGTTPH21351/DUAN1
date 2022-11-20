/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuAnNhom4_controller;

import DuAnNhom4_bean.DanhMucBean;
import DuAnNhom4_view.CaidatJPanel;
import DuAnNhom4_view.DondathangJPanel;
import DuAnNhom4_view.GiohangJPanel;
import DuAnNhom4_view.HoaDonJPanel;
import DuAnNhom4_view.HosoJPanel;
import DuAnNhom4_view.SanphamJPanel;
import DuAnNhom4_view.TrangchuJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem = null;
    
    
    public ChuyenManHinhController(JPanel jpnRoot){
        this.root = jpnRoot;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "Trangchu";
        
        jpnItem.setBackground(new Color(96,100,191));
        jlbItem.setBackground(new Color(96,100,191));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangchuJPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent( List<DanhMucBean> listItem){
        this.listItem = listItem;
        
        for (DanhMucBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    } 
    class LabelEvent implements MouseListener{
        private  JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        
        @Override
        public void mouseClicked(MouseEvent e) {
           switch(kind){
               case "Trangchu":
                   node = new TrangchuJPanel();
                   break;
               case "Sanpham":
                   node = new SanphamJPanel();
                   break;
               case "Giohang":
                   node = new GiohangJPanel();
                   break;
               case "Dondathang":
                   node = new DondathangJPanel();
                   break;
               case "Hoso":
                   node = new HosoJPanel();
                   break;
               case "Caidat":
                   node = new CaidatJPanel();
                   break;   
               case "Hoadon":
                   node = new HoaDonJPanel();
                   break;   
               default:
                   node = new TrangchuJPanel();
                   break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(96,100,191));
            jlbItem.setBackground(new Color(96,100,191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jpnItem.setBackground(new Color(76,175,80));
                jlbItem.setBackground(new Color(76,175,80));
            }
        }
        private void setChangeBackground(String kind){
            for (DanhMucBean item : listItem) {
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJlb().setBackground(new Color(96,100,191));
                    item.getJpn().setBackground(new Color(96,100,191));
                }else{
                    item.getJlb().setBackground(new Color(76,175,80));
                    item.getJpn().setBackground(new Color(76,175,80));
                }
            }
        }
        
    }
}
