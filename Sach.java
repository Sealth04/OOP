public class Sach {
    private int ID;
    private String Tensach;
    private String Tentacgia;
    private String Tennhaxuatban;

    public Sach(int ID, String tensach, String tentacgia, String tennhaxuatban) {
        this.ID = ID;
        Tensach = tensach;
        Tentacgia = tentacgia;
        Tennhaxuatban = tennhaxuatban;
    }


    public void getDetail(){
        String newName = null;
        System.out.printf("%3s %20s %15s %15s %n", this.getID(), this.getTensach(newName), this.getTentacgia(), this.getTennhaxuatban());
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTensach(String newName) {
        return Tensach;
    }

    public void setTensach(String tensach) {
        Tensach = tensach;
    }

    public String getTentacgia() {
        return Tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        Tentacgia = tentacgia;
    }

    public String getTennhaxuatban() {
        return Tennhaxuatban;
    }

    public void setTennhaxuatban(String tennhaxuatban) {
        Tennhaxuatban = tennhaxuatban;
    }
}
