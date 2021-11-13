package baitap_anhchanhgiao.models;


import java.util.ArrayList;
import java.util.Scanner;

public class HangSanXuat {
    private  String maHangSanXuat;
    private  String tenHangSanXuat;
    private  String tenQuocGia;

    public HangSanXuat() {
    }

    public HangSanXuat(String maHangSanXuat, String tenHangSanXuat, String tenQuocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.tenQuocGia = tenQuocGia;
    }

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }



    static ArrayList<HangSanXuat> hangSanXuats = new ArrayList<>();
    static {
        hangSanXuats.add(new HangSanXuat("HSX-001","Yamaha","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-002","Honda","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-003","Dongfeng","Trung Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-004","Huyndai","Hàn Quốc"));
        hangSanXuats.add(new HangSanXuat("HSX-005","Ford","Mỹ"));
        hangSanXuats.add(new HangSanXuat("HSX-006","Toyota","Nhật Bản"));
        hangSanXuats.add(new HangSanXuat("HSX-006","Hino","Nhật Bản"));
    }
    public String hangSanXuat1(){
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());

        return hangSanXuats.get(choice-1).getMaHangSanXuat()+"\t" + hangSanXuats.get(choice-1).getTenHangSanXuat()
                +"\t"+ hangSanXuats.get(choice-1).getTenQuocGia();
    }



    public void menuHangSanXuat(){
        System.out.println("CHọn hãng sản xuất, nhập số thứ tự để chọn: \n"+
                "1. HSX-001,Yamaha,Nhật Bản\n" +
                "2. HSX-002,Honda,Nhật Bản\n" +
                "3. HSX-003, Dongfeng,Trung Quốc\n" +
                "4. HSX-004, Huyndai,Hàn Quốc\n" +
                "5. HSX-005, Ford,Mỹ\n" +
                "6. HSX-006, Toyota,Nhật Bản\n" +
                "7. HSX-006, Hino,Nhật Bản");
    }

    @Override
    public String toString() {
        return maHangSanXuat + '\t' + tenHangSanXuat + '\t' + tenQuocGia + '\t' ;
    }
}
