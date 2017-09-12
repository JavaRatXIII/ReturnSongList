/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnmp3s;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Jun
 */
public interface IReturnMP3s {
    public ArrayList getAllFiles();
    
    public void findDir(File root, String name);
}
