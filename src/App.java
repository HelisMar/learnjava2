import java.time.LocalDate;
import java.util.Calendar;


    public class App {
        public static void main (String [] args) {
        int temp = 0;
    
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                temp = temp + i;
            }
    
        }
    
        System.out.println (temp);
       }
    
 
        }

