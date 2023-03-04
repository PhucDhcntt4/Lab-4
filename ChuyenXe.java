/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuyenxe;

/**
 *
 * @author HOANG PHUC
 */
  public class ChuyenXe {
private String MaSoChuyen,HoTenTaiXe,SoXe;
private double DoanhThu;
   public String toString()
   {
       return "\nMS chuyen:" + MaSoChuyen+ "\nTaiXe:"+ HoTenTaiXe + "\nSoXe:"+SoXe + "\nDoanh Thu:" + DoanhThu;
   }
}
    class NoiThanh extends ChuyenXe{
        private double SoKm;
        private String SoTuyen;
        public String toString()
        {
            return "\nchuyen xe noi thanh:" + super.toString()+"\n So Tuyen:" + this.SoTuyen + "\nSo Km:" + this.SoKm ;
            
        }
    }
    class NgoaiThanh extends ChuyenXe{
        private String NoiDen;
        private int SoNgay;
        
        public String toString()
        {
            return "Chuyen Xe Ngoai Thanh: " + super.toString()+"\nNoi Den" + this.NoiDen + "\nSo Ngay:" + this.SoNgay;  
        }
    }
    
