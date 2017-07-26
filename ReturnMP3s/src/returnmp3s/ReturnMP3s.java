package returnmp3s;

import java.io.File;
import java.util.ArrayList;
import Interfaces.IArrayListFactory;
import Utilities.ArrayListFactory;

/**
 *
 * @author Jun
 */
public class ReturnMP3s implements IReturnMP3s{
    
    private ArrayList<String> _songsInDirectory;
    private IArrayListFactory _arrayListFactory;
    
    public ReturnMP3s()
    {
        _arrayListFactory = new ArrayListFactory();
        _songsInDirectory = _arrayListFactory.GetArrayList();
    }

    @Override
    public ArrayList getAllFiles() 
    {
        File curDir = new File("C:\\Users\\Jun\\Music");
        File[] filesList = curDir.listFiles();
        for(File f : filesList)
        {
            if(f.isFile())
            {
                String substr = f.getName().substring(f.getName().length() - 3);
                if(substr.equals("mp3"))
                {
                    _songsInDirectory.add(f.getName());
                }
            }
        }
        return _songsInDirectory;
    }   
}
