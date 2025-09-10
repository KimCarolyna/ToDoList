import java.time.LocalDateTime;

public class Tarefa {
    
    private Long id;
    private String titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime dataAgora;

    public Tarefa() {
        this.dataAgora = LocalDateTime.now();
        this.completa = false;
    }

    public Tarefa(String titulo){
        this();
        this.titulo = titulo;
    }

    public Tarefa(Long id, String titulo, String descricao, boolean completa){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.completa = completa;
        this.dataAgora = LocalDateTime.now();
    }

    public LocalDateTime getDataAgora(){
        return dataAgora;
    }

    public void setDataAgora(LocalDateTime dataAgora) {
        this.dataAgora = dataAgora;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }
//teste

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
}
