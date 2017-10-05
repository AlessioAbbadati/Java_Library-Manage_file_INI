/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage_File_INI;

/**
 *
 * @author Abbadati Alessio, Dinaro Salvatore & Multani Prabhdeep
 */
public class SectionNotExistException extends Exception{
    public SectionNotExistException(String name){
        super("La sezione '"+name+"' non esiste.");
    }
}
