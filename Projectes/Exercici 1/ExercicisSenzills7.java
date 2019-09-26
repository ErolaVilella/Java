public class ExercicisSenzills7{
    public static void main(String[] args) {

    int intents = 1;
    int num;
    int num2;

    num = (int)(Math.random()*1000+0);
    num2 = (int)(Math.random()*1000+0);

    while(num!=num2){

        num = (int)(Math.random()*1000+0);
        num2 = (int)(Math.random()*1000+0);

        intents++;

            
    }

    System.out.println("El número a endevinar és: "+num);
    System.out.println("El número d'intents que ha tardat él PC és: "+intents);

    }
}