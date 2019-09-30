public class ExercicisSenzills7 {
    public static void main(String[] args) {

        int i = 0;
        int num;
        int num2;
             

        num = (int) (Math.random() * 1000 );
        num2 = (int) (Math.random() * 1000 );

        while(num!=num2){

            num2 = (int)(Math.random()*1000+0);
    
            i++;
    
            }
    
        System.out.println("El número a endivinar era el "+num+".");
        System.out.println("Ha tardat "+i+" intents.");
            

              

    }
}