package hospital.com.models;

import hospital.com.entities.HistoricoInternacoesEntity;
import hospital.com.entities.MedicosEntity;

import java.util.List;

public class HistoricoInternacoesPorMedico {
    private MedicosEntity medico;
    private List<HistoricoInternacoesEntity> historicoInternacoes;

    public HistoricoInternacoesPorMedico(MedicosEntity medico, List<HistoricoInternacoesEntity> historicoInternacoes) {
        this.medico = medico;
        this.historicoInternacoes = historicoInternacoes;
    }

    public MedicosEntity getMedico() {
        return medico;
    }

    public void setMedico(MedicosEntity medico) {
        this.medico = medico;
    }

    public List<HistoricoInternacoesEntity> getHistoricoInternacoes() {
        return historicoInternacoes;
    }

    public void setHistoricoInternacoes(List<HistoricoInternacoesEntity> historicoInternacoes) {
        this.historicoInternacoes = historicoInternacoes;
    }
}
