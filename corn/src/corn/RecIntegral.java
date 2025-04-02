/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corn;
import java.io.Serializable;
//import java.util.LinkedList;

/**
 *
 * @author bor1bro
 */
public class RecIntegral implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private double minValue;
    private double maxValue;
    private double stepValue;
    private double resultValue;
    
    private void checkValid(double min, double max, double step) throws IntegralException
    {
        if ((min >= 0.000001 && min <= 1000000) &&
            (max >= 0.000001 && max <= 1000000) &&
            (step >= 0.000001 && step <= 1000000))
        {} else
        {
            throw new IntegralException("Input values must be in range from 0.000001 to 1000000");
        }
    }
    
    private void checkStep(double min, double max, double step) throws IntegralException
    {
        if(step > (max-min))
        {
            throw new IntegralException("Step cannot be higher than min or max values");
        }
    }
    
    public RecIntegral(double min, double max, double step, double result)
    {
        try
        {
            checkValid(min, max, step);
            checkStep(min,max,step);
            minValue = min;
            maxValue = max;
            stepValue = step;
            resultValue = result;
        }
        catch (IntegralException exception)
        {
            System.out.println(exception);
        }
    }
    
    public double getMinValue()
    {
        return this.minValue;
    }
    public double getMaxValue()
    {
        return this.maxValue;
    }
    public double getStepValue()
    {
        return this.stepValue;
    }
    public double getResultValue()
    {
        return this.resultValue;
    }
    public void setMinValue(double newValue)
    {
        this.minValue = newValue;
    }
    public void setMaxValue(double newValue)
    {
        this.maxValue = newValue;
    }
    public void setStepValue(double newValue)
    {
        this.stepValue = newValue;
    }
    public void setResultValue(double newValue)
    {
        this.resultValue = newValue;
    }
    
    //private LinkedList<RecIntegral> recRow = new LinkedList<>();
}
