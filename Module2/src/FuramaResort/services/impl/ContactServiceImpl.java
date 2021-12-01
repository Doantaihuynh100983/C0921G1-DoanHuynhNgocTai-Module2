package FuramaResort.services.impl;

import FuramaResort.common.WriteReadFile;
import FuramaResort.models.Booking;
import FuramaResort.models.Contract;
import FuramaResort.services.ContactService;

import java.util.*;

public class ContactServiceImpl implements ContactService {
    BookingServiceImpl bookingService = new BookingServiceImpl();
    public static final String FILE_NAME = "Module2/src/FuramaResort/data/contract.csv";

    Scanner scanner = new Scanner(System.in);
    Queue<Contract> contracts = new LinkedList<>();
    Queue<Booking> bookings = new LinkedList<>();
    {
        contracts = covertStringToEmployee();
    }
    @Override
    public void disPlay() {
        for (Contract contract : contracts) {
            System.out.println(contract);
        }

    }

    @Override
    public void add() {
        bookings.addAll(bookingService.booKing());
        Booking booking = bookings.poll();
        Contract contract1 = new Contract();
        System.out.println(booking);
        contract1.setMaBooking(booking.getMaBooking());
        contract1.setMaKhachHang(booking.getMaKhachHang());
        System.out.println("Nhập mã hợp đồng");
        contract1.setSoHopDong(scanner.nextLine());
        System.out.println("Nhập số tiền cọc trước");
        contract1.setSoTienCocTruoc(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập số tiền thanh toán");
        contract1.setTongSoTienThanhToan(Integer.parseInt(scanner.nextLine()));

        contracts.add(contract1);
        List<String> stringList = new LinkedList<>();
        stringList.add(contract1.toString());
        WriteReadFile.writeFile(FILE_NAME, stringList, true);
    }

    @Override
    public void edit(String hoTen) {
        for (Contract contract : contracts) {
            if (contract.getMaBooking().equals(hoTen)) {
                System.out.println("Nhập số mã hợp  đồng");
                contract.setSoHopDong(scanner.nextLine());
                System.out.println("Nhập số tiền cọc trước");
                contract.setSoTienCocTruoc(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập số tiền thanh toáng");
                contract.setTongSoTienThanhToan(Integer.parseInt(scanner.nextLine()));
                System.out.println(contract);
                List<String> stringList = covertEmployeeToString();
                WriteReadFile.writeFile(FILE_NAME, stringList, false);
            }
        }
    }





    public Queue<Contract> covertStringToEmployee() {
        List<String> stringList = WriteReadFile.readFile(FILE_NAME);
        Queue<Contract> contracts1 = new LinkedList<>();
        String[] arrContract;
        for (String line : stringList) {
            arrContract = line.split(",");
            contracts1.add(new Contract(arrContract[0], arrContract[1], Double.parseDouble(arrContract[2]),
                    Double.parseDouble(arrContract[3]), arrContract[4]));
        }
        return contracts1;
    }



    public List<String> covertEmployeeToString() {
        List<String> listString = new LinkedList<>();
        for (Contract contract : contracts) {
            listString.add(contract.toString());
        }
        return listString;
    }


}




