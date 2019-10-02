public class Exercici1{
    public static void main(String[] args) {

        int num;

        System.out.println("Introdueix un número:");
        num=Integer.parseInt(System.console().readLine());

        if (num%2==0){
            System.out.println("El número és parell.");    
        }
        else {
            System.out.println("El número és senar.");
        }
        
    }
}
