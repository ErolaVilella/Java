public class ExercicisSenzills2{
    public static void main(String[] args) {
        float altura;
        float pes;
        float imc;
        float est;
        
        System.out.println("Introdueix la teva alçada (m): ");
        altura = Float.parseFloat(System.console().readLine());

        System.out.println("Introdueix el teu pes (kg): ");
        pes = Float.parseFloat(System.console().readLine());

        est=altura*altura;
        imc=pes/est;

        System.out.println("El teu IMC és de "+imc);

       if (imc<18.5){
           System.out.println("Necessites pujar de pes.");
       }
       else if (imc<24.9){
           System.out.println("Tens un pes adeqüat.");
       }
       else if (imc<29.9){
           System.out.println("Els càlculs indiquen que tens sobrepes.");
        }
       else {
           System.out.println("Tens obesitat.");
       }
    
       
        }    
    }
