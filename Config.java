package Manage_File_INI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abbadati Alessio & Dinaro Salvatore
 */
public class Config {
    
    private List<Section> Sections;
    
    public Config(){
        Sections=new ArrayList<Section>();
    }
    
    public void addSection(String name){
        Section s=new Section(name);
        Sections.add(s);
    }
    
    public void removeSection(String name){
        for(int i=0; i<Sections.size(); i++){
            if(Sections.get(i).getName()==name){
                Sections.remove(i);
                break;
            }
        }
    }
    
    public boolean ExistSection(String name){
        for(int i=0; i<Sections.size(); i++){
            if(Sections.get(i).getName()==name){
                return true;
            }
        }
        return false;
    }
}
