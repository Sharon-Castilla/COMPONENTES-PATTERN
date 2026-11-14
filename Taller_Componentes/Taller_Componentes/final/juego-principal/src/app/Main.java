package app;

import armas.EspadaExplorador;
import botas.BotasEnlace;
import casco.CascoHierroSellado;
import casco.CascoRunico;
import casco.ProteccionElemental;
import peto.PetoEnlace;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA FINAL: COMPONENT QUEST ===");

        // Ronda 1: Dragon Ignis
        System.out.println("\n[Ronda 1 - Dragon Ignis]");
        EspadaExplorador espada = new EspadaExplorador();
        System.out.println("Ataque con espada: " + espada.atacar() + " pts");

        // Ronda 2: Golem Sismico
        System.out.println("\n[Ronda 2 - Golem Sismico]");
        PetoEnlace peto = new PetoEnlace();
        BotasEnlace botas = new BotasEnlace();
        System.out.println("Escudo con botas puestas: " + peto.escudoActivo(botas));
        System.out.println("Escudo reforzado con botas: " + peto.escudoReforzado(botas));
        // le quitamos las botas en pleno combate
        botas = null;
        System.out.println("Escudo sin botas (null): " + peto.escudoActivo(botas));
        System.out.println("Escudo reforzado sin botas: " + peto.escudoReforzado(botas));

        // Ronda 4: Espectro Cambiante (ataca con FUEGO)
        System.out.println("\n[Ronda 4 - Espectro Cambiante]");
        ProteccionElemental hierro = new CascoHierroSellado();
        ProteccionElemental runico = new CascoRunico();
        System.out.println("Hierro vs FISICO: " + hierro.resistirAtaque("FISICO"));
        System.out.println("Hierro vs FUEGO: " + hierro.resistirAtaque("FUEGO"));
        System.out.println("Runico vs FUEGO: " + runico.resistirAtaque("FUEGO"));
    }
}
