/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinal.modelos;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author dayan
 */
public class Constantes {
    public static final double T1 = 0.10;
    public static final double T2 = 0.20;
    public static final double D1 = 0.05;
    public static final double D2 = 0.10;
    public static final double D3 = 0.20;
    public static final double S1 = 0.05;
    public static final double S2 = 0.10;
    public static final double EFETIVO = 0.05;
    
    public static final Locale localeBR = new Locale("pt","BR");
    public static final NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
}
