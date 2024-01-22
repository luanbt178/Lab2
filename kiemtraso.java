import java.util.Scanner;
/**
 * kiemtraso
 */
public class kiemtraso {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;
    System.out.println("Nhap mot so: ");
    a = input.nextInt();
    if ( a % 2 == 0){
        System.out.println("So " + a + " la so chan.");
    }
    else{
        System.out.println("So " + a + " la so le.");
    }
input.close();
}

    
}