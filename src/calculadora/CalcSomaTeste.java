/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author gusta
 */
public class CalcSomaTeste {

    public void Testes() {
        calculadoraSoma calcSoma = new calculadoraSoma();

        int soma = 0;
        //Cenario de teste 1: Soma de 2 Valores
        soma = calcSoma.somar(3, 7);
        System.out.println(soma);

        //Cenario de teste 2: Soma de 2 Valores sendo um zero
        soma = calcSoma.somar(3, 0);
        System.out.println(soma);

        //Cenario de teste 3: Soma de 2 Valores sendo que ambos sao zero
        soma = calcSoma.somar(0, 0);
        System.out.println(soma);

        //Cenario de teste 4: Soma de 2 Valores sendo um negativo
        soma = calcSoma.somar(3, -1);
        System.out.println(soma);
    }
}
