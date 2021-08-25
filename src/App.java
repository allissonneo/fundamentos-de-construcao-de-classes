import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Programador dev1 = new Programador();
        dev1.name = "Joao";
        dev1.position = "Júnior";
        dev1.salario = 2500;

        Programador dev2 = new Programador();
        dev2.name = "Markinhos";
        dev2.position = "Pleno";
        dev2.salario = 5000;

        Programador dev3 = new Programador();
        dev3.name = "Zezão";
        dev3.position = "Sênior";
        dev3.salario = 15000;

        Cachorro cao1 = new Cachorro();
        cao1.name = "Belinha";
        cao1.raca = "SRD";
        cao1.porte = "Pequeno";
        cao1.sexo = "fêmea";
        cao1.cor = "Caramelo";
        cao1.peso = 15.2;
        cao1.violento = true;
        cao1.fofura = 100;
        cao1.felicidade = 100;

        Cachorro cao2 = new Cachorro();
        cao2.name = "Bob";
        cao2.raca = "SRD";
        cao2.porte = "Grande";
        cao2.sexo = "Macho";
        cao2.cor = "Branco";
        cao2.peso = 25.2;
        cao2.violento = false;
        cao2.fofura = 100;
        cao2.felicidade = 100;


        Scanner entrada = new Scanner(System.in);
        System.out.println("1- Canil\t\t2- Programador\t\t 3- Sair");
        int num = 0;


        while (num != 3)
        {
            num = entrada.nextInt();
            switch (num) {
                case 1:
                cao1.comer(true);
                cao1.brincar();
                cao2.comer(true);
                cao2.brincar();
                System.out.println("1- Canil\t\t2- Programador\t\t 3- Sair");
                    break;
                case 2:
                    dev1.fazerCommit();
                    dev2.fazerCommit();
                    dev3.fazerCommit();
                    System.out.println("1- Canil\t\t2- Programador\t\t 3- Sair");
                    break;
                    case 3:
                    break;
                default:
                    System.out.println("Numero inválido");
                    break;
            }

        }
        entrada.close();
    }
}
