public class Product {
    private String name;
    private String ID;
    private String Country;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, String ID, String country, int price) {
        this.name = name;
        this.ID = ID;
        this.Country = country;
        this.price = price;
    }

    @Override
    public String toString() {
        return "name="+name+ ",ID= "+ID + ",Country= "+Country + ",Price= "+price;
    }
}
