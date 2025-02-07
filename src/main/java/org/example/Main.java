package org.example;

import org.example.exportador.ExportadorListaProduto;
import org.example.exportador.Produto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var produtos = List.of(
                new Produto(1, "Notebook", "Acer Aspire A315-N2", 3500),
                new Produto(2, "Iphone 15 Pro Max", "Apple", 5200),
                new Produto(3, "Monitor 60 Polegadas", "LG", 4500)
        );
        var exportadorPadrao = ExportadorListaProduto.newInstance();
        System.out.println("Lista de Produtos em HTML\n");
        System.out.println(exportadorPadrao.exportar(produtos));

        var exportadorMark = ExportadorListaProduto.newInstance("md");
        System.out.println("Lista de Produtos em MARKDOWN\n");
        System.out.println(exportadorMark.exportar(produtos));

    }
}
