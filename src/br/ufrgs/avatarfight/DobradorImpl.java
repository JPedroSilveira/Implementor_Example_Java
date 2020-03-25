package br.ufrgs.avatarfight;

public abstract class DobradorImpl implements Dobrador {
    protected String nome;

    protected float dano;

    protected float defesa;

    protected float vida;

    protected float chanceStun;

    protected boolean estaEmStun;

    public DobradorImpl(String nome) {
        this.nome = nome;
    }

    @Override
    public void sofrerDano(float dano) {
        this.vida -= dano;
    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }

    @Override
    public boolean getEstaEmStun() {
        return this.estaEmStun;
    }

    @Override
    public void setEstaEmStun(boolean estaEmStun) {
        this.estaEmStun = estaEmStun;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public float getChanceStun() {
        return chanceStun;
    }
}
