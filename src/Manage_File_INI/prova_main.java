/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage_File_INI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salva
 */
public class prova_main {
    public static void main(String [] args) throws FileNotFoundException, SectionNotExistException, ParamAlreadyExistException, IOException, SectionAlreadyExistException{
        Config c=new Config();
        IniReader b=new IniReader(c);
        b.Reader();
        IniWriter a=new IniWriter();
        try{
            c.addSection("Section4");
        }catch(SectionAlreadyExistException e){}
        try{
            c.addParam("Section4","Param1", "0");
        }catch(ParamAlreadyExistException e){}
        try{
            c.addParam("Section4","Param2", "0");
        }catch(ParamAlreadyExistException e){}
        try{
            c.addParam("Section4","Param3", "0");
        }catch(ParamAlreadyExistException e){}
        try{
            c.addParam("Section4","Param4", "0");
        }catch(ParamAlreadyExistException e){}
        try {
            c.addSection("Section3");
        } catch (SectionAlreadyExistException e) {}
        a.write(c);
    }
}