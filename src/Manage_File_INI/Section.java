/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage_File_INI;

import Manage_File_INI.ParamNotExistException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Abbadati Alessio, Dinaro Salvatore & Multani Prabhdeep
 */
public class Section {

    protected List<String> parameter;

    private String name;

    public Section(String name) {
        parameter = new ArrayList();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addParam(String name, String value) throws ParamAlreadyExistException {
        for (int i = 0; i < parameter.size(); i++) {
            String param = parameter.get(i);
            for (int j = 0; j < param.length(); j++) {
                if (param.charAt(j) == '=') {
                    if (param.substring(0, j).equals(name)) {
                        throw new ParamAlreadyExistException(name);
                    }
                }
            }
        }
        parameter.add(name + "=" + value);
    }

    public int getSize() {
        return parameter.size();
    }

    public void removeParam(String name) {
        for (int i = 0; i < parameter.size(); i++) {
            String param = parameter.get(i);
            for (int j = 0; j < param.length(); j++) {
                if (param.charAt(j) == '=') {
                    if (param.substring(0, j).equals(name)) {
                        parameter.remove(i);
                        break;
                    }
                }
            }
            break;
        }
    }

    public String getParam(String name) {
        for (int i = 0; i < parameter.size(); i++) {
            for (int j = 0; j < parameter.get(i).length(); j++) {
                if (parameter.get(i).charAt(j) == '=') {
                    if (parameter.get(i).substring(0, j).equals(name)) {
                        return parameter.get(i).substring(j + 1);
                    }
                }
            }
        }
        return null;
    }
}
