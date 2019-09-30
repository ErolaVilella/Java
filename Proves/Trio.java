import java.util.Random;

public class Trio {
    public static void main(String[] args) {
        Random r = new Random();
        int numPremiat=r.nextInt(10);
        System.out.println("El número premiat és el "+numPremiat+".");
        int i = 0;
        int arraynums[] = new int [10];
        boolean trobat = false;
        int intents = 0;
        int repetit = 0;

        for (i=0; i<arraynums.length; i++){
            arraynums[i]=2000;
        }

        while (!trobat){
            int numAleatori=r.nextInt(10);
            boolean coincidencia=false;
            for (i=0; i<arraynums.length; i++){
                if (arraynums[i]==numAleatori){
                    coincidencia=true;
                    repetit++;
                    break;                 
                }
            }
        if (coincidencia==false){
            arraynums[intents]=numAleatori;
            intents++;
            if(numAleatori==numPremiat){
                trobat=true;
            }
        }
                             
        }
        System.out.println("Intents: "+intents);
        System.out.println("Repetits: "+repetit);
        
        }
       

    }

