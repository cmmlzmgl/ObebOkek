import java.util.Scanner;

public class ObebOkek {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        num2 = input.nextInt();

        int temp1 = num1;
        int temp2 = num2;


        while (temp2 != 0) {
            int remainder = temp1 % temp2;
            temp1 = temp2;
            temp2 = remainder;
        }
        int obeb = temp1;

        int okek = (num1 * num2) / obeb;

        System.out.println("Obeb: " + obeb);
        System.out.println("Okek : " + okek);
    }
}