/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Interfaces.IArrayListFactory;
import java.util.ArrayList;

/**
 *
 * @author Jun
 */
public class ArrayListFactory implements IArrayListFactory
{
    @Override
    public ArrayList<String> GetArrayList()
    {
        return new ArrayList<String>();
    }
}
