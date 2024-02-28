import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Llamamos a la clase

        String lenguaje1 = "Computadora";

        String[] cadena1 = {"10", "20", "40", "50"};
        String[] cadena2 = {"10", "40", "30", "60" , "80"};

        LenguajesRegulares lenguajesRegulares = new LenguajesRegulares(lenguaje1);
        lenguajesRegulares.GenerarPrefijos(lenguaje1);
        lenguajesRegulares.GenerarSufijos(lenguaje1);
        LenguajesRegulares.unionDecadenas(cadena1, cadena2);
        LenguajesRegulares.interseccionDecadenas(cadena1, cadena2);
        LenguajesRegulares.GenerarConcatenacion(cadena1, cadena2);
        LenguajesRegulares.GenerarPotencia(cadena1);
        LenguajesRegulares.GenerarPotencia(cadena2);

    }
}