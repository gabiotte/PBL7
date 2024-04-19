public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    public String descricao() {
        return "Vídeo Digital: " + getTitulo() + " - Autor: " + getAutor();
    }

    public void baixar() {
        System.out.println("Baixando o vídeo digital: " + getTitulo());
    }

    public void visualizar() {
        System.out.println("Visualizando o vídeo digital: " + getTitulo());
    }
}
