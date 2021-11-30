package quan_ly_ngan_hang.servcie.servcieimpl;

public interface NganHang {
    void add();

    void delete(int maNganHang);

    void disPlay();

    void search(int maNganHang);

    void search(String tenChuTaiKhoan);

    boolean checkDelete(String maNganHang);

    boolean checkSearch(String tenChuTaiKhoan);
}