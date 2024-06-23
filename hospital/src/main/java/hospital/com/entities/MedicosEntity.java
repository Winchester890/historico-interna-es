package hospital.com.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "medicos")
public class MedicosEntity {

    @Id
    @GeneratedValue
    private Long matricula;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "departamento", nullable = false)
    private String departamento;
    @Column(name = "cargo", nullable = false)
    private String cargo;
    @Column(name = "telefone", nullable = false)
    private String telefone;

    public MedicosEntity() {
    }

    public MedicosEntity(Long matricula, String nome, String departamento, String cargo, String telefone) {
        this.matricula = matricula;
        this.nome = nome;
        this.departamento = departamento;
        this.cargo = cargo;
        this.telefone = telefone;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
