public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        int nota = 10;

        // CONDIÇÃO TERNÁRIA ABAIXO:

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        // FIM DA CONDIÇÃO TERNÁRIA

        System.out.println(resultado);
    }
}
