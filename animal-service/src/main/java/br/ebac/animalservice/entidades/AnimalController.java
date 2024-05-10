package br.ebac.animalservice.entidades;

package br.ebac.animalservice.controladores;

import br.ebac.animalservice.servicos.animalservice
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Map;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/animais/resgatados/por-funcionario")
    public Map<String, Integer> contarAnimaisResgatadosPorFuncionario(
            @RequestParam Date dataInicio,
            @RequestParam Date dataFim) {
        return animalService.contarAnimaisResgatadosPorFuncionario(dataInicio, dataFim);
    }
}
