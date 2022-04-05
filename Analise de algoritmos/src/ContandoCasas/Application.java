package ContandoCasas;

public class Application {

    private static int x = 1;// 2 3 4 5 6
    private static int cont; // 0 0 0 0 1
    private static int var = 0;

    public static void main(String[] args){

        Application app = new Application();

        app.ContandoCasas();
        //app.ProvaReal();
    }

    // teste de otimização

    public void ContandoCasas() {

        long inicio = System.currentTimeMillis();

        // var +=x+1;//15+7=22
        while (cont < 15) {

            int prox = x + 1;
            int y = prox + 1;
            int soma = prox + y;
            if (soma > var) {
                var += x;
                x += 1;
            } else if (soma == var) {
                String qtd = Integer.toString(x);
                int qtdInt = qtd.length();
                String espaco = " ";

                System.out.println("\t\t" + espaco.repeat(9-qtdInt) + x + espaco.repeat(20+(9-qtdInt)) +  y);
                cont++;
                var += x;
                x += 1;
            } else {
                while (soma < var) {
                    soma += (y + 1);
                    y += 1;
                }
                if (soma == var) {
                    String qtd = Integer.toString(x);
                    int qtdInt = qtd.length();
                    String espaco = " ";
                    System.out.println("\t\t" + espaco.repeat(9-qtdInt)+ x + espaco.repeat(20+(9-qtdInt)) + y );
                    cont++;
                    var += x;
                    x += 1;
                } else {
                    var += x;
                    x += 1;
                }

            }

        }

        long fim = System.currentTimeMillis();
        long tempo = fim-inicio;

        System.out.println("Foram gastos "+tempo+" milissegundos");
    }

    public void ProvaReal(){
        int x = 33620223;
        int somaX=0 ;

        while(x > 0 ){
            somaX += x;
            --x;
        }
        System.out.println("\t" + somaX + "\t\t\t\t\t");

        int y = 33620225;
        int somaY=0;

        while(y <= 67239936 ){
            somaY += y;
            ++y;
        }
        System.out.println(somaY);

    }

}
