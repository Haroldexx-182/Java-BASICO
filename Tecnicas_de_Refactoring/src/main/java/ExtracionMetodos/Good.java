package ExtracionMetodos;

public class Good {

    // Extraccion de Metodos

    // Tecnica de Refactoring para componer metodos

    public class Main {

        void printHTML(){

            printHead();
            printBody();
            printFooter();
        }

        private void printFooter(){
            System.out.println("<footer> 2021 Cosmic developments with love </footer>");
            System.out.println("script");
            System.out.println("copyright");
            System.out.println(" ");

        }
    }
}
