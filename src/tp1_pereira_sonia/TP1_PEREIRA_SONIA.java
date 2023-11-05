package tp1_pereira_sonia;


public class TP1_PEREIRA_SONIA {

    public static void main(String[] args) {
        Profesor profesor1 = new Profesor(123456, "Juan", 35, 5, "Profesor", true);
        
        System.out.println("Información del profesor 1:");
        System.out.println(profesor1.toString());
        profesor1.EvaluarCantidadMesesTrabajados();
        profesor1.ObtenerInformacionParticularDelTrabajo();

        Profesor profesor2 = new Profesor();
        
        System.out.println("\nInformación del profesor 2:");
        System.out.println(profesor2.toString());
        profesor2.ObtenerInformacionParticularDelTrabajo();
       
        
    }
    
}
