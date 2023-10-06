package JL_Class002;

import JL_Class002.Models.Ponto;
import JL_Class002.Models.Reta;

public class Exercise002 {
    public static void main(String[] args) {
        Ponto
                ponto1 = new Ponto(1,2),
                ponto2 = new Ponto(3,6),
                ponto3 = new Ponto(2,4);

        Reta reta = new Reta(ponto1,ponto2);

        System.out.println(reta.IsPointInLine(ponto3));
    }


}
