import java.time.LocalDateTime;

public class Tarefa {
    
    private int id;
    private String titulo;
    private String descricao;
    private boolean completa;
    private LocalDateTime dataAgora;

    public Tarefa(int id, String titulo, String descricao){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.completa = false;
        this.dataAgora = LocalDateTime.now();
    }

    public LocalDateTime getDataAgora(){
        return dataAgora;
    }

    public void setDataAgora(LocalDateTime dataAgora) {
        this.dataAgora = dataAgora;
    }

 @Override
    public String toString() {
        return "ID: " + id +
               ", Título: " + titulo +
               ", Descrição: " + descricao +
               ", Concluída: " + (completa ? "Sim" : "Não") +
               ", Data: " + dataAgora;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
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
    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
//teste

}
