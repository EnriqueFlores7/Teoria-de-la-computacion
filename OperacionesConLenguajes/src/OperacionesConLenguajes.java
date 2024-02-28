import java.util.*;

public class OperacionLenguajes {
    private String lenguaje1;
    public OperacionLenguajes(String lenguaje1){
        this.lenguaje1 = lenguaje1;
    }

    public String getLenguaje1() {
        return lenguaje1;
    }

    public void setLenguaje1(String lenguaje1) {
        this.lenguaje1 = lenguaje1;
    }

    public String GenerarPrefijos(String lenguaje1){
        System.out.println("Prefijo: ");
        String prefijo = "";
        for (int contador =0; contador < lenguaje1.length(); contador++){
            prefijo += lenguaje1.charAt(contador);
            System.out.println(prefijo);
        }
        return "";
    }
    public String GenerarSubcadenas(String lenguaje1){
        return "";
    }

    public String GenerarSufijos(String lenguaje1){
        System.out.println("Sufijos: ");
        for (int i = lenguaje1.length(); i > 0; i--) {
            String subcadena = lenguaje1.substring(i - 1);
            System.out.println(subcadena);
        }
        return "";
    }

    public static Set<String> unionDecadenas(String[] cadena1, String[] cadena2){
        System.out.println("Union: ");
        Set<String> conjunto = new LinkedHashSet<>();
        for (String str : cadena1) conjunto.add(str);
        for (String str : cadena2) conjunto.add(str);
        System.out.println(conjunto);
        return conjunto;
    }

    public static Set<String> interseccionDecadenas(String[] cadena1, String[] cadena2){
        System.out.println("Interseccion: ");
        Set<String> conjunto = new LinkedHashSet<>();
        for (String str: cadena1) conjunto.add(str);
        Set<String> conjunto2 = new LinkedHashSet<>();
        for (String str: cadena2) conjunto2.add(str);
        conjunto.retainAll(conjunto2);
        System.out.println(conjunto);
        return conjunto;
    }

    public static List<String> GenerarConcatenacion(String[] cadena1, String[] cadena2){
        System.out.println("Concatenacion: ");
        List<String> resultado = new ArrayList<>();
        for (String elemento1 : cadena1){
            for (String elemento2 : cadena2){
                //Directamente concatenamos los elementos de tipo string
                resultado.add(elemento1 +elemento2);
            }
        }
        System.out.println(resultado);
        return resultado;
    }

    public static String[] GenerarPotencia(String[] cadena1) {
        String[] resultados = new String[cadena1.length * cadena1.length];
        int contador = 0;
        int potencia = 1;
        System.out.println("Potencia :");
        for (int i = 0; i < cadena1.length; i++) {
            for (int j = 0; j < cadena1.length; j++) {
                // Concatenamos los elementos como Strings
                String base = cadena1[i] + cadena1[j];
                // Creamos un StringBuilder para construir el resultado de la 'potencia'
                StringBuilder resultado = new StringBuilder();
                for (int k = 0; k < potencia; k++) {
                    resultado.append(base);
                }
                resultados[contador++] = resultado.toString();
            }
        }
        ImprimirFormato(resultados);
        return resultados;
    }

    public static void ImprimirFormato(String[] cadena1){
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < cadena1.length; i++) {
            stringBuilder.append(cadena1[i]);
            if (i < cadena1.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }
}
