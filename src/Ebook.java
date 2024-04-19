public class Ebook extends ItemBibliotecaDigital implements Baixavel {
    public Ebook(String titulo, String autor) {
        super(titulo, autor);
    }

    public String descricao() {
        return "Ebook: " + getTitulo() + " - Autor: " + getAutor();
    }

    public void baixar() {
        System.out.println("Baixando o ebook: " + getTitulo());
    }
}
