package ch02;
import java.util.Scanner;
// p.65 예제 2-5
public class ScannerEx {
    public static void main(String[] args){
        System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하시오.");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("당신의 이름은 "+name+"입니다.");
        String city = scanner.next();
        System.out.println("당신이 사는 도시는 "+city+"입니다.");
        int age = scanner.nextInt();
        System.out.println("당신의 나이는 "+age+"입니다.");
        double weight = scanner.nextDouble();
        System.out.println("당신의 체중은 "+weight+"입니다.");
        Boolean single = scanner.nextBoolean();
        System.out.println("당신의 독신 여부는 "+single+"입니다.");

        scanner.close();
    }
}
