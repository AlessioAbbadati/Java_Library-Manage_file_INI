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
import java.util.ArrayList;
import java.util.List;
import Manage_File_INI.Config;

/**
 *
 *
 * @author Abbadati Alessio, Dinaro Salvatore & Multani Prabhdeep
 */
public class IniReader {
    
    Config c;
    
    IniReader(Config c) {
        this.c=c;
    }

    public void Reader() throws FileNotFoundException, IOException, ParamAlreadyExistException, SectionAlreadyExistException, SectionNotExistException {

        String FILENAME = "Config.ini";
        FileReader fl;
        BufferedReader br;
        String sec_name="";

        try {
            fl = new FileReader(FILENAME);
            br = new BufferedReader(fl);
            String currentLine;

            while ((currentLine = br.readLine()) != null) {
                if (currentLine.charAt(0) == '[') {
                    int n = currentLine.length();
                    sec_name = currentLine.substring(1, n-1);
                    c.addSection(sec_name);
                } else {
                    int i, k = 0;

                    for (i = 0; i < currentLine.length(); i++) {
                        if (currentLine.charAt(i) == '=') {
                            k = i;
                            String name = currentLine.substring(0, k);
                            String value = currentLine.substring(k + 1, currentLine.length());
                            c.addParam(sec_name, name, value);
                        }

                    }
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
