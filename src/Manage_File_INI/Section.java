package Manage_File_INI;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author 70657788
 */

public class Section {
    
    private List<String> parameter;
    
    private String name;
    
    public Section(String name){
        parameter=new ArrayList();
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void addParam(String name, String value){
        parameter.add(name+"="+value);
    }
    
    public void removeParam(String name){
        for(int i=0; i<parameter.size(); i++){
            String param=parameter.get(i);
            for(int j=0; j<param.length(); j++){
                if(param.charAt(j)=='='){
                    if(param.substring(0, j).equals(name)){
                        parameter.remove(i);
                        break;
                    }
                }
            }
            break;
        }
    }
    
    public String getParam(String name){
        for(int i=0; i<parameter.size(); i++){
            for(int j=0; j<parameter.get(i).length(); j++){
                if(parameter.get(i).charAt(j)=='='){
                    return parameter.get(i).substring(j+1);
                }
            }
        }
        return null;
    }
}
