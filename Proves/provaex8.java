public class provaex8 {
    public static void main(String[] args) {

        int i = 0;
        int num;
        int num2;
        boolean save;
        save=true;
        int rep = 0;
        int cont = 0;
        int intents = 1;

        int[] arraynums = new int[10000];

        num = (int) (Math.random() * 1000 );
        num2 = (int) (Math.random() * 1000 );

        while (num != num2) {
            for (i = 0; i < arraynums.length; i++) {
                if (arraynums[i] == num2) {
                    save=false;
                    rep++;
                    break;
                }
            }
        if (save=true) {
            arraynums[cont] = num2;
            cont++;
            intents++;
        }
        num2 = (int) (Math.random() * 1000 );    
        }
        
        System.out.println("El número a endivinar era el "+num+".");
        System.out.println("Ha tardat "+intents+" intents.");
        System.out.println("Ha repetit "+rep+" números.");
    

              

    }
}

// La forma correcta és en el fitxer Trio.java.