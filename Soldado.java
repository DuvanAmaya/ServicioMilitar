public class Soldado {
    private int codigoSoldado;
    private String nombre;
    private String apellidos;
    private String graduacion;
    private Compañia compañia;
    private Cuerpo cuerpo;
    private Cuartel cuartel;

    public Soldado(int codigoSoldado, String nombre, String apellidos, String graduacion, Compañia compañia, Cuerpo cuerpo, Cuartel cuartel) {
        this.codigoSoldado = codigoSoldado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.graduacion = graduacion;
        this.compañia = compañia;
        this.cuerpo = cuerpo;
        this.cuartel = cuartel;
    }
}
