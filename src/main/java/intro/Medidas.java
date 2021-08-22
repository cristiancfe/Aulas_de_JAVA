// 1 - Pacote

package intro;
//2 - Referencia as bibliotecas


import java.util.Locale;
import java.util.Scanner;
    // 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos ( void - não tem retorno) e Funções ( sem void - tem retorno)

    public static void main(String[] args) {
        //condicional = verificar uma condição - fazer uma pergunta para uma pessoa , um hardware ou software

        //Utilizar a classe Scanner do JAVA para ler a escolha do usuário no console

        Scanner scanner = new Scanner(System.in);
        System.out.println(" ME N U  D E  O P Ç Õ E S ");
        System.out.println("C - Calcular modo curto");
        System.out.println("E - Calcular modo extenso");
        System.out.println("I - If Simples");
        System.out.println("Digite a opção desejada:");
        String opcao = scanner.next().toLowerCase();

        //switch = selecionar o comportamento do programa de acordo com a escolha da pessoa ou software

        //String opcao = "curto";
        switch (opcao){
            case "i":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "c":
                System.out.println("Você escolheu executar o método  calcularAreaModoCurto");
                calcularAreaModoCurto();
                break;
            case "e":
                System.out.println("Você escolheu executar o método    calcularAreaModoExtenso");
                calcularAreaModoExtenso();
                break;
            default:
                System.out.println("Você não escolheu um método para executar o código");
                break;
        }


    }

    public static void ifSimples(){
        //condicional = verificar uma condição - fazer uma pergunta para uma pessoa , um hardware ou software

        // if = se
        // else = senão
        String modo = "curto";

        if(modo == "curto"){
            calcularAreaModoCurto();
        }else{
            calcularAreaModoExtenso();
        }

    }

    public static void calcularAreaModoCurto(){

            System.out.println("Cálculo de área Modo Curto ");

            //calculo de área reduzido
            int largura= 4;
            int comprimento = 3;

            System.out.println("Para a largura de " +largura+ "m e o comprimento de "+comprimento+ "m a área é de : "+largura * comprimento + "m²");


        }



    public static void calcularAreaModoExtenso(){

        System.out.println("Cálculo de área Modo Extenso ");

        // Cálculo de área - Exemplo : o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5; // largura recebe 4
        comprimento = 6;

        resultado = largura * comprimento;
        System.out.println("A área é de : " + resultado + " m²");
    }


}
