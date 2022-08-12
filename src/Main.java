import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap do dai canh thu 1");
        double canh1=scanner.nextDouble();
         System.out.println("Nhap do dai canh thu 2");
        double canh2=scanner.nextDouble();
         System.out.println("Nhap do dai canh thu 3");
        double canh3=scanner.nextDouble();
        System.out.println("Nhap mau sac ");
        Scanner input=new Scanner(System.in);
        String color=input.nextLine();
        Tamgiac tamgiac=new Tamgiac(color,canh1,canh2,canh3);
        System.out.println("tam giac co mau la "+tamgiac.getColor());
        System.out.println("Tam giac co chu vi la "+tamgiac.getPerimeter());
        System.out.println("Tam giac co dien tich la "+tamgiac.getArea());
        System.out.println(tamgiac.toString());
    }
}
