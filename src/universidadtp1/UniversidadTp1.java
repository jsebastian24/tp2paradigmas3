package universidadtp1;

/**
 *
 * @author Sebastian
 */
public class UniversidadTp1 {

    
    public static void main(String[] args) {
        
        
        Persona persona;
        Profesor profesor;
        
        persona = new Persona();
        profesor = new Profesor();
        
        persona.setNombre("Sebastian");
        persona.setApellido("Pizarro");
        persona.setNumeroDocumento(39886932);
        
        
        System.out.println(persona);
        
        
        
    }
    
}
