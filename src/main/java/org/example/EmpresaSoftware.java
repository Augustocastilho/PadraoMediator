package org.example;

public class EmpresaSoftware implements Empresa{

    private static EmpresaSoftware instancia = new EmpresaSoftware();

    private EmpresaSoftware() {}

    public static EmpresaSoftware getInstancia() {
        return instancia;
    }

    public String pedirSite(String detalhes) {
        return "Para o site com os seguintes detalhes: " + detalhes + "\n" +
            "Serão necessárias 2 semanas.";
    }

    public String pedirAplicativo(String detalhes) {
        return "Para o aplicativo com os seguintes detalhes: " + detalhes + "\n" +
            "Serão necessárias 4 semanas.";
    }

    public String pedirSistema(String detalhes) {
        return "Para o sistema com os seguintes detalhes: " + detalhes + "\n" +
            "Serão necessárias 8 semanas.";
    }

}
