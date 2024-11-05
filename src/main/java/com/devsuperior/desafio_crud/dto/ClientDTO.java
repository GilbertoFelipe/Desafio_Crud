package com.devsuperior.desafio_crud.dto;

import com.devsuperior.desafio_crud.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @NotBlank(message = "Nome não pode ser vazio")
    private String name;

    @Size(min = 11, max = 11, message = "Deve preencher o campo corretamente")
    private String cpf;

    @Positive(message= "A renda deve ser positiva")
    private Double income;

    @PastOrPresent(message = "Não pode ser data futura")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthdate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
