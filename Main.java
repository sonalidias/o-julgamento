import java.util.Scanner;

public class Main extends Jogador{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Jogador jogador = new Jogador();
        String decisao;
        limpar();

        println("Oi, você acabou de morrer...");
        println("Neste momento iremos avaliar se você foi uma boa pessoa na Terra. Iremos julgar o seu destino!");
        println("Informe o seu nome: ");
        jogador.nome = scan.nextLine();
        limpar();
        println( jogador.nome + ", nós iremos avaliar as primeiras etapas da sua vida.");
        println("\033[3mFLASHBACK da sua infância...\033[0m");
        println("No dia de brincar na escola, todos os seus amigos levaram brinquedos, menos você.");
        println("Você foi até seu amigo e pediu um brinquedo emprestado, ele recusou.");
        println("Depois de um tempo ele saiu de sala. Você com raiva foi até o brinquedo. Deseja quebrar?");
        println("Sim ou Não?");
        decisao = scan.nextLine();
        if(decisao.equals("Sim")){
            jogador.pontoMald();
        }else {
            jogador.pontoBond();
        }



        println("Você entra em uma loja de doces, e vê um chocolate. Deseja pegá-lo?");
        //if/else sim ou nao. sim = aumenta maldade/ nao = aumenta bondade
        //adicionar pre ado, adolescente e adulto
        


        //print("");

        //pedir o nick
        //plot da historinha: ser um julgamento a partir do nivel de maldade/bondade, com dois finais em que se for maior que 3 vai pro inferno, e menor que 3 vai pro céu
        
        //importar scanner - foi
        //criar obj jogador foi
        //extends classe jogador foi
        //string da decisao - foi
        //if e else
        //nao esquecer de no final de usar o scanner, fechar ele com: scan.close();
    }

}
