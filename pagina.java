import java.time.LocalTime;

public class pagina {

    private String url;
    private String titulo;
    private LocalTime hora;

    public pagina() {
    }

    public pagina(String url, String titulo, LocalTime hora) {
        this.url = url;
        this.titulo = titulo;
        this.hora = hora;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    

}
