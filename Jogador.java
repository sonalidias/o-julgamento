public class Jogador extends utilidades {

        String nome;
        static double maldade;
        double bondade;
    
        public void darNome(){
            println("Seu nome agora é " + nome);
        }
    
        public void pontoMald(){
            maldade += 1;
        }
    
        public void pontoBond(){
            bondade = 0.5;
            bondade = maldade - bondade;
        }

    }


