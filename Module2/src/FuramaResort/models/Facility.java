package FuramaResort.models;




public  abstract class Facility {
            private String tenDichVu;
            private double dienTichSuDung;
            private double chiPhiThue;
            private int soLuongNguoiThueToiDa;
            private String kieuThue ;

    public Facility(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiThueToiDa, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiThueToiDa = soLuongNguoiThueToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiThueToiDa() {
        return soLuongNguoiThueToiDa;
    }

    public void setSoLuongNguoiThueToiDa(int soLuongNguoiThueToiDa) {
        this.soLuongNguoiThueToiDa = soLuongNguoiThueToiDa;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

}
