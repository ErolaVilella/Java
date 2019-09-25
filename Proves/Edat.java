public class Edat{
    public static void main(String[] args) {
        int edat = 18;
        Boolean major=false;
        String salutacio="Hauràs d'esperar!";
        if(edat>=18){
            major=true;
            salutacio="Ja pots conduir!";
        }
    System.out.println("És major d'edat? "+major);
    System.out.println(salutacio);  
    
    if (major){
        System.out.println("Bon dia!");
       }
     }
    }

    // Posarem "boolean" si la resposta és "true / false".
    // Si volguéssim posar una resposta elaborada, fariem "String".
    // Si posem una condició amb la variable en general, 
    // s'aplicarà a totes les respostes possibles.