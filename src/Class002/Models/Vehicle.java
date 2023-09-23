package Class002.Models;

public class Vehicle {
    private int Id;
    private String Brand;
    private String Model;

    public Vehicle(int _id, String _brand, String _model){
        this.Id = _id;
        this.Brand = _brand;
        this.Model = _model;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", getId(), getBrand(), getModel());
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
