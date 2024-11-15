import java.util.Scanner;

public class Main {
    public static void showMenuSystem(){
        System.out.printf("%10s %n","xinchao");
        System.out.printf("%10s %n","1. hien thi danh sach cac quyen sach");
        System.out.printf("%10s %n","2. tao sach moi ");
        System.out.printf("%10s %n","3. update sach");
        System.out.printf("%5s %n","4. EXIT");
    }
    private static Scanner sc = new Scanner(System.in);
    private static quanlisach quanli = new quanlisach();

    public static void main(String[] args) {
        int sel = 0;
        while (true){
            Main.showMenuSystem();
            quanlisach.print("Hay lua chon [1-4]: ");
            sel = sc.nextInt();
            sc.nextLine();


            switch (sel){
                case 1:
                    quanli.hienthisach();
                    break;
                case 2:
                    quanli.createNewSach();
                    break;
                case 3:
                    quanli.suathongtinsach();
                    break;
                case 4:
                    quanli.print("EXIT...");
                    return;
                default:
                    quanli.print("Khong hop le: !\n");
                    break;
            }
        }
    }
}
