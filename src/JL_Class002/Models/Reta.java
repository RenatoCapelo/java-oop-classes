package JL_Class002.Models;

public class Reta {
    public Ponto ponto1, ponto2;
    public Reta(Ponto _ponto1, Ponto _ponto2){
        ponto1 = _ponto1;
        ponto2 = _ponto2;
    }

    public boolean IsPointInLine(Ponto ponto){
        double m = (double) (ponto2.y - ponto1.y) / (ponto2.x-ponto1.x);
        double b = -((m * ponto1.x) - ponto1.y);
        return ponto.y == (m * ponto.x + b);
    }
}
