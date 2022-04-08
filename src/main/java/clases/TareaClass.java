/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


/**
 *
 * @author daredevil769
 */
public class TareaClass {
    
    long id;
    public final String Descripcion;
    public final long fecha;

    public TareaClass(long id, String Descripcion, long fecha) {
        this.id = id;
        this.Descripcion = Descripcion;
        this.fecha = fecha;
    }
    
     public TareaClass(String Descripcion, long fecha) {
        this.Descripcion = Descripcion;
        this.fecha = fecha;
    }
    
}
