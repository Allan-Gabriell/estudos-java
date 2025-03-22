# Operadores Bitwise
- Bitwise Operation, ou Operação Bit a Bit, é um conceito fundamental na programação de computadores. Ele envolve a manipulação de bits individuais em um nível mais baixo do que as operações tradicionais, como adição e subtração.

## Operadores

        & --> operação "E" bit a bit;
        | --> operação "ou" bit a bit;
        ^ --> operaçãoi "Ou-exclusivo" bit a bit;

## EXEMPLO

        public static void mnain(String[] args){
            Scanner leia = new Scanner(System.in);

            int mask = 0b100000; 0b indica que é um número binário
            int n = leia.nextInt();

            if((n & mask) != 0){
                System.out.println("6th bit is true!");
            } else {
                System.out.println("6th bit is false!");
            }
        }