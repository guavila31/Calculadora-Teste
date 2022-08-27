/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author gusta
 */
public class CalcMultTeste {

    public void Testes() {
        calculadoraMultiplicacao calcMult = new calculadoraMultiplicacao();

        float mult = 0;
        //Cenario de teste 1: Multiplicação de 2 Valores
        mult = calcMult.multiplicacao(3, 7);
        System.out.println(mult);

        //Cenario de teste 2: Multiplicação de 2 Valores sendo um zero
        mult = calcMult.multiplicacao(3, 0);
        System.out.println(mult);

        //Cenario de teste 3: Multiplicação de 2 Valores sendo que ambos sao zero
        mult = calcMult.multiplicacao(0, 0);
        System.out.println(mult);

        //Cenario de teste 4: Multiplicação de 2 Valores sendo um negativo
        mult = calcMult.multiplicacao(3, -1);
        System.out.println(mult);

        //Cenario de teste 5: Multiplicação de 2 Valores sendo os dois valores negativos
        mult = calcMult.multiplicacao(-5, -9);
        System.out.println(mult);

        //Cenario de teste 6: Multiplicação de 2 Valores sendo um valor decimal
        mult = calcMult.multiplicacao((float) 5.5, 2);
        System.out.println(mult);



    }
}
