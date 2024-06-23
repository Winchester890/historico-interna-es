package hospital.com.adapter;

import hospital.com.entities.HistoricoInternacoesEntity;
import hospital.com.entities.MedicosEntity;
import hospital.com.entities.PacientesEntity;
import hospital.com.models.HistoricoInternacoesPorMedico;
import hospital.com.models.HistoricoInternacoesPorPaciente;

import java.util.List;
import java.util.stream.Collectors;

public class HistoricoInternacoesAdapter {
    public List<HistoricoInternacoesPorMedico> historicoInternacoesPorMedicoAdapter(
            List<HistoricoInternacoesEntity> historicoInternacoes, List<MedicosEntity> medicos
    ) {
        List<HistoricoInternacoesPorMedico> historicoInternacoesPorMedicos = medicos.stream()
                .map(medico1 -> { List<HistoricoInternacoesEntity> historicos =
                historicoInternacoes.stream().filter(h -> h.getMedicoResp().equals(medico1.getMatricula()))
                        .collect(Collectors.toList());
                return new HistoricoInternacoesPorMedico(medico1, historicos);
                }).collect(Collectors.toList());
        return historicoInternacoesPorMedicos;
    }

    public List<HistoricoInternacoesPorPaciente> historicoInternacoesPorPacienteAdapter(
            List<HistoricoInternacoesEntity> historicoInternacoes, List<PacientesEntity> pacientes
    ) {
        List<HistoricoInternacoesPorPaciente> historicoInternacoesPorPacientes = pacientes.stream()
                .map(paciente1 -> { List<HistoricoInternacoesEntity> historicos =
                historicoInternacoes.stream().filter(h -> h.getIdPaciente().equals(paciente1.getId()))
                        .collect(Collectors.toList());
                return new HistoricoInternacoesPorPaciente(paciente1, historicos);
                }).collect(Collectors.toList());
        return historicoInternacoesPorPacientes;
    }
}
