package com.jc.elementos.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T107
 */
public class Cuadrado implements Superficie{
    private int lado;
    
    public Cuadrado(){
        
    }
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public String calcularArea(){
        int area=lado*lado;
        return "El area es:"+area;
    }
}
