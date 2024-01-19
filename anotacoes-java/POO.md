# Programação orientada a objetos - POO
## Classe
- É um tipo estruturado que pode conter(membros):
    * Atributos (dados/campos)
    * Métodos (funções/operações)
- A classe também pode prover muitos outros recursos, tais como:
    * Construtores
    * Sobrecarga
    * Encapsulamento
    * Herança
    * Polimorfismo
- Exemplos
    * Entidades: Produtos, Cliente, Triângulo
    * Serviços: ProdutoService, ClienteService, EmailService StorageService
    * Controladores: ProdutoController, ClienteController
    * Utilitários: Calculadora, Compactador
    * Outros (views, repositórios, gerenciadores, etc.)
## Sintaxe

        package entities;
        
        public class Triangle {
            public double a;
            public double b;
            public double c;
        }

## Instanciação
- Alocação dinâmica de memória com o comando "New"

        x = new Triangle()

## Criando um método para obtermos os benefícios de reaproveitamento e delegação
- Com o uso de CLASSE, agora nós temos uma variável composta do tipo "Triangle" para representar cada triângulo:

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

Agora vamos melhorar nossa CLASSE, acrescentando nela um MÉTODO para calcular a área
## Object e toString
- Toda classe em java é uma subclasse da classe Object;
- Object possui os seguintes métodos:
    * getClass - retorna o tipo do objeto;
    * equals - compara se o objeto é igual a outro;
    * hashCode - retorna um código hash do objeto;
    * toString - converte o objeto para string;
## Membros estáticos
- Também chamamos membros de classe;
    * Em oposição a membros de instância;
- São membros que fazer sentido independentemente de objetos. Nãi precisam de objeto para serem chamados. São chamados a partir do próprio nome da classe;
- Aplicação comuns: 
    * Classes utilitárias;   -> exemplo: Math.sqrt()
    * Declaração de constantes;
- Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada;

        Triangle x, y; -> Neste caso X e Y são instâncias
        x = new Triangle();
        y = new Triangle();
## Construtores
- Construtor é uma operação especial da classe, que executa no momento da instanciação do objeto;
- É o cara que entra em ação na hora da instanciação;
- Uso comuns: 
    * Iniciar valores dos atributos;
    * Permitir ou obrigar que o objeto receba dados / depencências no momento de sua instanciação (Injeção de dependência);
- Se o construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
        
        Product p = new Product();

- É possível especificar masi de um construtor na mesma classe (Sobrecarga);
## This
- A palavra "this" faz uma referência ao proprío objeto;
- Usos comuns: 
    * Diferenciar atributos de variáveis locais;
    * Passar o próprio objeto como argumento na chamada de um método ou construtor;
## Sobrecarga
- É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetro;
- Disponibilizar mais de uma versão de uma operação;
## Encapsulamento
- É o princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente;
- Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso;
- REGRA GERAL BÁSICA:
    * Um objeto NÃO deve expor nenhum atributo(moodificador de acesso PRIVATE);
    * Os atributos devem ser acessados por meio de métodos get (Acesso) e set (Alteração);
## Modificadores de acesso
- Private: o membro só pode ser acessado na própria classe
- (nada): o membro só pode ser acessado nas classes do mesmo pacote;

        String name;
        double price;
        int quantity;

- Protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes;
- Public: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está);
## Tipos referência vs tipos valor
- Classes são tipos referência
    * Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim "tentáculos" (ponteiros) para caixas;
- Valor "null"
    * Tipos referência aceitam o valor "null", que indica que a variável aponta para ninguém;
- Tipos primitivos são tipos valor
    * Em java, tipos primitivos são tipos valor. Tipos valor são caixas e não ponteiros;
- Valores padrão
    * Quando alocamos (new) qualquer tipo estruturado (classe ou array) são atribuídos valores padrão aos seus elementos:
        * números -> 0;
        * boolean -> false;
        * char -> caractere código 0;
        * objeto -> null;
## Desalocação de memória - garbage collector e escopo local
- Garbage collectos
    * É um processo que automatiza o gerenciamento de memória de um programa em execução;
    * O garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap), desalocando aqueles que não estão mais sendo utilizados;
- Escopo local

        void method1(){
            int x = 10;
            if(x > 0){
                int y = 20;
            }
            System.ou.println(x);
        }

        - Quando sairmos do escopo do if a variável y será desalocada e quando sair do method1 todas as variáveis do method1 serão desalocadas;
## Vetores
- Em programação, "vetor" é o nome dado a arranjos unidimensionais;
- Arrano (array) é uma estrutura de dados:
    * Homogênea (dados do mesmo tipo);
    * Ordenada (elementos acessados por meio de posições);
    * Alocada de uma vez spo, em um bloco contíguo de memória;
- Vantagens:
    * Acesso imediato aos elementos pela sua posição;
- Desvantagens:
    * Tamanho fixo;
    * Dificuldade para se realizar inserções e deleções;
## Boxing, Unboxing e Wrapper classes
- Boxing
    * É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível;
- Uboxing 
    * É o processo de conversão de um tipo referência para um objeto tipo valor compatível;
- Wrapper classes
    * São equivalentes aos tipos primitivos;
    * Naturalmente aceita o valor null
    * Para ser feito o boxing e unboxing de forma natural na linguagem;
    * Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!);
        * Pois tipos referências (classes) aceitam valor null e usufruem dos recursos OO - orientação a objetos;
###

        byte --> Byte;
        short --> Short;
        int --> Intege;
        long --> Long;
        float --> Float;
        double --> Double;
        boolean --> Boolean;
        char --> Character;

## Laço for each
- Sintaxe opcional e simplificada para percorrer coleções
- Sintaxe: 

        for (tipo apelido: coleção){
            <comando 1>
            <comando 2>
        }

## Listas
- Lista é uma estrutura de dados
    * Homogênea (dados do mesmo tipo);
    * Ordenada (elementos acessados por meio de posições);
    * Inicia vazia, e seus elementos são alocados sob demanda;
    * Cada elemento ocupam um "nó" (ou nodo) da lista;
- Tipo(interface): List;
- Classes que implementam: ArrayList, LinkedList, etc.
- Vantagens: 
    * Tamanho variável;
    * Facilidade para se realizar iserções e delegações;
- Desvantagens: 
    * Acesso sequencial aos elementos;
###### Demo
- Tamanho da lista: size();
- Inserir elemento na lista: add(obj), add(int, obj);
- Remover elementos da lista: remove(obj), remove(int), removeIf(predicate);
- Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj);
- Filtrar lista com base em predicado: List"<"Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
- Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);
## Matrizes
- Em progração, "matriz" é o nome dado a arranjos bidimensionais;
    * Atenção: "Vetor de vetores";
- Arranjo (array) é uma estrutura de dados:
    * Homogênea (dados do mesmo tipo);
    * Ordenada (elementos acessados por meio de posições);
    * Alocada de uma vez só, em um bloco contíguo de memória;
- Vantagens: 
    * Acesso imediato aos elementos pela sua posição;
- Desvantagens: 
    * Tamanho fixo;
    * Dificuldade para se realizar inserções e deleções;
## Trabalhando com datas
- Conceitos importantes: 
- Data-hora local:
    * ano-mês-dia-hora sem fuso horário;
    * hora é opcional;
    * Quando o momento exato não interessa a pessoas de outro fuso horário.
    * Uso comum: sistemas de região única, excel;
- Data-hora global: 
    * ano-mês-dia-hora com fuso horário;
    * Quando o momento exato interessa a pessoas de outro fuso horário;
    * Uso comum: sistemas multi-região, web;
- Duração:
    * tempor decorrido entre duas datas-horas;
## Timezone (fuso horário)
- GMT - Greenwich Mean Time
    * Horário de Londres;
    * Horário do padrão UTC - Coordinated Universal Time;
    * Também chamamos de "Z" time, ou Zulu time;
- Outros fusos horários são relativos ao GMT/UTC:
    * São Paulo: GMT-3;
    * Manaus: GMT-4;
    * Portugal: GMT+1;
- Muitas linguagens/ tecnologias usam nomes para as timezones:
    * "US/Pacific";
    * "America/Sao_Paulo";
    * etc.;
## Padrão ISO 8601
- Mostra como você deve representar datas e horas na forma de texto;
- Data-hora local:
    2022-07-21;
    2022-07-21T14:52;
    2022-07-21T14:52:09;
- Data-hora global:
    2022-07-21T14:52:09Z;
    2022-07-21T14:52:09.254935Z;
## Operações importantes com data-hora
- Instanciação: 
    * (agora) -> data-hora;
    * Texto ISO 8601 -> data-hora;
    * Texto formato customizado -> data-hora;
    * dia, mês, ano, horário -> data-hora local;
- Formatação:
    * data-hora -> texto ISO 8601;
    * data-hora -> texto formato customizado;
- Obter dados de uma data-hora local:
    * data-hora local -> dia, mês, ano, horário;
- Converter data-hora global para local:
    * data-hora global, timezone(sistema local) -> data-hora local;
- Cálculos com data hora:
    * data-hora +/- tempo -> data-hora;
    * data-hora 1, data-hora 2 -> duração;
## Principais tipos java (versão 8+)
- data-hora local:
    * LocalDate;
    * LocalDateTime;
- data-hora global:
    * Instant;
- duração:
    * Duration;
- outros:
    * Zoneld;
    * ChronoUnit;
## Enumeração
- É um tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas;
- Palavra chave em java: enum;
- Vantagem: melhor semântica, código mais legível e auxiliado pelo compilador;
- Conversão de String para Enum

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus 0s2 = OrderStatus.valueOf("DELIVERED");

## Design
- Em um sistema orientado a objetos, de modo geral "tudo" é objeto;
- Por questões de design tais como organização, flexibilidade, reuso, delegação, etc..., há várias catégorias de classes:
    * views;
    * Controllers;
    * Entities;
    * Services;
    * Repositories;
## Composição
- É um tipo de associação que permite que um objeto contenha outro;
- Relação "tem-um" ou "tem-vários";
- Vantagens: 
    - Organização: divisão de responsabilidades;
    - Coesão;
    - Flexibilidade;
    - Reuso;
- Nota: embora o símbolo UML para composição(todo-parte) seja o diamante preto, neste contexto estamos chamando de composição qualquer associação tipo "tem-um" e "tem-vários";
## Herança
- É um tipo de associação que permite que uma classe herde TODOS os dados e comportamentos de outra;
- Vantagens:
    * Reuso;
    * Polimorfismo;
- Sintaxe:

        class A extends B;

## Modificador de acesso protectd
## Upcasting e Downcasting
- Upcasting
    - Casting da subclasse para a superclasse;
    - Uso comum: polimorfismo;
_ Downcasting
    - Casting da superclasse para subclasse;
    - Palavra instanceof;
    - Uso comum: métodos que recebem parâmetros genéricos (ex. Equals);
## Sobreposição ou sobrescrita
- É a implementação de um método de uma superclasse na subclasse;
- É fortemente recomendável usar a anotação @Override em um método sobrescrito;
    - Facilita a leitura e compreensão do código;
    - Avisamos ao compilador(boa prática);
## Palavra Super
- É possível chamar a implementação da superclasse usando a palavra Super;
        
        Exemplo:
        Suponha que, na classe BusinessAccount, a regra para saque seja realizar o saque normalmente da superclasse descontar mais 2.0;

        @Override
        public void withdraw(double amount){
            super.withdraw(amount);
            balance -= 2.0;
        }
## Classes e métodos final
- A palavra chave: final;
- Classe: evita que a classe seja herdada;

        public final class SavingsAccount{}

- Método: evita que o método sob seja sobreposto;
- Pra quê?
    - Segurança: dependendo das regras de negócio, às vezes é desejável garantir que uma classe não seja herdada, ou que um método não seja sobreposto;
        * Geralmente convém acrescentar final em métodos sobrepostos, pois sobreposições múltiplas podem ser uma porta de entrada para inconsistências;
    - Performance: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução;
        * Exemplo clássico: String;
## Introdução ao polimorfismo
- Pilares da POO = Encapsulamento, herança e polimorfismo;
- Em programação Orientada a Objetos, polimorfismos é recurso que permite que variáveis de um mesmo tipo mais genérico possam apontar para onjetos de tipos específicos diferentes, tendo assim comportamentos diferentes conforme cada tipo específico.

        Account x = new Account(1020, "Alex");
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

- A associação do tipo específico com o tipo genérico é feita em tempo de execução(upcasting);
- O compilador não sabe para qual tipo específico a chamada do método Withdraw está sendo feita(ele só sabe que são duas variáveis do tipo Account);
## Classes abstratas
- São classes que não podem ser instanciadas; 
- É uma forma de garantir herança total: somente subclasses não abstratas podem ser instanciadas, mas nunca a superclasse abstrata;
- Vantagens: 
    - Reuso;
    - Polimorfismo: a superclasse classe genérica nos permite tratar de forma fácil e uniforme todos os tipos de conta, inclusive com polimorfismo se for o caso (como fizemos nos últimos exercícios). Por exemplo, se você colocar todos os tipos de conta em uma mesma coleção;
## Métodos abstratos 
- São métodos que não possuem implementação;
- Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação;
- Se uma classe possuir pelo menos um método abstrato, então esta classe também é abstrata;
- Notação UML: itálico;