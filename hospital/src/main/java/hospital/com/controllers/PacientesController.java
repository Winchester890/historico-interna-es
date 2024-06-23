package hospital.com.controllers;

import hospital.com.entities.PacientesEntity;
import hospital.com.repositories.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {
    @Autowired
    private final PacientesRepository pacientesRepository;

    public PacientesController(PacientesRepository pacientesRepository) {
        this.pacientesRepository = pacientesRepository;
    }

    @GetMapping
    public List<PacientesEntity> findAll() {
        return this.pacientesRepository.findAll();
    }

    @GetMapping("/{id}")
    public PacientesEntity findById(@PathVariable("id") final Long id) {
        return this.pacientesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id do paciente não encontrado!"));
    }

    @GetMapping("/nome/{nome}")
    public List<PacientesEntity> findByNome(final String nome) {
        return this.pacientesRepository.findByNome(nome);
    }

    @PostMapping("/adicionar")
    public void addPaciente(@RequestBody final PacientesEntity paciente) {
        this.pacientesRepository.save(paciente);
    }

    @PostMapping("/atualizar")
    public void update(@RequestBody final PacientesEntity pacientesEntity) {
        this.pacientesRepository.save(pacientesEntity);
    }

    @DeleteMapping("/excluir")
    public void deleteById(@PathVariable("id") final Long id) {
        this.pacientesRepository.deleteById(id);
    }
}
