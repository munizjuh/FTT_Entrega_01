package Entrega_01;
/** @author Julia **/

public class Mulé extends Pessoa
{
  public Mulé( String nome, Sentimentos sentimentos)
  {
      super(nome, sentimentos);
  }

  @Override
    public void DizerOlaPara (Pessoa pessoa)
  {
      System.out.println(this.getNome()+": Bom dia falsa!");
  }

  @Override
    public void PerguntarComoEsta (Pessoa pessoa)
  {
      System.out.println(this.getNome()+": O que você quer? ");
  }
}
