// DayInMonth.java
// 6.4

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthInput;
        int year;

        while (true) {
            System.out.print("Nhap thang: ");
            monthInput = scanner.nextLine().trim();

            System.out.print("Nhap nam: ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Nam khong hop le");
                scanner.nextLine();
                continue;
            }

            if (year < 0) {
                System.out.println("Nam khong hop le");
                continue;
            }

            int days = getDays(monthInput, year);

            if (days == -1) {
                System.out.println("Thang khong hop le");
            } else {
                System.out.println("Thang " + monthInput + " nam " + year + " co " + days + " ngay");
                break;
            }
        }

        scanner.close();
    }

    public static int getDays(String month, int year) {
        int days = -1;

        switch (month) {
            case "1":
            case "Jan":
            case "Jan.":
            case "January":
            case "3":
            case "Mar":
            case "Mar.":
            case "March":
            case "5":
            case "May":
            case "7":
            case "Jul":
            case "Jul.":
            case "July":
            case "8":
            case "Aug":
            case "Aug.":
            case "August":
            case "10":
            case "Oct":
            case "Oct.":
            case "October":
            case "12":
            case "Dec":
            case "Dec.":
            case "December":
                days = 31;
                break;

            case "4":
            case "Apr":
            case "Apr.":
            case "April":
            case "6":
            case "Jun":
            case "Jun.":
            case "June":
            case "9":
            case "Sep":
            case "Sep.":
            case "September":
            case "11":
            case "Nov":
            case "Nov.":
            case "November":
                days = 30;
                break;

            case "2":
            case "Feb":
            case "Feb.":
            case "February":
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                days = -1;
        }

        return days;
    }

}
