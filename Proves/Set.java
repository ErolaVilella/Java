import java.util.HashSet;
import java.util.Set;

public class ExercicisSenzills7{
    public static void main(String[] args) {

    int intents = 1;
    int num;
    int num2;
    int repetit = 0;
       
    num = (int)(Math.random()*1000+0);
    num2 = (int)(Math.random()*1000+0);

    Set<Integer> generats = new HashSet <>();

    while(num2!=num){
        if(generats.contains(num2)){
            repetit++;
            num2 = (int)(Math.random()*1000+0);
            
        }
        else{
            intents++;
            generats.add(num2);
            
        }
    }
   





    // while(num!=num2){

    //     num2 = (int)(Math.random()*1000+0);

    //     intents++;

            
    // }

    System.out.println("El número a endevinar és: "+num);
    System.out.println("El número d'intents que ha tardat él PC és: "+intents);
    System.out.println("Ho has repetit "+repetit+" cops.");
    }
}