package consolidacionCondicional;

public class Bad {

    public class Main {

        private double salarioExtra;
        private int antiguedad;
        private int educacion;
        private int incidentes;
        private boolean certificacion;

        double calcularSalarioExtra(){
            double result = 0;
            if (antiguedad<1){
                return 0;
            }
            if (educacion<1){
                return 0;
            }
            if (incidentes > 10){
                return 0;
            }
            if (!certificacion){
                return 0;
            }

            //Calcular Salario Extra
            //...

            return result;
        }

    }
}


