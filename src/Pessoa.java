import java.util.List;
import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String genero;



    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static List<Pessoa> gerarPessoas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************");
        System.out.println("digite uma sequencia de 5 nomes e seu respectivo genero(Feminino e Masculino): ");
        System.out.println("Exemplo (Flavia Feminino ou Romulo Masculino): ");
        System.out.println("Pessoa 1 - Nome Genero:");
        Pessoa pessoa1 = new Pessoa(scanner.next(),scanner.next());
        System.out.println("Armazenado.....");
        System.out.println("Pessoa 2 - Nome Genero:");
        Pessoa pessoa2 = new Pessoa(scanner.next(),scanner.next());
        System.out.println("Armazenado....");
        System.out.println("Pessoa 3 - Nome Genero:");
        Pessoa pessoa3 = new Pessoa(scanner.next(),scanner.next());
        System.out.println("Armazenado....");
        System.out.println("Pessoa 4 - Nome Genero:");
        Pessoa pessoa4 = new Pessoa(scanner.next(),scanner.next());
        System.out.println("Armazenado....");
        System.out.println("Pessoa 5 - Nome Genero:");
        Pessoa pessoa5 = new Pessoa(scanner.next(),scanner.next());
        System.out.println("Armazenado....");
        System.out.println("Lista Concluida");
        System.out.println("******************");
        System.out.println("******************");
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5);
    }
}
