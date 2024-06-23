package hospital.com.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pacientes")
public class PacientesEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "telefone", nullable = false)
    private String telefone;
    @Column(name = "data_nascimento", nullable = false)
    private String data_nascimento;

    public PacientesEntity() {
    }

    public PacientesEntity(Long id, String nome, String telefone, String data_nascimento) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.data_nascimento = data_nascimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}
