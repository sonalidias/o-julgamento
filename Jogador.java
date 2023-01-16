public class Jogador extends utilidades {

        String nome;
        static double maldade = 0;
        double bondade;
    
        public static void darNome(String nome){
            println("Seu nome agora é " + nome);
        }
    
        public static void pontoMald(double maldade){
            maldade = 1;
        }
    
        public static void pontoBond(double bondade){
            bondade = 0.5;
            bondade = maldade - bondade;
        }

    }

