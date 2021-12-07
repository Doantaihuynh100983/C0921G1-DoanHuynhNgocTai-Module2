package thi_module2.service;

public interface DienThoaiService {
    void addChinhHang();
    void addXachTay();
    void disPlay();
    void delete(String ID);
    void search(String tenDienThoai);
    boolean checkSearchID(String tenDienThoai);
    boolean checkDeleteID(String ID);
}
