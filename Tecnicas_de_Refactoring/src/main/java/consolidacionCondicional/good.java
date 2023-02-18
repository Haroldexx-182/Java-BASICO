package consolidacionCondicional;

public class good {

    public class Main {

        private double salarioExtra;
        private int antiguedad;
        private int educacion;
        private int incidentes;
        private boolean certificacion;

        double calcularSalario(){

            double result = 0;
            if (!esElegibleSalarioExtra()) {     //#if llama a un metodo que verifica si el salario extra es elegible
                return result;
            }

            // Calcula Salario Extra:
            result += 5;

            return result;
        }

        private boolean esElegibleSalarioExtra() {                   // metodo
            boolean estudios = antiguedad<1 || educacion<1; // categoria
            boolean experiencia = incidentes > 10 || !certificacion; // categoria
            return estudios || experiencia;
        }
    }
}
