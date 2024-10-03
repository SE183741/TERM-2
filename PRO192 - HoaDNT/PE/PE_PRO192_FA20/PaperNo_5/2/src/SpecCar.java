/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BaoDinh
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }

    public SpecCar(int type) {
        this.type = type;
    }

    public SpecCar(int type, String maker, int price) {
        super(maker, price);
        this.type = type;
    }
    

    @Override
    public String toString() {
        return getMaker() +"," +getPrice() + ","+ this.type;
    }

    public void setData(){
        //1. Add "XZ" to head of Maker
        String result="";
        result = "XZ"+getMaker();
        //2. Increase price = +20
        
    }
    
    public int getValue(){
        return type;
    }
}
