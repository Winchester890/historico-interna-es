package hospital.com.controllers;

import hospital.com.entities.MedicosEntity;
import hospital.com.repositories.MedicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @Autowired
    private final MedicosRepository medicosRepository;

    public MedicosController(MedicosRepository medicosRepository) {
        this.medicosRepository = medicosRepository;
    }

    @GetMapping
    public List<MedicosEntity> findAll() {
       return this.medicosRepository.findAll();
    }

    @GetMapping("/{matricula}")
    public MedicosEntity findByMatricula(@PathVariable("matricula") final Long matricula) {
        return this.medicosRepository.findById(matricula)
                .orElseThrow(() -> new RuntimeException("Matricula não encontrada!"));

    }

    @GetMapping("/nome/{nome}")
    public List<MedicosEntity> findByNome(final String nome) {
        return this.medicosRepository.findByNome(nome);
    }

    @PostMapping("/adicionar")
    public void addMedico(@RequestBody final MedicosEntity medico) {
        this.medicosRepository.save(medico);
    }

    @PostMapping("/atualizar")
    public void update(@RequestBody final MedicosEntity medicosEntity) {
        this.medicosRepository.save(medicosEntity);
    }

    @DeleteMapping("/excluir")
    public void deleteByMatricula(@PathVariable("matricula") final Long matricula) {
        this.medicosRepository.deleteById(matricula);
    }
}
