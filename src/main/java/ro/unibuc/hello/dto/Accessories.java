// JavaScript source code
package ro.unibuc.hello.dto;

public class Accessories {
    private int id;
    private String name;
    private double price;
    private String color;
    private String material;
  
    public Accessories() {}
  
    public Accessories(int id, String name, double price, String color, String material) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.material = material;
    }
  
    public int getId() {
        return id;
    }
  
    public void setId(int id) {
        this.id = id;
    }
  
    public String getName() {
        return name;
    }
  
    public void setName(String name) {
        this.name = name;
    }
  
    public double getPrice() {
        return price;
    }
  
    public void setPrice(double price) {
        this.price = price;
    }
  
    public String getColor() {
        return color;
    }
  
    public void setColor(String color) {
        this.color = color;
    }
  
    public String getMaterial() {
        return material;
    }
  
    public void setMaterial(String material) {
        this.material = material;
    }

     @Override
    public String toString() {
        return "Accesory{" +
                ", name=" + name +
                ", id='" + id + '\'' +
                ", price='" + price + '\'' +
                ", material= '"+ material +'\'' +
                ", color= '" + color +'\'' +
                '}';
    }
  }
  