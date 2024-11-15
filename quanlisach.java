import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class quanlisach {
    private ArrayList<Sach> list = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    //private int autoGenerateID = 0;

    public quanlisach() {

    }

    public static void print(String text) {
        System.out.print(text);
    }

    public void createNewSach() {
       this.print("Hay nhap ID sach: ");
       int ID = sc.nextInt();
       sc.nextLine();

        print("Hay nhap Ten Sach: ");
        String Tensach = sc.nextLine();

        print("Hay nhap Ten tac gia: ");
        String Tentacgia = sc.nextLine();

        print("Hay nhap Ten nah xuat ban: ");
        String Tennhaxuatban = sc.nextLine();

        Sach sach = new Sach(ID, Tensach, Tentacgia, Tennhaxuatban);
//        autoGenerateID++;
        list.add(sach);

        print("Them thanh cong! \n");
    }

    public void hienthisach() {
        print("Danh sach cac quyen sach \n");
        for (int i = 0; i < this.list.size(); i++) {
            Sach sach = list.get(i);
            sach.getDetail();
        }
    }

    public void suathongtinsach() {
        print("Hay nhap ID de sua thong tin: ");
        int ID = sc.nextInt();
        sc.nextLine();
        Sach sach;
        for (int i = 0; i < this.list.size(); i++) {
            sach = list.get(i);
            if (sach.getID() == ID) {
                print("Hay nhap ten moi: ");
                String newName = sc.nextLine();

                print("Hay nhap ten tac gia: ");
                String newtacgia = sc.nextLine();

                print("Hay nhap nha xuat ban: ");
                String newnhaxuatban = sc.nextLine();

                sach.setTensach(newName);
                sach.setTentacgia(newtacgia);
                sach.setTennhaxuatban(newnhaxuatban);

                print("Cap nhat thanh cong !\n");
                return;
            }
        }
        print("Khong tim thay !\n");

    }
}
