package com.driver;
public class Main {
    public static void main(String [] args){
        Product p=new Product();
        int a=p.product(12,12);
        int b=p.product(5,6,7);
        double c=p.product(12.5,13.0);
        System.out.println(a+" "+b+" "+c);



    }
}
class Product {
    public int product(int x,int y){
        return  x+y;
    }
    public int product(int x,int y,int z){
        return x+y+z;
    }
    public double product(double x, double y) {
        return x+y;
    }

}