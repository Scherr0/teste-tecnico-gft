
L
public class Main {

    static class Contato {
        String nome;
        String telefone;

        Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }

        String exibir() {
            return "Nome: " + nome + ", Telefone: " + telefone;
        }

    }

    public static void main(String[] args) {

        Contato c1 = new Contato("Maria", "(11) 94509-9452");
        Contato c2 = new Contato("João", "(11) 99999-0000");

        System.out.println(c1.exibir());
        System.out.println(c2.exibir());


    }
}