/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio1;

/**
 *
 * @author aluno
 */
public class Ingresso {
    private float valor;
    
    public Ingresso(float valor){
        this.valor = valor;
       
    }
    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    
    public String toString() {
        return "Ingresso é :" + valor ;
    }
    
}
