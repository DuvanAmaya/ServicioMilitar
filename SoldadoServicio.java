import java.util.Date;

public class SoldadoServicio {
    private Soldado soldado;
    private Servicio servicio;
    private Date fechaRealizacion;

    public SoldadoServicio(Soldado soldado, Servicio servicio, Date fechaRealizacion) {
        this.soldado = soldado;
        this.servicio = servicio;
        this.fechaRealizacion = fechaRealizacion;
    }
}
