/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad3;

/**
 *
 * @author alexpardox
 */
public class Card {
    // Atributos de la carta de poker
    private String palo;   // "Tréboles", "Corazones", "Picas" o "Diamantes"
    private String color;  // "Rojo" o "Negro"
    private String valor;  // "2"–"10", "A", "J", "Q" o "K"

    // Constructor que recibe palo, color y valor
    public Card(String palo, String color, String valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    public String obtenerPalo() {
        return palo;
    }

    public String obtenerColor() {
        return color;
    }

    public String obtenerValor() {
        return valor;
    }

    // Sobrescribimos toString para imprimir en el formato "{Palo},{Color},{Valor}"
    @Override
    public String toString() {
        return palo + "," + color + "," + valor;
    }
}
