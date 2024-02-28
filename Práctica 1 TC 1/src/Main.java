

public class Main {
    public static void main(String[] args) {
        /*
         * Enrique Flores Ortiz
         * 2022670086
         * 4CM2
         * 28/02/24
         */

        String lenguaje1 = "Computadora";

        String[] cadena1 = {"10", "20", "40", "50"};
        String[] cadena2 = {"10", "40", "30", "60" , "80"};

        OperacionLenguajes operacionLenguajes = new OperacionLenguajes(lenguaje1);
        operacionLenguajes.GenerarPrefijos(lenguaje1);
        operacionLenguajes.GenerarSufijos(lenguaje1);
        OperacionLenguajes.GenerarSubcadenas(lenguaje1);
        OperacionLenguajes.unionDecadenas(cadena1, cadena2);
        OperacionLenguajes.interseccionDecadenas(cadena1, cadena2);
        OperacionLenguajes.GenerarConcatenacion(cadena1, cadena2);
        OperacionLenguajes.GenerarPotencia(cadena1);
        OperacionLenguajes.GenerarPotencia(cadena2);

    }
}