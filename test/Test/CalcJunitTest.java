package Test;

import calculadora.calculadoraDivisao;
import calculadora.calculadoraMultiplicacao;
import calculadora.calculadoraSoma;
import calculadora.calculadoraSubtracao;
import junit.framework.Assert;
import org.junit.Test;

public class CalcJunitTest {

    //Cenario de Junit teste 1: Soma de 2 Valores 
    @SuppressWarnings("deprecation")
    @Test
    public void junitSoma() {
        calculadoraSoma somaTest = new calculadoraSoma();
        int soma = 0;

        soma = somaTest.somar(3, 7);
        System.out.println(somaTest);
        Assert.assertEquals(10, soma);
    }

    //Cenario de Junit teste 1: Subtracao de 2 Valores 
    @SuppressWarnings("deprecation")
    @Test
    public void junitSubtracao() {
        calculadoraSubtracao subTest = new calculadoraSubtracao();
        int sub = 0;

        sub = subTest.subtracao(3, 7);
        System.out.println(subTest);
        Assert.assertEquals(-4, sub);
    }

    //Cenario de Junit teste 1: divisao de 2 Valores 
    @SuppressWarnings("deprecation")
    @Test
    public void junitDivisao() {
        calculadoraDivisao divTest = new calculadoraDivisao();
        float div = 0;

        div = divTest.divisao(9, 3);
        System.out.println(divTest);
        Assert.assertEquals(3.0, div);
    }

    //Cenario de Junit teste 1: multiplicacao de 2 Valores 
    @SuppressWarnings("deprecation")
    @Test
    public void junitMultiplicacao() {
        calculadoraMultiplicacao multTest = new calculadoraMultiplicacao();
        float mult = 0;

        mult = multTest.multiplicacao(3, 7);
        System.out.println(multTest);
        Assert.assertEquals(21.0, mult);
    }

    public CalcJunitTest() {
    }
}
