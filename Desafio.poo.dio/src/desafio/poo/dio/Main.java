package desafio.poo.dio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        curso curso1 = new curso();
        curso1.setCargahoraria(10);
        curso1.setDescricao("um curso muito bom para iniciantes em java");
        curso1.setTitulo("curso de java");

        mentoria mentoria = new mentoria();
        mentoria.setData(LocalDate.of(2023, 03, 13));
        mentoria.setDescricao("mentoria para falar sobre abstração, encapsulamento, herança e polimorfismo");
        mentoria.setTitulo("POO");

        Dev angelo = new Dev();

        System.out.println(curso1);
        System.out.println(mentoria);
        System.out.println(angelo.verClassificacao());
        angelo.ShowAtualXP();

    }
}
