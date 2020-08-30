package Entrega_01;
/** @author Julia **/
/**Sentimentos são como uma canção, como a Bela e a Fera**/


public enum Sentimentos {

    IRRITACAO("Eu estou irritada, EU SOU UM PERIGO"),

    FELIZ("É uma peça muuito cara, mas vale muitoooo a pena"),

    MEDE("Me dê isso ai mulé, por favor, nunca te pedi nada, eu pago"),

    NEGOCIACAO("Você pode comprar isso se eu puder adotar outro gato");

    private String descricao;
    Sentimentos(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao ()
    {
        return descricao;
    }
}
