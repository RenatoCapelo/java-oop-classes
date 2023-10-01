package JL_Class001.Models;

public class Vector {
    Integer x;
    Integer y;

    public Vector(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }

    public Integer MultiplySelfByOther(Integer x, Integer y){
        return this.x * x + this.y * y;
    }
}
