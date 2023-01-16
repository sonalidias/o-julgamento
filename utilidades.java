public class utilidades{

    public static void print(String men){
        System.out.print(men);
    }

    public static void println(String menln){
        System.out.println(menln);
    }

    public static void limpar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

}