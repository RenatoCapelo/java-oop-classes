package Worksheet003.Exercise005.Models;

public class Smartphone {
    private double Width;
    private double Height;
    private String OS;
    private String Brand;
    private double Price;

    public Smartphone(double width, double height, String os, String brand, double price) {
        Width = width;
        Height = height;
        OS = os;
        Brand = brand;
        Price = price;
    }

    public void Call(){
        System.out.println("The phone is on a call");
    }
    public void SendMessage(){
        System.out.println("The phone is sending a message");
    }
    public void Navigate(){
        System.out.println("The phone is navigating");
    }
    public void Share(){
        System.out.println("The phone is sharing");
    }

}
