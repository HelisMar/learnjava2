import java.util.ArrayList;



public class App {
    public static void main(String[] args) throws Exception {

        int[] nums = new int[10]; //peab olema suurus ette määratud -10-
            nums[0] = 16;
            nums[1] = 20;
            nums[2] = 21;
            nums[4] = 22;

            System.out.println(nums[1]); //Välja saab pritida, kui lisad väärtuse kandilistega
            
            String[] names = {"helis", "heidi"}; //kui suurust ei ole ette määratud, saab ta aru ka mitu on loogsulgudes 0,1,---

            System.out.println(names[1]);

            for(int num : nums){
                System.out.println(num);
            }

            }
            
        }
