package serviços;

import java.util.ArrayList;
import java.util.Date;

import dados.*;

public class FolhaDePagamento {

    public void PagTotal(ArrayList<FuncionarioComum> listaF, ArrayList<Gerente> listaG, ArrayList<Horista> listaH) {

        double totalPag;

        double totalPagComum = 0;
        double totalPagGerente = 0;
        double totalPagHorista = 0;

        System.out.println("Data do pagamento atual desse mes:");

        Date dataPag = new Date();

        for (int i = 0; i < listaF.size(); i++) {

            totalPagComum += listaF.get(i).pagamento(dataPag);

        }

        for (int i = 0; i < listaG.size(); i++) {

            totalPagGerente += listaG.get(i).pagamento(dataPag);

        }

        for (int i = 0; i < listaH.size(); i++) {

            totalPagHorista += listaH.get(i).pagamento(dataPag);

        }

        totalPag = totalPagComum + totalPagGerente + totalPagHorista;

        System.out.println("O total pago para os Funcionarios Comuns é de:" + totalPagComum);
        System.out.println("O total pago para os Gerentes é de:" + totalPagGerente);
        System.out.println("O total pago para os Horista é de:" + totalPagHorista);

        System.out.println("\nO total pago para todos os funcionarios é de:" + totalPag);

    }

}
