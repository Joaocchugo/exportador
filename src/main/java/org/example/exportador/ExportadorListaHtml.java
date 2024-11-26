package org.example.exportador;

import java.util.List;

public class ExportadorListaHtml extends AbstractExportadorListaProduto {

    @Override
    public String abrirTabela() {
        return "<table>";
    }

    @Override
    public String fecharTabela() {
        return "</table>";
    }

    @Override
    public String abrirLinha() {
        return "<tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "<thead><tr>";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "</tr></thead>";
    }

    @Override
    public String abrirColuna(Object valor) {
        return "<td>" + valor;
    }

    @Override
    public String fecharColuna() {
        return "</td>";
    }

    @Override
    public String exportar(List<Produto> listaProdutos) {
        return null;
    }
}
