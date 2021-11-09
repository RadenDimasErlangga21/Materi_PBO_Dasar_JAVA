package tugas_praktikum1;

public class laptop {
    private String tipe_laptop;
    private String brand_laptop;
    private String processor;
    private String graphic_card;
    private String storage;
    private String jumlah_ram;

    public void setTipe_Laptop(String newValue) {
        tipe_laptop = newValue;
    }

    public void setBrandLaptop(String newValue) {
        brand_laptop = newValue;
    }

    public void setProcessor(String newValue) {
        processor = newValue;
    }

    public void setGraphicCard(String newValue) {
        graphic_card = newValue;
    }

    public void setKapasitas(String newValue) {
        storage = newValue;
    }

    public void jumlah_ram(String newValue) {
        jumlah_ram = newValue;
    }

    public void cetakStatus() {
        System.out.println("Tipe Laptop   : " + tipe_laptop);
        System.out.println("Brand         : " + brand_laptop);
        System.out.println("Graphic card  : " + processor);
        System.out.println("Graphic card  : " + graphic_card);
        System.out.println("storage       : " + storage);
        System.out.println("jumlah Ram    : " + jumlah_ram);
    }
}
