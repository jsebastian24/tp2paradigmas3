
package universidadtp1;

/**
 *
 * @author Sebastian
 */
public class Profesor extends Persona {
    
    private String categoria;
    private String dedicacion;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }

    public Profesor() {
    }

    public Profesor(String categoria, String dedicacion) {
        this.categoria = categoria;
        this.dedicacion = dedicacion;
    }

    @Override
    public String toString() {
        return categoria + " " + dedicacion;
    }

    
    
    
    
    
    
    
    
    
}
