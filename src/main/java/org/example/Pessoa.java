package org.example;

public abstract class Pessoa {

    public String pedirSite(String detalhes) {
        return Site.getInstancia().pedirSite(detalhes);
    }

    public String pedirAplicativo(String detalhes) {
        return Site.getInstancia().pedirAplicativo(detalhes);
    }

    public String pedirSistema(String detalhes) {
        return Site.getInstancia().pedirSistema(detalhes);
    }

}
