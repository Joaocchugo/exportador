package org.example.exportador;

import java.util.List;

public class ExportadorListaMarkdown extends AbstractExportadorListaProduto {

    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "| ";
    }

    @Override
    public String fecharLinha() {
        return " |\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "| ";
    }

    @Override
    public String fecharLinhaTitulos() {
        StringBuilder sb = new StringBuilder();
        for (String titulo : TITULOS_COLUNAS) {
            sb.append("--- | ");
        }
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public String abrirColuna(Object valor) {
        return valor + " | ";
    }

    @Override
    public String fecharColuna() {
        return "";
    }

}

