/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablesample1;

/**
 *
 * @author Olaoluwa
 */
public class Phone {
    private String maker;
    private String model;
    private String spec;
    private Double price;

    public Phone(String maker, String model, String spec, Double price) {
        this.maker = maker;
        this.model = model;
        this.spec = spec;
        this.price = price;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getMaker() + " " + getModel();
    }
    
   
}
