package candidate.controllers;

import candidate.service.ExperienceImpl;
import candidate.service.FresherImpl;
import candidate.service.InterShipImpl;

import java.util.Scanner;

public class CandidateManager {
        ExperienceImpl experience = new ExperienceImpl();
        FresherImpl fresher = new FresherImpl();
     InterShipImpl interShip = new InterShipImpl();


    public void Menu() {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while (choice != 5) {

            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");

            System.out.println("Nhập từ 1 đến 5 để chọn chức năng");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int choice1 = 0;
                    while (choice1 != 4) {
                        System.out.println("1 Add Experience ");
                        System.out.println("2 Edit Experience");
                        System.out.println("3 DisPlay Experience");
                        System.out.println("4 Return main menu");
                        System.out.println("Nhập từ 1 đến 4 để thứ");

                        choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.print(" ============================================ \n");
                                System.out.println("1 Add Experience ");
                                System.out.print("============================================ \n");
                                break;
                            case 2:
                                System.out.print("============================================\n");
                                System.out.println("2 Edit Experience");
                                System.out.print("============================================\n");
                                break;
                            case 3:
                                System.out.print("============================================\n");
                                experience.disPlay();
                                System.out.print("============================================\n");
                                break;
                            case 4 :
                                break;
                        }
                    }
                    break;
                case 2:
                    int choice2 = 0;
                    while (choice2 != 4) {
                        System.out.println("1 Add Fresher ");
                        System.out.println("2 Edit Fresher");
                        System.out.println("3 DisPlay Fresher");
                        System.out.println("4 Return main menu");
                        System.out.println("Nhập từ 1 đến 4 để thứ");

                        choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1:
                                System.out.print(" ============================================ \n");
                                System.out.println("1 Add Fresher ");
                                System.out.print("============================================ \n");
                                break;
                            case 2:
                                System.out.print("============================================\n");
                                System.out.println("2 Edit Fresher");
                                System.out.print("============================================\n");
                                break;
                            case 3:
                                System.out.print("============================================\n");
                                fresher.disPlay();
                                System.out.print("============================================\n");
                                break;
                            case 4 :
                                break;
                        }
                    }
                    break;
                case 3:
                    int choice3 = 0;
                    while (choice3 != 4) {
                        System.out.println("1 Add Internship ");
                        System.out.println("2 Edit Internship");
                        System.out.println("3 DisPlay Fresher");
                        System.out.println("4 Return main menu");
                        System.out.println("Nhập từ 1 đến 4 để thứ");

                        choice3 = sc.nextInt();
                        switch (choice3) {
                            case 1:
                                System.out.print(" ============================================ \n");
                                System.out.println("1 Add Internship ");
                                System.out.print("============================================ \n");
                                break;
                            case 2:
                                System.out.print("============================================\n");
                                System.out.println("2 Edit Internship");
                                System.out.print("============================================\n");
                                break;
                            case 3:
                                System.out.print("============================================\n");
                                interShip.disPlay();
                                System.out.print("============================================\n");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("seach");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}