public class Main {
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("ebook", "kale");
        Ebook ebook2 = new Ebook("ebook2", "pedr");

        VideoDigital video1 = new VideoDigital("video1", "heitor");
        VideoDigital video2 = new VideoDigital("video2", "heitor");

        System.out.println(ebook1.descricao());
        System.out.println(ebook2.descricao());
        System.out.println(video1.descricao());
        System.out.println(video2.descricao());

        ebook1.baixar();

        video1.visualizar();
        video2.visualizar();
    }
}
