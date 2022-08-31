package calculadora;

public class CalculadoraTestes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Teste de Soma");
        CalcSomaTeste soma = new CalcSomaTeste();
        soma.Testes();

        System.out.println("\nTeste de Subtracao");
        CalcSubTeste sub = new CalcSubTeste();
        sub.Testes();

        System.out.println("\nTeste de Divisao");
        CalcDivTeste div = new CalcDivTeste();
        div.Testes();

        System.out.println("\nTeste de Multplicacao");
        CalcMultTeste mult = new CalcMultTeste();
        mult.Testes();
    }
}
