/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static main.Main.resistor1;
import static main.Main.resistor2;
import static main.Main.tensaoEntrada;
import static main.Main.tensaoSaida;

/**
 *
 * @author Wesley
 */
public class Calc {
    public static void calcular(){
        
        if (((tensaoEntrada.getText().isEmpty()) || (tensaoEntrada.getText() == null)) && ((tensaoSaida.getText().isEmpty()) || (tensaoSaida.getText() == null))) {
            JOptionPane.showMessageDialog(null, "É necessário colocar a tensão de entrada ou de saída", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if ((tensaoEntrada.getText().isEmpty()) || (tensaoEntrada.getText() == null)) {

                float O = Float.parseFloat(tensaoSaida.getText().replaceAll(",", "."));
                if (((resistor1.getText().isEmpty()) || (resistor1.getText() == null)) || ((resistor2.getText().isEmpty()) || (resistor2.getText() == null))) {
                    JOptionPane.showMessageDialog(null, "É necessário colocar os dois valores dos resistores", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    float R1 = Float.parseFloat(resistor1.getText());
                    float R2 = Float.parseFloat(resistor2.getText());
                    float I = O * ((R1 + R2) / R2);
                    DecimalFormat df = new DecimalFormat("#0.00");
                    tensaoEntrada.setText(df.format(I));
                }
            } else if ((tensaoSaida.getText().isEmpty()) || (tensaoSaida.getText() == null)) {
                float I = Float.parseFloat(tensaoEntrada.getText().replaceAll(",", "."));
                if (((resistor1.getText().isEmpty()) || (resistor1.getText() == null)) || ((resistor2.getText().isEmpty()) || (resistor2.getText() == null))) {
                    JOptionPane.showMessageDialog(null, "É necessário colocar os dois valores dos resisitores", "Erro", JOptionPane.ERROR_MESSAGE);
                } else {
                    float R1 = Float.parseFloat(resistor1.getText());
                    float R2 = Float.parseFloat(resistor2.getText());
                    float O = I * (R2 / (R1 + R2));
                    DecimalFormat df = new DecimalFormat("#0.00");
                    tensaoSaida.setText(df.format(O));
                }
            } else {
                if ((resistor1.getText().isEmpty()) || (resistor1.getText() == null)) {
                    float O = Float.parseFloat(tensaoSaida.getText().replaceAll(",", "."));
                    float I = Float.parseFloat(tensaoEntrada.getText().replaceAll(",", "."));
                    float R2 = Float.parseFloat(resistor2.getText());
                    float R1 = (I * (R2 / O)) - R2;
                    DecimalFormat df = new DecimalFormat("#0.00");
                    resistor1.setText(df.format(R1));
                } else if ((resistor2.getText().isEmpty()) || (resistor2.getText() == null)) {
                    float O = Float.parseFloat(tensaoSaida.getText().replaceAll(",", "."));
                    float I = Float.parseFloat(tensaoEntrada.getText().replaceAll(",", "."));
                    float R1 = Float.parseFloat(resistor1.getText());
                    float R2 = O * R1 / (I - O);
                    DecimalFormat df = new DecimalFormat("#0.00");
                    resistor2.setText(df.format(R2));
                }
            }
        }
    }
    public static void limpar(){
        resistor1.setText("");
        resistor2.setText("");
        tensaoSaida.setText("");
        tensaoEntrada.setText("");
    }
}
