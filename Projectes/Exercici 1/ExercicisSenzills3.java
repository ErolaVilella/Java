public class ExercicisSenzills3{
    public static void main(String[] args) {
 
    String nom;
    String sexe;
    int edat;
    
    System.out.println("Quin és el teu nom?");
    nom = System.console().readLine();

    System.out.println("Ets home o dona? ");
    sexe = System.console().readLine();

    System.out.println("Quants anys tens? ");
    edat = Integer.parseInt(System.console().readLine());

    if (sexe.equals("home")){
        if (edat<16){
            System.out.println(nom+", la teva categoria és Juvenil masculí.");
        }
        else if (edat<65){
            System.out.println(nom+", la teva categoria és Sénior masculí.");
        }
    else {
        System.out.println(nom+", la teva categoria és Veterà masculí.");
        }
    }
 
    if (sexe.equals("dona")){
        if (edat<16){
            System.out.println(nom+", la teva categoria és Juvenil femení.");
        }
        else if (edat<65){
            System.out.println(nom+", la teva categoria és Sénior femení.");
        }
    else {
        System.out.println(nom+", la teva categoria és Veterà femení.");
        }
    }

    }
}