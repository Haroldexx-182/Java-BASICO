package com.OpenBootCamp;

// Las Excepciones de sesión son eventos que interrumpen el flujo normal de una aplicación y requieren una acción
// adicional para manejarlos y resolver el problema subyacente. Los mecanismos de excepción son una forma de manejar
// estos eventos y asegurarse de que la aplicación continúe funcionando de manera estable y eficiente. //
public class TryCatchMain {

    public static void main(String[] args) {

        try {
            int resultado = 5 / 0;              // linea de codigo problematica
        } catch (ArithmeticException e) {       // registro de la excepcion exacta que reporta el sistema
            e.printStackTrace();                // imprimir registro del fallo o error del codigo
        } finally {                             // Este bloque es ejecutado siempre, si fue o no capturada la excepcion
            System.out.println("Cierre de Recursos");
        }

        System.out.println("Fin");
    }
}
