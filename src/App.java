public class App {
    public static void main(String[] args) throws Exception {
       Animal animal1 = new Animal ("Miki Hiir", 56, 2); //on animal tüüpi, nimi animal1 /animal onbjekst on animal klassi tüüpi. saame luua uue animali new
       Animal.nr =1;
       //animal1.name = "Miki Hiir";
        //animal1.age = 56;
        //animal1.nLegs = 2;
        animal1.getDescription();

        Animal animal2 = new Animal ("Iiah", 5, 4 ); //saab lisada animal 2 ja siis saab mõlemat välja pritida. Tegevus sama, omadus sama aga eraldi seisvad andmed
        Animal.nr = 2;
        //animal2.name = "Iiah";
        //animal2.age = 5;
        //animal2.nLegs = 4;
        animal2.getDescription();
        System.out.println(Animal.nr);
        System.out.println(Animal.nr);

    }
}

 class Animal {
    public String name;  //Need on näited atribuutidest e propertitest
    public int age;
    public int nLegs; //number of legs
    public static int nr;

    public Animal(String name, int age, int nLegs) {  //constructor - see lubab meil käituda lihtsamalt. Ei pea eraldiseisvalt ära täita, nõuab, et me üleval midagi ära täidaksime ja ei ole vaja eraldi name ja aega ära täita
        this.name = name;
        this.age = age;
        this.nLegs= nLegs;
    }

    public void getDescription (){
        System.out.printf("My Name is %s and I am %d years old and I have %d legs \n", this.name, this.age, this.nLegs);  //meetod mida ta on võimeline tegema (void, sest ei tagasta midagi)
    }

            public int getAge() {
                return this.age;
            }

            public void setAge(int age) {
                if(age>=0){
                    this.age =age;

                }
            
                
        }
    }  
