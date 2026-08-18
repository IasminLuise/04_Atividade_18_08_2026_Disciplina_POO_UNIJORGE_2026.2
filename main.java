import java.util.Scanner; //biblioteca para utilizar comando scanner

public static void main () {  //execução do programa principal

    Scanner input = new Scanner(System.in); //comando atribuido para impressao de dados

    int quantidade = 0; //variavel para estipular quantidade de vezes para rodar
    double total = 0;  //variavel para calculo dos dados

    System.out.println("Digite a quantidade de vendas a ser registrada: ");
    quantidade = input.nextInt(); // armazenamento em variavel

    for (int qtd = 0; qtd < quantidade; qtd++){  //laço de repetição
    double venda= 0; //variavel para armazenar os valores inseridos pelo usuario
        System.out.println("Digite o valor da venda: R$  ");
                venda = input.nextDouble(); // armazenamento em variavel
                total = total + venda; //soma do total de vendas registradas
    }
    System.out.println("O valor total das vendas é: R$ " + total);

        }
