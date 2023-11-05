package tp1_pereira_sonia;

public abstract class Empleado {

    private int dni;
    private String nombre;
    private int edad;
    private int cantidadMesesTrabajados;

    //Constructor
    public Empleado() {
        this.dni = 1234568;
        this.nombre = "Sin nombre";
    }

    public Empleado(int dni, String nombre, int edad, int cantidadMesesTrabajados) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadMesesTrabajados = cantidadMesesTrabajados;
    }

    //Getters and Setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCantidadMesesTrabajados() {
        return cantidadMesesTrabajados;
    }

    public void setCantidadMesesTrabajados(int cantidadMesesTrabajados) {
        this.cantidadMesesTrabajados = cantidadMesesTrabajados;
    }

    //ToString
    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Edad: " + edad + ", Meses Trabajados: " + cantidadMesesTrabajados;
    }

    //Metodo EvaluarCantidadMesesTrabajados
    public void EvaluarCantidadMesesTrabajados() {
        if (cantidadMesesTrabajados < 3) {
            System.out.println("Se encuentra en etapa de prueba");
        } else {
            System.out.println("Se encuentra fijo en la empresa");
        }
    }
    
    
    //Metodo ObtenerInformacionParticularDelTrabajo
    public abstract void ObtenerInformacionParticularDelTrabajo();
}
