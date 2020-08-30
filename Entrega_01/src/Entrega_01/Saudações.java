package Entrega_01;
/** @author Julia **/


public class Saudações {

    public static void main(String[] args)
    {
        Homi namorado = new Homi("namorado", Sentimentos.FELIZ);
        Mulé namorada = new Mulé("namorada", Sentimentos.IRRITACAO);
        namorado.DizerOlaPara(namorada);
        namorada.DizerOlaPara(namorado);
        namorado.PerguntarComoEsta(namorada);
        namorada.DizerSentimento();
        namorada.PerguntarComoEsta(namorado);
        namorado.DizerSentimento();
        namorado.setSentimentos(Sentimentos.MEDE);
        namorada.setSentimentos(Sentimentos.NEGOCIACAO);
        namorado.DizerSentimento();
        namorada.DizerSentimento();


    }
}
