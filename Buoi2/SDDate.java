package Buoi2;

public class SDDate {
    public static void main(String[] args){
        Date date = new Date(29, 2, 1999);
        Date date1 = new Date();
        date1.nhapNgay();
        if(date.hopLe()){
            System.out.println("Ngay he thong hop le");
        }else System.out.println("Ngay khong hop le");
        date1.ngayHomSau().hienThiNgay();
        date1.congNgay(99).hienThiNgay();
    }
}
