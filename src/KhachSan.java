public class KhachSan {
    private int soNgayThue;
    private char loaiPhong;
    private int gia;

    public KhachSan(int s, char l) {
        soNgayThue = s;
        loaiPhong = l;
       /* if (loaiPhong == 'A')
            gia = 500;
        else if (loaiPhong == 'B')
            gia = 300;
        else
            gia = 100;*/
    }
    public int getSoNgayThue(){
        return soNgayThue;
    }
    public char getLoaiPhong(){
        return loaiPhong;
    }
   /* public int getGia{
        return gia;
    }*/
}

