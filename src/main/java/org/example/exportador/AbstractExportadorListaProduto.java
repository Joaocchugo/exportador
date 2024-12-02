package org.example.exportador;

import java.util.List;

public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto{
    protected static final List<String> TITULOS_COLUNAS =
            List.of("ID", "Descrição", "Modelo", "Preço");

    @Override
    public String exportar(List<Produto> produtos) {
        var builder = new StringBuilder();
        builder.append(abrirTabela());

        builder.append(abrirLinhaTitulos());
        builder.append(abrirLinha());

        TITULOS_COLUNAS.stream().map(titulo -> abrirColuna(titulo) + fecharColuna())
                .forEach(coluna -> builder.append(coluna));

        builder.append(fecharLinha());
        builder.append(fecharLinhaTitulos());

        for (Produto prod : produtos){
            builder.append(abrirLinha());
            builder.append(abrirColuna(prod.getId())).append(fecharColuna());
            builder.append(abrirColuna(prod.getDescricao())).append(fecharColuna());
            builder.append(abrirColuna(prod.getModelo())).append(fecharColuna());
            builder.append(abrirColuna(prod.getPreco())).append(fecharColuna());
            builder.append(fecharLinha());
        }

        builder.append(fecharTabela());
        return builder.toString();
    }



}
