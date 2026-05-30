package Buoi5.Practice1;

public class KhachHangVIP extends KhachHang{
    private myDate ngayLenVIP;
    private double discountRate;

    public KhachHangVIP(){
        this.ngayLenVIP = new myDate();
        this.discountRate = 0.1;
    }

    @Override
    public double getDiscount(){
        return this.discountRate;
    }
    @Override
    public String toString(){
        return super.toString() + " | VIP date: " + ngayLenVIP.toString();
    }
}
