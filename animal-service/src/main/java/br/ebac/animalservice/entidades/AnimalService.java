package br.ebac.animalservice.entidades;

package br.ebac.animalservice.servicos;

import br.ebac.animalservice.entidades.Animal
import br.ebac.animalservice.repositorios.AnimalRepository
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public Map<String, Integer> contarAnimaisResgatadosPorFuncionario(Date dataInicio, Date dataFim) {
        List<Animal> animaisResgatados = animalRepository.findByDataEntradaBetween(dataInicio, dataFim);
        Map<String, Integer> contagemPorFuncionario = new HashMap<>();

        for (Animal animal : animaisResgatados) {
            String nomeFuncionario = animal.getNomeRecebedor();
            contagemPorFuncionario.put(nomeFuncionario, contagemPorFuncionario.getOrDefault(nomeFuncionario, 0) + 1);
        }

        return contagemPorFuncionario;
    }
}