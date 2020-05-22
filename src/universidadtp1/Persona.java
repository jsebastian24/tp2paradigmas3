
package universidadtp1;

/**
 *
 * @author Sebastian
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer numeroDocumento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer numeroDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
    }

    
    @Override
    public String toString() {
        return  nombre + " " + apellido + " " + numeroDocumento ;
    }

    
    
}
