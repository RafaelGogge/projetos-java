public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Felipe", "Jonas", "Julia", "Marcos" };

        // em arrays o indice inicia em 0, ou seja, x = 0

        for (int x = 0; x < alunos.length; x++) { // length é o tamanho da estrutura
            System.out.println("O aluno do indice x=" + x + " é " + alunos[x]);
        }

        System.out.println(" ");
        for (String aluno : alunos) { // modo simplificado
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}