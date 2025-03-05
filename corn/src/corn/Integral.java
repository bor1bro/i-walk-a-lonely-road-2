/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corn;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author student
 */
public class Integral 
{
    private double minValue = 0.0;
    private double maxValue = 0.0;
    private double stepValue = 0.0;
    
    public Integral(double min, double max, double step)
    {
        minValue = min;
        maxValue = max;
        stepValue = step;
    }
    
    public double Estimate()
    {
        int splits = (int)Math.ceil((maxValue - minValue) / stepValue);
        double result = 0.5 * (Math.sin(minValue) + Math.sin(maxValue));
        
        for (double index = 1; index < splits; index++)
        {
            double x = minValue + index * stepValue;
            result += Math.sin(x);
        }
        return result * stepValue;
    }
    
}
