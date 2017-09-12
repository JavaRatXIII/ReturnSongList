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
    
    private final ArrayList<String> _songsInDirectory;
    private final IArrayListFactory _arrayListFactory;
    public static String toFind = "";
    
    public ReturnMP3s()
    {
        _arrayListFactory = new ArrayListFactory();
        _songsInDirectory = _arrayListFactory.GetArrayList();
    }
    
    @Override
    public void findDir(File root, String name)  
    {
        
        if (root.getName().equals(name))
        {
            toFind = root.getAbsolutePath();
        }

        File[] files = root.listFiles();

        if(files != null)
        {
            for (File f : files)  
            {
                if(f.getName().equals(name))
                {
                    toFind = f.getAbsolutePath();
                }
            }
        }
    }

    @Override
    public ArrayList getAllFiles() 
    {
        findDir(new File("C:\\Users\\"+System.getProperty("user.name")), "Music");
        File curDir = new File(toFind);
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
