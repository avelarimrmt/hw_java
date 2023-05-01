package final_hw;

public class Notebook {
    
    public String brand;

    public String model;

    public String cpu;

    public double diagonal;

    public int ram;

    public Boolean isGaming;

    public int price;

    public String color;

    public Notebook(String brand, String model, String cpu, double diagonal, int ram, Boolean isGaming, int price, String color) {
        
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.diagonal = diagonal;
        this.ram = ram;
        this.isGaming = isGaming;
        this.price = price;
        this.color = color;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    String getCpu() {
        return cpu;
    }

    Double getDiagonal() {
        return diagonal;
    }

    Integer getRam() {
        return ram;
    }

    Boolean getIsGaming() {
        return isGaming;
    }

    Integer getPrice() {
        return price;
    }

    String getColor() {
        return color;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }
    
    void setModel(String model) {
        this.model = model;
    }

    void setCpu(String cpu) {
        this.cpu = cpu;
    }

    void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    void setIsGaming(boolean isGaming) {
        this.isGaming = isGaming;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setColor(String color) {
        this.color = color;
    }

    void getAll() {
		System.out.println("Модель ноутбука: " + brand + " " + model);
        System.out.println("Процессор: " + cpu);
        System.out.println("Диагональ экрана: " + diagonal);
		System.out.println("Объем оперативной памяти, Гб: " + ram);
        System.out.println("Игровой ноутбук: " + isGaming);
        System.out.println("Цена: " + price);
		System.out.println("Цвет: " + color + "\n");
	}
}