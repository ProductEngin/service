package ro.unibuc.hello.dto;

public class Instrument {

    private long id;
    private String type;
    private String brand;
    public Instrument()
    {
        this.id=0;
        this.type=null;
        this.brand=null; 
    }
    public Instrument(int id, String type,String brand) {
        this.id=id;
        this.type=type;
        this.brand=brand;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }


}
