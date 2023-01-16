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
            println("Você foi malvado em sua infância, achava que fosse um bom menino.");
        }else {
            jogador.pontoBond();
            println("Você foi um bom menino em sua infância!");

        }

        
        println("\033[3mFLASHBACK da sua pré-adolescência...\033[0m");
        println("Você entra em uma loja de doces, e vê um chocolate. Deseja pegá-lo?");
        println("Sim ou Não?");
        decisao = scan.nextLine();
        if(decisao.equals("Sim")){
            jogador.pontoMald();
            println("Na pré-adolescencia todos são difíceis...");
        }else {
            jogador.pontoBond();
            println("Uma boa criação faz milagres");

           
        }limpar();

        println("\033[3mFLASHBACK da sua adolescência...\033[0m");
        println("Você discute com sua namorada e avança em cima dela.");
        println("você levanta a mão, você vai bater nela?");
        println("Sim ou Não?");
        decisao = scan.nextLine();
        if(decisao.equals("Sim")){
            jogador.pontoMald();
            println("Que horror!! Nem o inferno merece você");
        }else{
            jogador.pontoBond();
            println("Ainda bem que você sabe como tratar uma dama!");

            
        }limpar();
      
        println("\033[3mFLASHBACK da sua vida adulta...\033[0m");
        println("Você na sua vida adulta teve um incrivel sucesso, e hoje em dia você tem uma boa condição financeira");
        println("Uma ONG de cachorrinhos e gatinhos abandonados pede ajuda com doações pois eles ja não tinham o que comer. Você vai ajudar? ");
        println("Sim ou Não");
        decisao = scan.nextLine();
        if(decisao.equals("Sim")){
            jogador.pontoBond();
            println("Você é uma pessoa incrivel e tem um bom coração!");
        } else{
            jogador.pontoMald();
            println("Você é uma pessima pessoa!");
            }
            scan.close();

            if(maldade > 3){
                println("Você foi mandado para o inferno");
            }else {
                println("Você foi enviado ao céu" );
            }

        }
    }
