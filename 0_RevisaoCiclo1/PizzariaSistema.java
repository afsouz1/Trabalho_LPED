import java.util.Scanner;

/**
 * Atividade
 * 
 * Refaça a questão 04 realizando as seguintes mudanças:
 * 
 * 1. Ao invés de digitar um código para cada pizza o cliente poderá escolher no
 * menu
 * dentre os códigos disponíveis;
 * 2. O pedido pode ter até 10 itens. As pizzas podem incluir meia de cada. Para
 * fazer
 * o valor de cálculo de cada metade divida o valor e some o das duas metades;
 * 3. Libere o cliente para comprar bebidas também no pedido:
 * código Produto
 * 303 água
 * 304 suco de laranja
 * 310 refrigerante normal
 * 315 refrigerante zero açúcar
 * 4. Peça o cliente o endereço completo e a distância da pizzaria da sua casa.
 * Inclua o valor do frete no pedido:
 * Distância Valor Tempo adicional de entrega
 * menos 1 km grátis 0 minutos
 * de 1 a 5 km R$ 5,00 10 minutos
 * mais de 5 km R$ 10,00 25 minutos
 * Considere o tempo de preparo base de 40 minutos e acrescente o tempo de
 * entrega de acordo
 * com a distância informada.
 * 5. Mostre o resumo do pedido completo, o valor do frete, valor final do
 * pedido e o tempo
 * de entrega. Peça ao cliente para escolher entre as seguintes formas de
 * pagamento: cartão
 * de crédito, pix ou vale refeição
 */

public class PizzariaSistema {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Determinação das Variáveis

        // Pizzas
        int codigo[] = { 1, 2, 3, 4, 303, 304, 310, 315 }, opt[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, ctrl = 0,
                ctrl1 = 0, meia = 0;
        String nome[] = { " JAVA   ", " C++    ", " PYTHON ", " SQL    ", "Água                    ",
                "Suco de Laranja         ", "Refrigerante            ", "Refrigerante Zero Açúcar" };
        String ingredientes[] = { "(Mussarela, Chocolate, Branco e Café Granulado)   ",
                "(Masstomate, Calabresa, Cebola, Orégano e ++)     ",
                "(Masstomate Raiz, Mussarela,Carne Cobra e Cebola) ",
                "(Molho, Mussarela, Calabresa)                     " };
        double valores[] = { 75.95, 88.15, 79.95, 90.87, 3.75, 12.99, 8.35, 7.99 };

        // Vetorização do pedido
        int codPedido[] = new int[10], tempo[] = { 40, 50, 25 }, temp1 = 0, qtd[] = new int[10];
        double calc = 0, frete[] = { 0, 5, 10 }, fret1 = 0, vlPedido[] = new double[10];
        String endereco = null, nomePedido[] = new String[10];

        // Teste imprimir cardápio
        System.out.print(
                "\n\nSelecione o cardápio para exibir:\n (1)Pizzas;\n (2)Bebidas;\n (3)Cardápio Completo;\n (4)Fazer pedido;\n Opção:  ");
        opt[0] = in.nextInt();

        if (opt[0] == 1) {

            // Imprimir cardápio de Pizzas
            System.out.println("\n---CARDÁPIO PIZZAS-----------------------------------");
            System.out.println("..Cód...Pizza....Vl Inteira......Vl Meia....");
            for (int i = 0; i < 4; i++) {
                System.out.println(
                        "  " + codigo[i] + "  " + nome[i] + "   R$ " + valores[i] + "      R$ " + (valores[i] / 2));
            }
            System.out.println("-----------------------------------------------------");

            // Opção para mostrar a descrição
            do {
                ctrl = 0;
                ctrl1 = 0;
                System.out.print("\n\nDigite o código da pizza para mostrar ingredientes: ");
                opt[0] = in.nextInt();
                for (int i = 0; i < 4; i++) {
                    if (opt[0] == codigo[i]) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println(
                                " CÓD            PIZZA              INGREDIENTES                                 VALOR");
                        System.out.println("  " + codigo[i] + "       " + nome[i] + "        " + ingredientes[i]
                                + "         R$" + valores[i]);
                        System.out.println("-----------------------------------------------------");
                        ctrl1 = 1;
                    }
                }
                if (ctrl1 == 0)
                    System.out.println("\nErro: código digitado inválido\n");
                System.out.print("\n\nDeseja consultar outro item?\n (1)Sim;\n (0)Não;\n Opção:  ");
                ctrl = in.nextInt();
            } while (ctrl == 1);

        } else if (opt[0] == 2) {

            // Imprimir cardápio de Bebidas
            System.out.println("\n---CARDÁPIO BEBIDAS----------------------------------");
            System.out.println("..Cód........Ítem.......................Valor....");
            for (int i = 0; i < 4; i++) {
                System.out.println("  " + codigo[i + 4] + "        " + nome[i + 4] + "   R$ " + valores[i + 4]);
            }
            System.out.println("--------------------------------------------------");

        } else if (opt[0] == 3) {

            // Imprimir cardápio de Pizzas
            System.out.println("\n---CARDÁPIO PIZZAS E BEBIDAS-------------------------");
            System.out.println("..Cód...Pizza....Vl Inteira......Vl Meia....");
            for (int i = 0; i < 4; i++) {
                System.out.println(
                        "  " + codigo[i] + "  " + nome[i] + "   R$ " + valores[i] + "      R$ " + (valores[i] / 2));
            }
            System.out.println("----------------------------------------------------");

            // Imprimir cardápio de Bebidas
            System.out.println("..Cód........Ítem.......................Valor....");
            for (int i = 0; i < 4; i++) {
                System.out.println("  " + codigo[i + 4] + "        " + nome[i + 4] + "   R$ " + valores[i + 4]);
            }
            System.out.println("----------------------------------------------------");

            // Opção para mostrar a descrição
            do {
                ctrl = 0;
                ctrl1 = 0;
                System.out.print("\n\nDigite o código da pizza para mostrar ingredientes: ");
                opt[0] = in.nextInt();
                for (int i = 0; i < 4; i++) {
                    if (opt[0] == codigo[i]) {
                        System.out.println(
                                "\n-------------------------------------------------------------------------------------------------");
                        System.out.println(
                                " CÓD            PIZZA              INGREDIENTES                                 VALOR");
                        System.out.println("  " + codigo[i] + "       " + nome[i] + "        " + ingredientes[i]
                                + "         R$" + valores[i]);
                        System.out.println(
                                "------------------------------------------------------------------------------------------------------");
                        ctrl1 = 1;
                    }
                }
                if (ctrl1 == 0)
                    System.out.println("\nErro: código digitado inválido\n");
                System.out.print("\n\nDeseja consultar outro item?\n (1)Sim;\n (0)Não;\n Opção:  ");
                ctrl = in.nextInt();
            } while (ctrl == 1);

        } else if (opt[0] == 4) {
            System.out.println("\n");
        } else {
            System.out.println("\n\nCódigo digitado inválido\n");
        }

        // Realizar pedido
        if (opt[0] != 4) {
            System.out.print("\nDeseja iniciar o pedido?\n (1)Sim;\n (0)Não, finalizar sistema;\n Opção:  ");
            ctrl = in.nextInt();
            if (ctrl == 0) {
                System.out.println("\nFim do sistema.\n\n");
                System.exit(meia);
            }
        }

        // Pedido de Pizzas e Bebidas
        System.out.println("\n--  PEDIDO  --");
        for (int i = 0; i < 10; i++) {
            ctrl = 0;
            System.out.print("\nInserir Item:\n (1)Pizza Inteira;\n (2)Pizza Meia;\n (3)Bebida;\n  Opção:  ");
            opt[1] = in.nextInt();

            // Módulo pizza inteira
            if (opt[1] == 1) {
                System.out.println("\nItem " + (i + 1));
                System.out.print("Insira o código da Pizza:\n (1)JAVA;\n (2)C++\n (3)PYTHON\n (4)SQL\n Opção:  ");
                codPedido[i] = in.nextInt();
                System.out.print("Quantidade: ");
                qtd[i] = in.nextInt();
                for (int j = 0; j < 4; j++) {
                    if (codPedido[i] == codigo[j]) {
                        vlPedido[i] = valores[j] * qtd[i];
                        nomePedido[i] = nome[j];
                        calc = calc + vlPedido[i];
                        System.out.println("+ R$" + vlPedido[i]);
                        System.out.println("Total: R$" + calc);
                        ctrl = 1;
                    }
                }
                if (ctrl == 0) {
                    System.out.println("\n!ERRO! Código digitado inválido, refaça a operação.");
                    i--;
                }
            }

            // Módulo pizza meia
            if (opt[1] == 2) {
                System.out.println("\nItem " + (i + 1));
                System.out.print(
                        "Insira o código da primeira metade:\n (1)JAVA;\n (2)C++\n (3)PYTHON\n (4)SQL\n Opção:  ");
                codPedido[i] = in.nextInt();
                System.out.print(
                        "Insira o código da segunda metade:  ");
                codPedido[i+1] = in.nextInt();
                System.out.print("Quantidade: ");
                qtd[i] = in.nextInt();
                qtd[i+1] = qtd[i];

                // Verificação se há cadastro do item
                for (int j = 0; j < 4; j++) {
                    if (codPedido[i] == codigo[j]) {
                        vlPedido[i] = (valores[j] / 2) * qtd[i];
                        nomePedido[i] = (nome[j] + "/meia");
                        calc = calc + vlPedido[i];
                        System.out.println("+ R$" + vlPedido[i]);
                        ctrl = 1;
                    }
                }

                // Verificação se há cadastro do item
                if (ctrl == 0) {
                    System.out.println("\n!ERRO! Código digitado inválido, refaça a operação.");
                    i--;
                } else {
                    // Incremento do item
                    i++;
                    // Verificação se há cadastro do item
                    for (int j = 0; j < 4; j++) {
                        if (codPedido[i] == codigo[j]) {
                            vlPedido[i] = (valores[j] / 2) * qtd[i];
                            nomePedido[i] = (nome[j] + "/meia");
                            calc = calc + vlPedido[i];
                            System.out.println("+ R$" + vlPedido[i]);
                            ctrl = 1;
                        }
                    }

                    // Verificação se há cadastro do item
                    if (ctrl == 0) {
                        System.out.println("\n!ERRO! Código digitado inválido, refaça a operação.");
                        i--;
                    }

                }

            }

            // Módulo adição de bebidas
            if (opt[1] == 3) {
                System.out.println("\nItem " + (i + 1));
                System.out.print(
                        "Insira o código da Bebida:\n (303)Água\n (304)Suco de Laranja\n (310)Refrigerante\n (315)Refrigerante Zero Açúcar\n Opção:  ");
                codPedido[i] = in.nextInt();
                System.out.print("Quantidade: ");
                qtd[i] = in.nextInt();
                for (int j = 0; j < 8; j++) {
                    if (codPedido[i] == codigo[j]) {
                        vlPedido[i] = valores[j] * qtd[i];
                        nomePedido[i] = nome[j];
                        calc = calc + vlPedido[i];
                        System.out.println("+ R$" + vlPedido[i]);
                        ctrl = 1;
                    }
                }
                if (ctrl == 0) {
                    System.out.println("\n!ERRO! Código digitado inválido, refaça a operação.");
                    i--;
                }
            }
            // Parar o loop de adição de itens
            System.out.print("\nDeseja adicionar item? (1)Sim; (0)Não; Opção:  ");
            opt[0] = in.nextInt();
            if (opt[0] == 0) {
                break;
            }
        }

        // Frete
        in.nextLine();
        System.out.print("\nInsira o endereço completo do cliente: ");
        endereco = in.nextLine();

        System.out.print("\nSelecione a distância:\n (1)<1km\n (2)<5km;\n (3)>=5km\n Opção:  ");
        opt[0] = in.nextInt();
        ctrl = 0;
        do {
            switch (opt[0]) {
                case 1:
                    calc = calc + frete[0];
                    ctrl = 1;
                    System.out.println("+R$" + frete[0]);
                    fret1 = frete[0];
                    temp1 = tempo[0];
                    break;
                case 2:
                    calc = calc + frete[1];
                    ctrl = 1;
                    System.out.println("+R$" + frete[1]);
                    fret1 = frete[1];
                    temp1 = tempo[1];

                    break;
                case 3:
                    calc = calc + frete[2];
                    ctrl = 1;
                    System.out.println("+R$" + frete[2]);
                    fret1 = frete[2];
                    temp1 = tempo[2];
                    break;

                default:
                    System.out.println("\nCódigo digitado inválido, refaça a operação");
                    ctrl = 0;
                    break;
            }
        } while (ctrl == 0);

        System.out.print("\nPressione 0 para imprimir a FATURA...");
        opt[0] = in.nextInt();


        System.out.println("                                         PIZZARIA FEDERAL");
        System.out.println("=========================================================");
        System.out.println("_ITEM______________DESCRIÇÃO______________QTD__________VL____");
        for (int i = 0; i < 10; i++) {
            if (codPedido[i] != 0) {
                System.out.println((i+1)+"       "+nomePedido[i]+"      "+qtd[i]+"        R$"+vlPedido[i]);
            } else {
                break;
            }
        }
        System.out.println("Frete..............................................R$" + fret1);
        System.out.println("Total..............................................R$" + calc);
        System.out.println("\n\nEndereço: "+endereco);
        if (temp1 != 0) {
            System.out.println("Tempo de entrega estimado: " + temp1 + " minutos\n\n");
        }
        System.out.print("\nSelecione o meio de pagamento:\n (1)Pix;\n (2)Crédito;\n (3)Vale Refeição\n Opção:  ");
        opt[0] = in.nextInt();

        switch (opt[0]) {
            case 1:
                System.out.println("\nMeio de pagamento selecionado: PIX");
                break;
            case 2:
                System.out.println("\nMeio de pagamento selecionado: CRÉDITO");
                break;
            case 3:
                System.out.println("\nMeio de pagamento selecionado: VALE REFEIÇÃO");
                break;
            default:
                System.out.println("Código selecionado inválido");
                break;
        }

        in.close();
    }
}