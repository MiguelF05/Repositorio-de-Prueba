package Clase_5;

public class NumerosPrimos {
    public static void main(String[] args) {
        String numerosPrimos="";
        int contadorDePrimos=0;
        int numero=1;
        while (contadorDePrimos<100){
            if(esPrimo(numero)){
                numerosPrimos+=numero+" ";
                contadorDePrimos++;
            }
            numero++;
        }
        System.out.println("Los 100 primeros numeros primos son : "+numerosPrimos);


    }
    private static boolean esPrimo(int numero) {
        boolean esNumeroPrimo=true;
        for (int i=0;i<numero;i++) {
            if (numero % 2 == 0) {
                esNumeroPrimo = false;
            }
        }

        return esNumeroPrimo;
    }
}
