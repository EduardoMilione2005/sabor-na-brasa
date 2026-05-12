package com.sabornabrasa;

import com.sabornabrasa.director.HamburguerDirector;
import com.sabornabrasa.model.Hamburguer;

public class Main {

    public static void main(String[] args) {

        HamburguerDirector director = new HamburguerDirector();

        Hamburguer tradicional = director.criarHamburguerTradicional();
        Hamburguer vegano = director.criarHamburguerVegano();

        System.out.println("=== HAMBÚRGUER TRADICIONAL ===");
        System.out.println(tradicional);

        System.out.println("\n=== HAMBÚRGUER VEGANO ===");
        System.out.println(vegano);
    }
}