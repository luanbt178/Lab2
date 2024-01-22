import java.util.Scanner;

/**
 * thuchienpheptoan
 */
public class thuchienpheptoan {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float a, b, tong, hieu, tich, thuong, chiald;
    System.out.print("Nhap gia tri thu nhat: ");
    a = input.nextFloat();
    System.out.print("Nhap gia tri thu hai : ");
    b = input.nextFloat();

    tong = a + b;
    hieu = a - b; 
    tich = a * b;
    thuong = a / b;
    chiald = a % b;

    System.out.println(" Tong cua hai so tren la: " + tong);
    System.out.println(" Hieu cua hai so tren la: " + hieu);
    System.out.println(" Tich cua hai so tren la: " + tich);
    System.out.println(" Thuong cua hai so tren la: " + thuong);
    System.out.println(" Chia lay du " + a + " cho " + b +"duoc : " + chiald);
    input.close();
}

}