/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corn;

import javax.swing.JOptionPane;

/**
 *
 * @author bor1bro
 */
public class IntegralException extends Exception
{
    public IntegralException(String msg)
    {
        JOptionPane.showMessageDialog(null, msg);
    }
}
