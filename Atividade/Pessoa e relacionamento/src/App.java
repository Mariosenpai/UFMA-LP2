import entidades.Fornecedor;
import entidades.Pessoa;
import entidades.empregados.Administrador;
import entidades.empregados.Empregado;
import entidades.empregados.Operario;
import entidades.empregados.Vendedor;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa p0 = new Pessoa();
        Fornecedor p1 = new Fornecedor("mario", "rua1", "2222222-11", 1000, 500);
        Empregado p2 = new Empregado("mario", "rua2", "2222222-11", 27, 1100, 0.1);
        Administrador p3 = new Administrador("mario", "rua3", "12222223-01", 38, 5103.20, 0.1, 1000);
        Operario p4 = new Operario("mario", "rua4", "111223-31", 12, 1500, 0.1, 2000, 0.4);
        Vendedor p5 = new Vendedor("mario", "rua5", "111134-44", 90, 2000, 0.1, 1000, 0.3);

        System.out.println(p0.getNome());
        System.out.println(p1.obterSaldo());
        System.out.println(p2.calcularSalario());
        System.out.println(p3.calcularSalario());
        System.out.println(p4.calcularSalario());
        System.out.println(p5.calcularSalario());

    }
}
