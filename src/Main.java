import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso JavaScript");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Angular");
        curso3.setDescricao("Curso de Angular");
        curso3.setCargaHoraria(5);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria do módulo de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(curso3);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Programa para desenvolvimento em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGlauber = new Dev();
        devGlauber.setNome("Glauber Farias");
        devGlauber.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos:" + devGlauber.getConteudosInscritos());
        devGlauber.progredir();
        devGlauber.progredir();
        System.out.println("Conteúdos concluídos:" + devGlauber.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos:" + devGlauber.getConteudosInscritos());
        System.out.println("XP: " + devGlauber.calcularTotalXp());

        System.out.println("---------------------------------------------------------------------------------");

        Dev devCeleste = new Dev();
        devCeleste.setNome("Celeste Farias");
        devCeleste.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos:" + devCeleste.getConteudosInscritos());
        devCeleste.progredir();
        devCeleste.progredir();
        devCeleste.progredir();
        System.out.println("Conteúdos concluídos:" + devCeleste.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos:" + devCeleste.getConteudosInscritos());
        System.out.println("XP: " + devCeleste.calcularTotalXp());
    }
}
