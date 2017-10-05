/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage_File_INI;

import Manage_File_INI.Config;
import java.io.*;
import java.util.List;

/**
 *
 * @author Abbadati Alessio, Dinaro Salvatore & Multani Prabhdeep
 */
public class IniWriter {

    PrintStream out;

    public IniWriter() throws FileNotFoundException {
        out=new PrintStream("Config.ini");
    }

    public void write(Config c) {
        int i, j;
        for (i=0; i<c.Sections.size(); i++) {
            out.println("["+c.Sections.get(i).getName()+"]");
            for(j=0; j<c.Sections.get(i).parameter.size(); j++){
                out.println(c.Sections.get(i).parameter.get(j));
            }
        }
    }
}
