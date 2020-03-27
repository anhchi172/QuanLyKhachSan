
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class QuanLyKhachSan {
    private HashMap<Nguoi, KhachSan> hm;
    private KhachSanDAO khachSanDAO;

    public QuanLyKhachSan() {
        hm = new HashMap<>();
    }

    public void put(Nguoi n, KhachSan ks) {
        hm.put(n, ks);
        if (hm.size()!= 0)
            khachSanDAO.write(hm);
        System.out.println("Da them " + n.getHoTen() + " vao phong loai " + ks.getLoaiPhong());
    }

    public void xoa(int soCMND) {
        for (Map.Entry<Nguoi, KhachSan> entry : hm.entrySet()) {
            if (entry.getKey().getSoCMND() == soCMND) {
                hm.remove(entry);
                khachSanDAO.write(hm);
                System.out.println("Da xoa ca nhan voi so CMND " + soCMND);
            }

        }
    }

    public int tinhTien(int soCMND) {
        for (Map.Entry<Nguoi, KhachSan> entry : hm.entrySet()) {
            if (entry.getKey().getSoCMND() == soCMND) {
                int gia;
                char loaiPhong = entry.getValue().getLoaiPhong();
                if (loaiPhong == 'A')
                    gia = 500;
                else if (loaiPhong == 'B')
                    gia = 300;
                else
                    gia = 100;
                return gia * entry.getValue().getSoNgayThue();
            }
        }
        return 0;
    }

    public void exit(){
        System.out.println("Exit");
        return;
    }

}
