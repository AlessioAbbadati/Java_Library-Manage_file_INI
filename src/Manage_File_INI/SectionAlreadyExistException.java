
package Manage_File_INI;

/**
 *
 * @author Abbadati Alessio, Dinaro Salvatore & Multani Prabhdeep
 */
public class SectionAlreadyExistException extends Exception{
    public SectionAlreadyExistException(String name){
        super("La sezione '"+name+"' è gia esistente.");
    }
}