public class Exercici4 {
    public static void main(String[] args) {
  
       int dni;
    //    int ll;

        char lletra2[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
         

        System.out.println("Introdueix el teu número de DNI."); 
        dni = Integer.parseInt(System.console().readLine());

        // ll=dni%23;

        System.out.println("La teva lletra és "+lletra2[dni%23]+". El teu DNI quedaria així: "+dni+lletra2[dni%23]+".");
        



    }
}
