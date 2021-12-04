package thi.service;

public interface QuanLyNganHang {
    void addTietKiem();
    void addThanhToan();
    void disPlay();
    void delete(String ma);
    void search(String tenNganHang);
    boolean checkSearchName(String name);
    boolean checkSearchMaNganHang(String ma);

}
