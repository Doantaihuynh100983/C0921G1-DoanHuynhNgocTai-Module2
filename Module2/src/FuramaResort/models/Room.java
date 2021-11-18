package FuramaResort.models;

public class Room  extends Facility{
    private String dichVuMienPhiDiKem;

    public Room() {
    }


    public Room(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiThueToiDa, String kieuThue, String dichVuMienPhiDiKem) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiThueToiDa, kieuThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String toString() {
        return  "ROOM : "+getTenDichVu()+ "\t" +getDienTichSuDung()+ "\t" +getChiPhiThue()+ "\t" +
                getSoLuongNguoiThueToiDa()+ "\t" + getKieuThue()+ "\t" +dichVuMienPhiDiKem;
    }
}
