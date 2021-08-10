// 1 - Pacote

package intro;
//2 - Referencia as bibliotecas

// 3 - Classe

public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos ( void - não tem retorno) e Funções ( sem void - tem retorno)

    public static void main(String[] args) {
        System.out.println("Cálculo de área ");

        //calculo de área reduzido
        int largura= 4;
        int comprimento = 3;

        System.out.println("Para a largura de " +largura+ "m e o comprimento de "+comprimento+ "m a área é de : "+largura * comprimento + "m²");




    }
    public void calcularAreaModoExtenso(){
        // Cálculo de área - Exemplo : o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4; // largura recebe 4
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("A área é de : " + resultado + " m²");
    }
    public void calcularAreaModoCompacto(){
        //calculo de área reduzido


    }

}
