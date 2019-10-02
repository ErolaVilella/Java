public class Exercici5 {
    public static void main(String[] args) {
        
        int resp1;
        int resp2;
        int resp3;

        System.out.println("Quant són 2+2?");
        resp1=Integer.parseInt(System.console().readLine());

        if (resp1==4){
            System.out.println("Correcte! Següent pregunta");
            System.out.println("Quant són 3+3?");
            resp2=Integer.parseInt(System.console().readLine());
            if (resp2==6){
                System.out.println("Correcte! Queda una pregunta més!");
                System.out.println("Quant són 10+10?");
                resp3=Integer.parseInt(System.console().readLine());
                if (resp3==20){
                    System.out.println("MOLT BÉ! Has tret la màxima puntuació! 3 punts!");
                }
                else {
                    System.out.println("Incorrecte. Has obtingut 2 punts.");
                }
            }
            else {
                System.out.println("incorrecte. Has obtingut 1 punt.");
            }
        }
        else {
            System.out.println("Incorrecte. Has obtingut 0 punts.");
        }

    }
}