import java.util.*;
import java.util.stream.Collectors;

public class Stream  {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = Pessoa.gerarPessoas();

        System.out.println("******** Lista com Genero Feminino **********");
        List<Pessoa> generoFeminino = pessoas.stream()
                    .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                    .collect(Collectors.toList());


        generoFeminino.forEach(pessoa -> System.out.println(pessoa.getNome()));
    }

}
