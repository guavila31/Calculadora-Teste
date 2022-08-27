/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author gusta
 */
public class CalcSubTeste {

    public void Testes() {
        calculadoraSubtracao calcSub = new calculadoraSubtracao();

        int sub = 0;
        //Cenario de teste 1: Soma de 2 Valores 
        sub = calcSub.subtracao(3, 7);
        System.out.println(sub);

        //Cenario de teste 2: Soma de 2 Valores sendo um zero
        sub = calcSub.subtracao(3, 0);
        System.out.println(sub);

        //Cenario de teste 3: Soma de 2 Valores sendo que ambos sao zero
        sub = calcSub.subtracao(0, 0);
        System.out.println(sub);

        //Cenario de teste 4: Soma de 2 Valores sendo um negativo
        sub = calcSub.subtracao(3, -1);
        System.out.println(sub);
    }
}
