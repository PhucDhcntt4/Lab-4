/*

 */
package car;


public class Car {
private String Mauxe;
private String BienSo;
private String NoiSanXuat;
private String TenXe;
public String toString()
    {
    return "\nTen Xe: " + this.TenXe +"\nMau Xe:" + this.Mauxe + "\nBien So:" + this.BienSo + "\nNoi San Xuat:" + this.NoiSanXuat;
    
    }       
}
class SportsCar extends Car{
    private int SoGhe;
    private String ThongSo;
    private int TocDoMax;
    public String toString()
    {
        return "SportsCar:" + super.toString() + "\nSoGhe:" + this.SoGhe + "\nThong So ki thuat:" + this.ThongSo + "\nToc do toi da:" + this.TocDoMax;
    }
}
class Carluxury extends Car{
    private String kieuDang;
    private String NoiThat;
    public String toString()
    {
        return "Carluxury :" + super.toString() + "\nKieu Dang:" + this.kieuDang + "\nNoi That:" + this.NoiThat;
    }
}
class CarFamily extends Car{
    private String CauTruc;
    private String KhongGian;
//.....
public String toString()
{
    return "Car Family :" + super.toString() + "\nCau truc:" + this.CauTruc +"\nkhong gian:" + this.KhongGian;
}
}

