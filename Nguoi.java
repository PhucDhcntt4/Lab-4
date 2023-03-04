/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguoi;

/**
 *
 * @author HOANG PHUC
 */
public class Nguoi {
    private String Ten;
    private String NgaySinh;
    private String GioiTinh ;
       public String toString()
       {
           return "\nTen:" + this.Ten + "\nNgay Sinh:" + this.NgaySinh +"\nGioi Tinh:" + this.GioiTinh;
       }
    }
class NhanVien extends Nguoi{
    private double Luong;
    public String toString()
    {
        return "\nNhan Vien :" + super.toString() + "\nLuong : " + this.Luong;
    }
}   
class SinhVien extends Nguoi{
    private int Lop;
    public String toString()
            {
                return "\nSinh VIen:" + super.toString() + "\nLop:" + this.Lop;
    }
}

