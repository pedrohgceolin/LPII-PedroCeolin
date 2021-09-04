package Atividade11.Exercicio1ao4;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("toto", 4, true, true);
        Cavalo cv1 = new Cavalo("San Jey", 12, true, true);
        Preguica p1 = new Preguica("Kadu", 15, true, true);
        Cachorro c2 = new Cachorro("pastor", 2, true, true);
        Cavalo cv2 = new Cavalo("Potro", 8, true, true);
        Preguica p2 = new Preguica("Cansada", 7, true, true);
        Cachorro c3 = new Cachorro("Julio", 17, true, true);
        Cavalo cv3 = new Cavalo("Horse", 20, true, true);
        Preguica p3 = new Preguica("Kaduzinho", 1, true, true);
        Cachorro c4 = new Cachorro("Leo", 9, true, true);

        c1.correr();

        Veterinario.examinar(c1);
        Veterinario.examinar(cv1);
        Veterinario.examinar(p1);

        Zoologico z1 = new Zoologico();

        z1.adicionarItem(c1);
        z1.adicionarItem(cv1);
        z1.adicionarItem(p1);
        z1.adicionarItem(c2);
        z1.adicionarItem(cv2);
        z1.adicionarItem(p2);
        z1.adicionarItem(c3);
        z1.adicionarItem(cv3);
        z1.adicionarItem(p3);
        z1.adicionarItem(c4);

        z1.percorrerJaulas();

    }
}
