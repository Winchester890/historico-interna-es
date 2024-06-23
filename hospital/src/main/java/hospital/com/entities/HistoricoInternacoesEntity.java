package hospital.com.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "historico_internacoes")
public class HistoricoInternacoesEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "id_paciente", nullable = false)
    private Long idPaciente;
    @Column(name = "medico_resp", nullable = false)
    private Long medicoResp;
    @Column(name = "entrada", nullable = false)
    private String entrada;
    @Column(name = "saida", nullable = false)
    private String saida;
    @Column(name = "descricao", nullable = false)
    private String descricao;

    public HistoricoInternacoesEntity() {
    }

    public HistoricoInternacoesEntity(Long id, Long idPaciente, Long medicoResp, String entrada, String saida, String descricao) {
        this.id = id;
        this.idPaciente = idPaciente;
        this.medicoResp = medicoResp;
        this.entrada = entrada;
        this.saida = saida;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getMedicoResp() {
        return medicoResp;
    }

    public void setMedicoResp(Long medicoResp) {
        this.medicoResp = medicoResp;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
