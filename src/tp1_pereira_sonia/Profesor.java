package tp1_pereira_sonia;


public class Profesor extends Empleado {
    private String cargo;
    private boolean esProfesorOAyudante;
    
    //Constructor
    public Profesor(){
        super();
    }
    
    public Profesor(int dni, String nombre, int edad, int cantidadMesesTrabajados, String cargo, boolean esProfesorOAyudante) {
        super(dni, nombre, edad, cantidadMesesTrabajados);
        this.cargo = cargo;
        this.esProfesorOAyudante = esProfesorOAyudante;
    }
    
    
    
    //Getters and Setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEsProfesorOAyudante() {
        return esProfesorOAyudante;
    }

    public void setEsProfesorOAyudante(boolean esProfesorOAyudante) {
        this.esProfesorOAyudante = esProfesorOAyudante;
    }
    
    
    //Metodo ObtenerInformacionParticularDelTrabajo
    @Override
    public void ObtenerInformacionParticularDelTrabajo(){
        System.out.println("Los profesores suelen trabajar dando clases en secundarios, terciarios o universitarios");
    }
    
    
}
