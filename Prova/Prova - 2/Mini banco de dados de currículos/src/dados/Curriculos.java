package dados;

import java.util.ArrayList;

public class Curriculos {

    private String id;
    private String nome;
    private String nota;
    private ArrayList<String> setorid = new ArrayList<>();

    private int a1 = 0;
    private int a2 = 0;
    private int a3 = 0;
    private int a4 = 0;

    private int b1 = 0;
    private int b2 = 0;
    private int b3 = 0;
    private int b4 = 0;

    private int c = 0;

    public Curriculos(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Curriculos(String id, String nome, String nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;

    }

    // A
    public void a1() {
        a1++;
    }

    public void a2() {
        a2++;
    }

    public void a3() {
        a3++;
    }

    public void a4() {
        a4++;
    }

    // B
    public void b1() {
        b1++;
    }

    public void b2() {
        b2++;
    }

    public void b3() {
        b3++;
    }

    public void b4() {
        b4++;
    }

    public void c() {
        c++;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public int getA3() {
        return a3;
    }

    public void setA3(int a3) {
        this.a3 = a3;
    }

    public int getA4() {
        return a4;
    }

    public void setA4(int a4) {
        this.a4 = a4;
    }

    public int getB3() {
        return b3;
    }

    public void setB3(int b3) {
        this.b3 = b3;
    }

    public int getB4() {
        return b4;
    }

    public void setB4(int b4) {
        this.b4 = b4;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public ArrayList<String> getSetorid() {
        return setorid;
    }

    public void setSetorid(ArrayList<String> setorid) {
        this.setorid = setorid;
    }

}
