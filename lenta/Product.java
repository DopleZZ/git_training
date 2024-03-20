package lenta;

public abstract class Product {

    public Boolean isPresent;
    public String title;

    public Product(String title){
        this.title = title;
    }

    public void setPresentStatus(Boolean stat){
        this.isPresent = stat;
    }

    public Boolean getPresentStatus(){
        return this.isPresent;
    }
}
