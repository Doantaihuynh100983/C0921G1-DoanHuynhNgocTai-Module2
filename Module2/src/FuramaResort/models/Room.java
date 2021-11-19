package FuramaResort.models;

import java.util.Objects;

public class Room extends Facility {
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
        return "ROOM : " + getTenDichVu() + "\t" + getDienTichSuDung() + "\t" + getChiPhiThue() + "\t" +
                getSoLuongNguoiThueToiDa() + "\t" + getKieuThue() + "\t" + dichVuMienPhiDiKem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return getTenDichVu().equals(room.getTenDichVu())
                && Double.compare(room.getDienTichSuDung(), getDienTichSuDung()) == 0
                && Double.compare(room.getChiPhiThue(), getChiPhiThue()) == 0
                && room.getSoLuongNguoiThueToiDa() == getSoLuongNguoiThueToiDa()
                && getKieuThue().equals(room.getKieuThue())
                && dichVuMienPhiDiKem.equals(room.dichVuMienPhiDiKem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTenDichVu(), getDienTichSuDung(), getChiPhiThue(), getSoLuongNguoiThueToiDa(),
                getKieuThue(), dichVuMienPhiDiKem);
    }
}
