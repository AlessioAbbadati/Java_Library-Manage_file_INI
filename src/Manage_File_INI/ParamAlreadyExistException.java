/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage_File_INI;

/**
 *
 * @author salva
 */
public class ParamAlreadyExistException extends Exception{
    public ParamAlreadyExistException(String name){
        super("Il parametro '"+name+"' è gia esistente.");
    }
}
