package Worksheet003.Exercise004.Models;

public class Lamp {
    boolean isOn;

    public void TurnOn(){
        isOn = true;
        System.out.println("Is the light on?\n"+isOn);
    }

    public void TurnOff(){
        isOn = false;
        System.out.println("Is the light on?\n"+isOn);
    }
}
