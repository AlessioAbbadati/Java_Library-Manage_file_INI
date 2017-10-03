
package Manage_File_INI;

/**
 *
 * @author Dinaro
 */
public class SectionAlreadyExistException extends Exception{
    public SectionAlreadyExistException(String name){
        super("La sezione '"+name+"' è gia esistente.");
    }
}