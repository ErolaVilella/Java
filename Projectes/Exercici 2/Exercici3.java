public class Exercici3 {
    public static void main(String[] args) {
        
        int num;
        int i = 0;
        int cont=0;

        System.out.println("Introdueix un número de l'1 al 20.");
        num=Integer.parseInt(System.console().readLine());

        for (i=1; i<=num; i++){
            if ((num%i)==0){
                cont++;
            }
        }

        if (cont<=2){
            System.out.println("El número és primer.");
        }
        else {
            System.out.println("El número NO és primer.");
        }

    }
}
