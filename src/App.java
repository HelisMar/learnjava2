import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       
        int[] nums = new int [10]; //1mõõtmelised arrayd. Tuleb sisestada väärtus(10)
        nums [0] = 2;
        String[] names = {"helis", "heidi", "tormi"};
        System.out.printIn(names) ;
        String[] names2 = {"helis", "heidi", "tormi ja sven"};
        System.out.printIn(names2[0]);
        for (String name : names2){
            System.out.printIn (name);
        }
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("pineapple");
        System.out.printIn(fruits.get(2));
        int[][] array2d = new int [3][3];        //kahemõõtmelised arrayd
        array2d [0][0]= 3;                       //kohal 0,0 asub 3
        array2d [2][1]= 4;                       //kohal 2,1 asub 4
        System.out.printIn(array2d [0][0]);         //kui pringin välja 00 koha, siis tuleb 3


        Sring[][] board = {
            {"1","2","3"},
            {"4", "5" ,"6"},
            {"7", "8", "9"}
        };

    }
}
