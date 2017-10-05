/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage_File_INI;

import java.io.FileNotFoundException;

/**
 *
 * @author salva
 */
public class prova_main {
    public static void main(String [] args) throws FileNotFoundException, SectionNotExistException, ParamAlreadyExistException{
        IniWriter a=new IniWriter();
        Config c=new Config();
        try {
            c.addSection("Section1");
        } catch (SectionAlreadyExistException ex) {}
        c.addParam("Section1", "pincopallo", "0");
        c.addParam("Section1", "zanola", "0");
        c.addParam("Section1", "Param3", "0");
        try {
            c.addSection("Section2");
        } catch (SectionAlreadyExistException ex) {}
        c.addParam("Section2", "Param1", "0");
        c.addParam("Section2", "Param2", "0");
        c.addParam("Section2", "Param3", "0");
        a.write(c);
    }
}