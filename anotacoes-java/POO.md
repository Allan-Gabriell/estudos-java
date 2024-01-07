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