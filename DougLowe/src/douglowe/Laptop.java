package douglowe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Olaoluwa
 */
public class Laptop {
    private String maker;
    private String color;
    private Double price;
    private String model;
    private String spec;

    public Laptop(String maker, String color, Double price, String model, String spec) {
        this.maker = maker;
        this.color = color;
        this.price = price;
        this.model = model;
        this.spec = spec;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
    
    public String toString(){
        return getMaker() + getModel();
    }
    
    
    
}
