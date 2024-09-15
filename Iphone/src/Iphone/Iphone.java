package Iphone;

import Iphone.funcionalidades.AparelhoTelefonico;
import Iphone.funcionalidades.NavegadorInternet;
//import Iphone.funcionalidades.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {

        AparelhoTelefonico meuAparelho = new AparelhoTelefonico();
        // ReprodutorMusical meuReprodutorMusical = new ReprodutorMusical();
        NavegadorInternet meuNavegador = new NavegadorInternet();

        meuAparelho.realizarChamada();
        // meuAparelho.atenderChamada();
        // meuReprodutorMusical.selecionarMusica();
        //meuNavegador.NavegadorWeb();
    }
}
