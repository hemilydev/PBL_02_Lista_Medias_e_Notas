public class Main {
    public static void main(String[] args) {
        String nome1 = "Maria";
        int matricula1 = 11111;
        double nota1_1 = 7.0;
        double nota2_1 = 6.0;

        String nome2 = "Rodrigo";
        int matricula2 = 22222;
        double nota1_2 = 9.0;
        double nota2_2 = 5.0;

        String nome3 = "Sophia";
        int matricula3 = 33333;
        double nota1_3 = 4.0;
        double nota2_3 = 8.0;

        double media1 = (nota1_1 * 0.4) + (nota2_1 * 0.6);
        double media2 = (nota1_2 * 0.4) + (nota2_2 * 0.6);
        double media3 = (nota1_3 * 0.4) + (nota2_3 * 0.6);

        System.out.println("Nome:" + nome1);
        System.out.println("Matricula:" + matricula1);
        System.out.println("Media:" + media1);
        System.out.println();

        System.out.println("Nome:" + nome2);
        System.out.println("Matricula:" + matricula2);
        System.out.println("Media:" + media2);
        System.out.println();

        System.out.println("Nome:" + nome3);
        System.out.println("Matricula:" + matricula3);
        System.out.println("Media:" + media3);
    }
}