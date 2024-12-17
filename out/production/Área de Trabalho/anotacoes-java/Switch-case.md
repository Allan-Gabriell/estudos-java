# Estrutura Switch-case
- Quanfo se tem várias opções a serem tratadas com base no valor de uma variável, ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.

# Exemplo
        import java.util.Locale;
        import java.util.Scanner;

        public class telefonia {
            public static void main(String[] args) {
                Locale.setDefault(Locale.US);
                leia = new Scanner(System.in);

                int x = leia.nextInt();
                String dia;

                swith(x){
                    case 1:
                        dia = "Domingo";
                        break;
                    case 2:
                        dia = "Segunda";
                        break;
                    case 3:
                        dia = "terça";
                        break;
                    case 4: 
                        dia = "Quarta";
                        break;
                    case 5:
                        dia = "quinta";
                        break;
                    case 6:
                        dia = "sexta";
                        break;
                    case 7:
                        dia = "Sabado";
                        break;
                    case 8:
                        dia = "valor inválido";
                        break;
                }

                System.out.printf("Dia da semana:", dia);


                leia.close();
            }
        }
