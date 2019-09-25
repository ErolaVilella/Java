public class TestArray{
    public static void main(String[] args) {
        System.out.println("Introdueix un nom");
        String nom1 = System.console().readLine();

        System.out.println("Introdueix un nom");
        String nom2 = System.console().readLine();

        System.out.println("Introdueix un nom");
        String nom3 = System.console().readLine();

        
        String arrayNoms[]={nom1,nom2,nom3};

        System.out.println("Mida Array "+arrayNoms.length);

        int posicio=(int)System.currentTimeMillis()%3;

        System.out.println("Nom aleatori: "+arrayNoms[posicio]);
        
    }
}

//Si vull imprimir la primera posició posaré "0", sinó "1", "2", etc.