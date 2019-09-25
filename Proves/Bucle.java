public class Bucle{
    public static void main(String[] args) {

        int iteracio=0;
        //int fi=5;
        String llista[] = {"Nico", "Timur", "Pep"};

        while(iteracio<llista.length){
            // System.out.println("Iteració: "+iteracio);
            // iteracio++;
            System.out.println(llista[iteracio]);
            iteracio++;
        }

        System.out.println("Ja ha acabat.");

    }
}

//Seria més aconsellable utilitzar un "for" si saps el número d'iteracions.