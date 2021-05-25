import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Maquina maquina = new Maquina();
        Ticket ticket = new Ticket();
        Scanner scan = new Scanner(System.in);
        int pega, pagar;

        System.out.println("pega tickt [1]para compra [0] para sair:");

        while (true) {
            pega = scan.nextInt();
            switch (pega) {
                case 1:
                    ticket = maquina.emitirTicket();
                    System.out.println("Ticket pego ID:" + ticket.getID());
                    break;

                case 0:
                    break;
            }
            if (pega == 0) {
                break;
            }

        }

        System.out.println("Pagar tick [2] consulta saldo total da maquina [1] para pagar [0] para sair:");
        while (true) {
            pagar = scan.nextInt();
            switch (pagar) {
                case 1:
                    maquina.pagar(ticket.getID());
                    break;
                case 2:
                    System.out.println("o total de saldo acumulado é " + maquina.getSaldo());
                    break;
            }
            if (pagar == 0) {
                break;
            }

        }

    }

}
