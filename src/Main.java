public class Main {
    public static void main(String[] args) {


//            Pirma uzduotis

        System.out.println("--------- 1 uzd -------------");

        String actorName1 = "Benedict";
        String actorSurname1 = "Cumberbatch";

        System.out.println(actorName1.length());
        System.out.println(actorSurname1.length());

        System.out.println("--------");

        if (actorName1.length() < actorSurname1.length()) {
            System.out.println(actorName1);
        } else {
            System.out.println(actorSurname1);
        }


//        Antra uzduotis


        System.out.println("----------2 uzd----------");

        String actorName2 = "Benedict";
        String actorSurname2 = "Cumberbatch";

        System.out.println(actorName2.toUpperCase() + " " + actorSurname2.toLowerCase());


//            Trecia uzduotis

        System.out.println("--------- 3 uzd -------------");

        String actorName3 = "Benedict";
        String actorSurname3 = "Cumberbatch";


        System.out.println(actorName3.substring(0,1));
        System.out.println(actorSurname3.substring(0,1));

        System.out.println("--------");

        String cutName3 = actorName3.substring(0,1) + actorSurname3.substring(0,1);

        System.out.println(cutName3);


//            Ketvirta uzduotis

        System.out.println("--------4 uzd------------");


        String actorName4 = "Benedict";
        String actorSurname4 = "Cumberbatch";


        System.out.println(actorName3.substring(actorName4.length() - 3));
        System.out.println(actorSurname4.substring(actorSurname4.length() -3));

        System.out.println("-------------------");

        String cutName4 = actorName4.substring(actorName4.length() - 3) + actorSurname4.substring(actorSurname4.length() -3);

        System.out.println(cutName4);


//        Penkta uzduotis

        System.out.println("--------5 uzd------------");

        String paris5 = "An American in Paris";

        System.out.println(paris5);

        System.out.println("-------------------");

        System.out.println(paris5.replaceAll("[A,a]","*"));


//        Sesta uzduotis

        System.out.println("--------6 uzd------------");

        String paris6 = "An American in Paris";
        String tiff6 = "Breakfast at Tiffany's";
        String space6 = "2001: A Space Odyssey";
        String life6 = "It's a Wonderful Life";

        System.out.println(paris6);
        System.out.println(tiff6);
        System.out.println(space6);
        System.out.println(life6);

        System.out.println("-------------------");


        System.out.println(paris6.replaceAll("[AEIOUYaeiouy]",""));
        System.out.println(tiff6.replaceAll("[AEIOUYaeiouy]",""));
        System.out.println(space6.replaceAll("[AEIOUYaeiouy]",""));
        System.out.println(life6.replaceAll("[AEIOUYaeiouy]",""));


//        Septinta uzduotis

        System.out.println("--------7 uzd------------");


        String starWars7;

        starWars7 = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";

        System.out.println(starWars7);

        System.out.println("-------------------");

        starWars7 = starWars7.substring(starWars7.length()-14);
            System.out.println(starWars7.substring(0,1));
























    }
}