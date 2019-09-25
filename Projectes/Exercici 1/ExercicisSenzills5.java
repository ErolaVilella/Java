public class ExercicisSenzills5{
    public static void main(String[] args) {

        String pregunta1;
        String pregunta2;
        String pregunta3;
        String pregunta4;

        System.out.println("Quina és l'estrella més gran del sistema solar?");
        pregunta1 = System.console().readLine();

        if (pregunta1.equals("el sol")){
            System.out.println("Quin és el satèl·lit de la Terra?");
            pregunta2 = System.console().readLine();
            
            if (pregunta2.equals("la lluna")){
                System.out.println("Quin és el planeta més proper al Sol");
                pregunta3 = System.console().readLine();

                if (pregunta3.equals("mercuri")){
                System.out.println("Què hi ha al centre de cada galàxia?");
                pregunta4 = System.console().readLine();
                    
                    if (pregunta4.equals("un forat negre")){
                        System.out.println("Felicitats! tens 4 punts!!");
                    }
                else {
                    System.out.println("T'has equivocat! Tens 3 punts.");
                    }
                }
            else {
                System.out.println("T'has equivocat! Tens 2 punt.");
                }
            }
            else {
                System.out.println("T'has equivocat! Tens 1 punt.");
            }
        }
        else {
            System.out.println("T'has equivocat! Tens 0 punts.");
            }
        
    }

}
