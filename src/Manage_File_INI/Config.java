package Manage_File_INI;

import Manage_File_INI.SectionAlreadyExistException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abbadati Alessio, Dinaro Salvatore & Multani Prabhdeep
 */
public class Config {
    
    protected List<Section> Sections;
    
    public Config(){
        Sections=new ArrayList<Section>();
    }
    
    public void addSection(String name) throws SectionAlreadyExistException{
        Section s=new Section(name);
        for(int i=0; i<Sections.size(); i++){
            if(Sections.get(i).getName()==name){
                throw new SectionAlreadyExistException(name);
            }
        }
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
    
    public void addParam(String section_name, String name, String value) throws SectionNotExistException, ParamAlreadyExistException{
        int i;
        for(i=0; i<Sections.size(); i++){
            if(Sections.get(i).getName()==section_name){
                Sections.get(i).addParam(name, value);
                break;
            }
        }
        if(i==Sections.size()) throw new SectionNotExistException(section_name);
    }
    
    public void removeParam(String section_name, String name) throws SectionNotExistException{
        int i;
        for(i=0; i<Sections.size(); i++){
            if(Sections.get(i).getName()==section_name){
                Sections.get(i).removeParam(name);
                break;
            }
        }
        if(i==Sections.size()) throw new SectionNotExistException(section_name);
    }
    
    public String getParam(String section_name, String name) throws SectionNotExistException{
        int i;
        for(i=0; i<Sections.size(); i++){
            if(Sections.get(i).getName()==section_name){
                return Sections.get(i).getParam(name);
            }
        }
        if(i==Sections.size()) throw new SectionNotExistException(section_name);
        return null;
    }
}
