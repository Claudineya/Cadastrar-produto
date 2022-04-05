import models.Produto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) throws Exception {
        System.out.println("---PEDIDO DE VENDAS---");

        int option;

        do {
            System.out.println("1 - Cadastrar produto");
            System.out.println("0 - Sair");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Qual Operação você Deseja Realizar: ");
            option = scanner.nextInt();
            process(option);
        } while (option != 0);

    }

    public static void process(int option) throws Exception {
              switch (option) {
            case 1: {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Qual a descrição que  você deseja dar ao novo produto: ");
                String descrição = scanner.nextLine();

                System.out.print("Qual o ID você dese dar ao  novo produto:");
                int id = scanner.nextInt();

                System.out.println("Qual o Preço;");
                double preço = scanner.nextDouble();

                System.out.println("Qual a data e validade:");
                String dataString = scanner.next();

                Date dataValidade = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

                Produto novoProduto = new Produto(id, descrição, preço, dataValidade);

                System.out.println("Produto criado com sucesso:");
                System.out.println("---ID:" + novoProduto.getId());
                System.out.println("---Descrição:" + novoProduto.getDescrição());
                System.out.println("---Preço:" + novoProduto.getPreço());
                System.out.println("---Data de Validade:" + novoProduto.getDataValidade());
                System.out.println("------------------------------");
                }
            }

        }
    }

