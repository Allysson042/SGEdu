package br.ufrpe.SGEdu.seeder;
import br.ufrpe.SGEdu.repositorio.Repositorio;
import br.ufrpe.SGEdu.usuarios.*;

/**
 * Class Script
 * @author Allysson
 */
public class Seeder {
    public void addCoordenador(Repositorio repositorio) {
        String nome = "Lucas", login = "admin2", senha = "123";

        Coordenador coordenador = new Coordenador(nome, login, senha);

        repositorio.adicionarCoordenadores(coordenador);
    }
}