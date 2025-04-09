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
 * @author bor1bro
 */
public class Integral extends Thread 
{
    private double minValue = 0.0;
    private double maxValue = 0.0;
    private double stepValue = 0.0;
    private double resultValue = 0.0;
    
    public Integral(double min, double max, double step)
    {
        minValue = min;
        maxValue = max;
        stepValue = step;
    }
    
    @Override
    public void run()
    {
        int splits = (int)Math.ceil((maxValue - minValue) / stepValue);
        double result = 0.5 * (Math.sin(minValue) + Math.sin(maxValue));
        
        for (double index = 1; index < splits; index++)
        {
            double x = minValue + index * stepValue;
            result += Math.sin(x);
        }
        resultValue = result * stepValue;
    }
    
    public double getMinValue()
    {
        return minValue;
    }
    
    public double getMaxValue()
    {
        return maxValue;
    }
    
    public double getStepValue()
    {
        return stepValue;
    }
    
    public double getResultValue()
    {
        return resultValue;
    }
}
