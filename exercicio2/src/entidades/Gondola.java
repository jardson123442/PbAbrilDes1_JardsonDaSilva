package entidades;




public class Gondola  {
    private int numGondolas;
    private Pessoa assento1;
    private Pessoa assento2;
    private Gondola[] gondolas = new Gondola[numGondolas];

    public Gondola( Pessoa assento1, Pessoa assento2) {
        this.assento1 = assento1;
        this.assento2 = assento2;
    }

    public Gondola( Pessoa assento1) {
        this.assento1 = assento1;
    }

    public void lugar(int indice, Pessoa assento1, Pessoa assento2) {
        gondolas[indice] = new Gondola(assento1, assento2);
    }

    public int getNumGondolas() {
        return numGondolas;
    }

    public void setNumGondolas(int numGondolas) {
        this.numGondolas = numGondolas;
    }

    public Pessoa getAssento1() {
        return assento1;
    }

    public void setAssento1(Pessoa assento1) {
        this.assento1 = assento1;
    }

    public Pessoa getAssento2() {
        return assento2;
    }

    public void setAssento2(Pessoa assento2) {
        this.assento2 = assento2;
    }

    public Gondola[] getGondolas() {
        return gondolas;
    }

    public void setGondolas(Gondola[] gondolas) {
        this.gondolas = gondolas;
    }
}
