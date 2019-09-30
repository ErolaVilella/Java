public class ExercicisSenzills8 {
    public static void main(String[] args) {

        int i = 0;
        int num;
        int num2;
        boolean save=false;
        int rep = 0;
        int cont = 0;
        int intents = 1;

        int[] arraynums = new int[10000];

        num = (int) (Math.random() * 1000 );
        num2 = (int) (Math.random() * 1000 );

        for ( i=0; i<arraynums.length; i++){
            if (arraynums[i]==num2){
                save=true;
                rep++;
                break;
            }
        }
        if(save=false){
            arraynums[cont] = num2;
            cont++;
            intents++;
        }

        System.out.println("El número a endivinar era el "+num+".");
        System.out.println("Ha tardat "+intents+" intents.");
        System.out.println("Ha repetit "+rep+" números.");

    }
}

//La prova correcta és a Trio.java.