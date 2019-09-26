public class ExercicisSenzills7{
    public static void main(String[] args) {

    int i = 0;
    int num;
    // int num2;
    int repetit = 0;
    int arraynums[] = new int[10000];
    int cont=0;
     
      
    num = (int)(Math.random()*1000+0);
    // num2 = (int)(Math.random()*1000+0);

    // arraynums[cont] = num2;

    for(i=0; i<arraynums.length; i++){
        arraynums[cont] = (int)(Math.random()*1000+0);
        cont++;
            if (num!=arraynums[cont]){
                
            }
            
            
        }   
    

    

    // while(num!=num2){

    //     num2 = (int)(Math.random()*1000+0);

    //     intents++;

            
    // }


    System.out.println("El número a endevinar és: "+num);
    System.out.println("El número d'intents que ha tardat él PC és: "+i);
    System.out.println("Ho has repetit "+repetit+" cops.");
    }
}