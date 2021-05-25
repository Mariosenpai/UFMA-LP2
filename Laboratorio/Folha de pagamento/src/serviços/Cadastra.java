package serviços;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import dados.FuncionarioComum;
import dados.Gerente;
import dados.Horista;

public class Cadastra {

    public void cadastrarComum(ArrayList<FuncionarioComum> listaF) {

        Scanner scan = new Scanner(System.in);

        String nome;
        Double salario;

        int dia, mes, ano;

        System.out.println("***Cadastra funcionario Comum***");
        System.out.println("Nome:");
        scan.next();
        nome = scan.nextLine();
        System.out.println("Salario:");
        salario = scan.nextDouble();

        System.out.println("Data de aniversario");
        System.out.println("Dia:");
        dia = scan.nextInt();
        System.out.println("Mes:");
        mes = scan.nextInt();
        System.out.println("Ano:");
        ano = scan.nextInt();

        Date data = new Date(ano, mes, dia);

        FuncionarioComum f = new FuncionarioComum(salario, nome, data);

        listaF.add(f);

        System.out.println("Cadastro Concluido Com Sucesso");
    }

    public void cadastraGerente(ArrayList<Gerente> listaG) {

        Scanner scan = new Scanner(System.in);

        String nome;
        double salario;
        double bonus;

        int dia, mes, ano;

        System.out.println("***Cadastra Gerente***");
        System.out.println("Nome:");
        scan.next();
        nome = scan.nextLine();
        System.out.println("Salario:");
        salario = scan.nextDouble();
        System.out.println("Bonus:");
        bonus = scan.nextDouble();

        System.out.println("Data de aniversario");
        System.out.println("Dia:");
        dia = scan.nextInt();
        System.out.println("Mes:");
        mes = scan.nextInt();
        System.out.println("Ano:");
        ano = scan.nextInt();

        Date data = new Date(ano, mes, dia);

        Gerente g = new Gerente(salario, nome, data, bonus);

        listaG.add(g);

        System.out.println("Cadastro Concluido Com Sucesso");

    }

    public void cadastraHorista(ArrayList<Horista> listaH) {

        Scanner scan = new Scanner(System.in);

        String nome;
        double salario;
        int horas;

        int dia, mes, ano;

        System.out.println("***Cadastra Horista***");
        System.out.println("Nome:");
        scan.next();
        nome = scan.nextLine();
        System.out.println("Salario:");
        salario = scan.nextDouble();
        System.out.println("Bonus:");
        horas = scan.nextInt();

        System.out.println("Data de aniversario");
        System.out.println("Dia:");
        dia = scan.nextInt();
        System.out.println("Mes:");
        mes = scan.nextInt();
        System.out.println("Ano:");
        ano = scan.nextInt();

        Date data = new Date(ano, mes, dia);

        Horista h = new Horista(salario, nome, data, horas);

        listaH.add(h);

        System.out.println("Cadastro Concluido Com Sucesso");

    }

}
