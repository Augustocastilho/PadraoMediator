package org.example;

public class Site {

    private static Site instancia = new Site();

    private Site() {}

    public static Site getInstancia() {
        return instancia;
    }

    public String pedirSite(String detalhes) {
        return "Obrigado pela preferência.\n" +
            "Resposta da empresa: " +
            EmpresaSoftware.getInstancia().pedirSite(detalhes);
    }

    public String pedirAplicativo(String detalhes) {
        return "Obrigado pela preferência.\n" +
            "Resposta da empresa: " +
            EmpresaSoftware.getInstancia().pedirAplicativo(detalhes);
    }

    public String pedirSistema(String detalhes) {
        return "Obrigado pela preferência.\n" +
            "Resposta da empresa: " +
            EmpresaSoftware.getInstancia().pedirSistema(detalhes);
    }

}
