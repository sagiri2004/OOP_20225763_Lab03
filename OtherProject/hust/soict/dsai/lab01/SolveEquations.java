// SolveEquations.java
// 2.2.6

import java.util.Scanner;

public class SolveEquations {
    public static void solveLinearEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");

        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }

        scanner.close();
    }

    public static void solveQuadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiem cua phuong trinh la: " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
            }
        }
        scanner.close();

    }

    public static void solveSystemOfLinearEquations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap he so cua phuong trinh thu nhat");
        System.out.print("Nhap a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Nhap b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhap c1: ");
        double c1 = scanner.nextDouble();

        System.out.println("Nhap he so cua phuong trinh thu hai");
        System.out.print("Nhap a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Nhap b2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Nhap c2: ");

        double c2 = scanner.nextDouble();

        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;

        if (D == 0) {
            if (Dx == 0 && Dy == 0) {
                System.out.println("He phuong trinh co vo so nghiem");
            } else {
                System.out.println("He phuong trinh vo nghiem");
            }
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("He phuong trinh co nghiem la: x = " + x + ", y = " + y);
        }
        scanner.close();

    }

    public static void main(String[] args) {
        // Out ra lua chon
        // 1. Giai phuong trinh bac nhat
        // 2. Giai phuong trinh bac hai
        // 3. Giai he phuong trinh bac nhat 2 an
        // 4. Thoat

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai phuong trinh bac hai");
            System.out.println("3. Giai he phuong trinh bac nhat");
            System.out.println("4. Thoat");
            System.out.print("Lua chon cua ban: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation();
                    break;
                case 2:
                    solveQuadraticEquation();
                    break;
                case 3:
                    solveSystemOfLinearEquations();
                    break;
                case 4:
                    System.out.println("Ket thuc chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
