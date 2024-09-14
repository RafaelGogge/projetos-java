package Iphone;

import Iphone.funcionalidades.AparelhoTelefonico;

public class Iphone {
    public static void main(String[] args) throws Exception {

        AparelhoTelefonico meuAparelho = new AparelhoTelefonico();
        meuAparelho.iniciarChamada();
        meuAparelho.atenderChamada();
    }
}
