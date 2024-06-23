package hospital.com.models;

import hospital.com.entities.HistoricoInternacoesEntity;
import hospital.com.entities.PacientesEntity;

import java.util.List;

public class HistoricoInternacoesPorPaciente {
    private PacientesEntity paciente;
    private List<HistoricoInternacoesEntity> historicoInternacoes;

    public HistoricoInternacoesPorPaciente(PacientesEntity paciente, List<HistoricoInternacoesEntity> historicoInternacoes) {
        this.paciente = paciente;
        this.historicoInternacoes = historicoInternacoes;
    }

    public PacientesEntity getPaciente() {
        return paciente;
    }

    public void setPaciente(PacientesEntity paciente) {
        this.paciente = paciente;
    }

    public List<HistoricoInternacoesEntity> getHistoricoInternacoes() {
        return historicoInternacoes;
    }

    public void setHistoricoInternacoes(List<HistoricoInternacoesEntity> historicoInternacoes) {
        this.historicoInternacoes = historicoInternacoes;
    }
}
