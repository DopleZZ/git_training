package lenta;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) throws LentaExplodeException{
        
        //Молоко в наличии - (milk), значит противоположное логическое выражение (!milk), из этого следует, что в
        //выполнятся может только одно условие за раз

        Milk milk = new Milk("Молоко");
        NotMilk notMilk = new NotMilk("не молоко");

        milk.setPresentStatus(true);
        notMilk.setPresentStatus(true);

        if (milk.getPresentStatus() & !notMilk.getPresentStatus()){
            System.out.println("молоко есть");
        } else if (!milk.getPresentStatus() & notMilk.getPresentStatus()){
            System.out.println("молока нет");
        } else {
            throw new LentaExplodeException();
        }

    }
}
