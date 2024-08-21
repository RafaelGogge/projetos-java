public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue; // break ou continue, break: para no 3, continue: ignora o 3

            System.out.println(numero);
        }
    }
}
