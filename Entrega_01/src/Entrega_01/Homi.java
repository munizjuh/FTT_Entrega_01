package Entrega_01;

public class Homi extends Pessoa{

    public Homi(String nome, Sentimentos sentimentos)
    {
        super(nome, sentimentos);
    }

    @Override
    public void DizerOlaPara(Pessoa pessoa)
    {
        System.out.println(this.getNome()+": Boooom dia meu grande amor, como você tá linda hoje!!! Hidratou o cabelo, sua pele tá visosa >U<");

    }

    @Override
    public void  PerguntarComoEsta (Pessoa pessoa)
    {
        System.out.println(this.getNome()+": mas você durmiu bem hoje meu anjo de luz?");
    }
}
