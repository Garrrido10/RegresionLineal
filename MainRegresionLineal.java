package Estructura_De_Datos.Ajuste_De_Funciones;

public class MainRegresionLineal {
    public static void main(String[] args) {
        // Conjunto de datos de prueba (ejemplo X e Y)
        double[] x = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0};
        double[] y = {0.5, 2.5, 2.0, 4.0, 3.5, 6.0, 5.5};

        // Ejecutar el algoritmo de mínimos cuadrados y correlación
        double[] resultados = RegresionLineal.calcularMinimosCuadrados(x, y);

        // Extraer los coeficientes obtenidos para hacer una predicción
        double beta0 = resultados[0];
        double beta1 = resultados[1];

        // Prueba del método de predicción
        double valorX = 8.0;
        double prediccionY = RegresionLineal.predecir(beta0, beta1, valorX);

        System.out.println("\n--- PRUEBA DE PREDICCION ---");
        System.out.printf("Para un valor X = %.1f, la estimacion de Y es: %.4f%n", valorX, prediccionY);
    }
}
