/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author gusta
 */
public class CalcDivTeste {

    public void Testes() {
        calculadoraDivisao calcDiv = new calculadoraDivisao();

        float div = 0;
        //Cenario de teste 1: Divisão de 2 Valores
        div = calcDiv.divisao (3, 7);
        System.out.println(div);

        //Cenario de teste 2: Divisão de 2 Valores sendo um zero
        div = calcDiv.divisao(3, 0);
        System.out.println(div);

        //Cenario de teste 3: Divisão de 2 Valores sendo que ambos sao zero
        div = calcDiv.divisao(0, 0);
        System.out.println(div);

        //Cenario de teste 4: Divisão de 2 Valores sendo um negativo
        div = calcDiv.divisao(3, -1);
        System.out.println(div);

        //Cenario de teste 5: Divisão de 2 Valores sendo o primeiro valor menor que o segundo
        div = calcDiv.divisao(8, 2);
        System.out.println(div);

        //Cenario de teste 6: Divisão de 2 Valores sendo o primeiro valor um numero decimal
        div = calcDiv.divisao((float) 2.5, 5);
        System.out.println(div);

        //Cenario de teste 6: Divisão de 2 Valores sendo o ambos negativos
        div = calcDiv.divisao( -2, 5);
        System.out.println(div);
    }
}
