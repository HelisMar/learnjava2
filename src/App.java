import java.time.LocalDate;
import java.util.Calendar;

public class App {
    public static void main(String[] args) throws Exception {

            Student student = new Student ("Helis", LocalDate.of(1990, 03, 21));
            
    }
            
        }
    
class Person {                 //Koolides on õpilased ja õpetajad eraldi aga neil on ühised näitajad - mõlemad on isikud
    private String name;        //neil on mingid muutujad nii töötajatel kui ka õpilastel
    private LocalDate birthdate;

    public Person (String name, LocalDate birthdate){
        this.name = name;
        this.birthdate = birthdate; }

        

            Public String getName(){
                return name;
            }
            public LocalDate getBirthDate () {
                return birthdate;
            }
        }
        class Student extends Person {                          // extendiga saab seda laiendada
            private Integer missedClasses;
            public Student (String name, LocalDate birthdate) {
                super(name,birthdate);
            }
            public Integer getMissedClasses(){
                return missedClasses;
            }
            public void setMissedClasses(Integer missedClasses){
                this.missedClasses = missedClasses;

            }
        }
}
