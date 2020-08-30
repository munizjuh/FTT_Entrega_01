
package Entrega_01;
/** @author Julia **/

public class Pessoa {

    private String nome;
    public String getNome () {
        return nome;
    }
    public void SetNome (String nome)
    {
        this.nome = nome;

    }

    private Sentimentos sentimentos;
    public Sentimentos getsentimentos()
    {
        return sentimentos;
    }

    public void setSentimentos(Sentimentos sentimentos){
        this.sentimentos= sentimentos;
    }

    public Pessoa (String nome, Sentimentos sentimentos)
    {
        this.SetNome(nome);
        this.setSentimentos(sentimentos);
    }

    public void DizerOlaPara (Pessoa pessoa)
    {
        System.out.println(this.getNome() + "Bom dia");
    }

    public void PerguntarComoEsta (Pessoa pessoa){
    System.out.println(this.getNome() + "Tudo bom?");
    }

    public void DizerSentimento(){
        System.out.println(this.getNome()+": "+ this.getsentimentos().getDescricao());
    }
}


