package Worksheet003.Exercise005;

import Worksheet003.Exercise005.Models.Smartphone;

public class Exercise005 {
    public static void main(String[] args) {
        Smartphone  samsungS4 = new Smartphone(6.98, 13.6, "Android", "Samsung", 1000);
        Smartphone iPhone = new Smartphone(5.86, 12.3, "iOS", "Apple", 1200);

        samsungS4.Call();
        iPhone.SendMessage();
    }
}
