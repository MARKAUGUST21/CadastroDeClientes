package dev.java10x.CadastroDeClientes.Carros;


import jakarta.persistence.*;

import java.awt.*;
import java.util.List;

@Entity
@Table (name = "tb_carros")


public class CarrosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    private String marca;


    // Um modelos de carros  pode ter varios outros donos
    @OneToOne(mappedBy = "carros")
    private List<CarrosModel> carros;


    public CarrosModel(){

    }

    public CarrosModel(Long id, String modelo, String marca) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
    }

    public CarrosModel(CarrosModel carros) {
        this.carros = (List<CarrosModel>) carros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public CarrosModel getCarros() {
        return (CarrosModel) carros;
    }

    public void setCarros(CarrosModel carros) {
        this.carros = (List<CarrosModel>) carros;
    }
}
