package org.example;

import org.example.exportador.ExportadorListaProduto;
import org.example.exportador.Produto;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var exportador = ExportadorListaProduto.newInstance("html");
        var produtos = List.of(
                new Produto(1, "Notebook", "Acer Aspire A315-N2", 3500),
                new Produto(2, "Iphone 15 Pro Max", "Apple", 5200),
                new Produto(3, "Monitor 60 Polegadas", "LG", 4500)
        );
        System.out.println(exportador.exportar(produtos));
    }
}