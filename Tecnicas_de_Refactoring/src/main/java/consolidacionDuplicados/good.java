package consolidacionDuplicados;

public class good {

    // Tecnica de Refactoring para simplificar expresiones condicionales

    // Consolidacion de Duplicacion Condicional de fragmentos

    public class Main {

        private double salarioExtra;
        private int antiguedad;
        private int educacion;
        private int incidentes;
        private boolean certificacion;

        double calcularSalarioExtra(){
            double result = 0;
            if (esElegibleSalarioExtra()) {
                return = 500;
            }else{
                result = 0;
            }
            sendMessage();     // Ahora el metodo no se repite
            return result;
        }

        private void sendMessage(){
            // enviar correo
            // conectar al servidor smtp
            System.out.println("Enviando Mensaje");
        }
    }
}

