package dev.java10x.CadastroDeClientes.Carros;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.util.List;

@Entity
@Table (name = "tb_carros")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class CarrosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    private String marca;


    // Um modelos de carros  pode ter varios outros donos
    @OneToOne(mappedBy = "carros")
    private List<CarrosModel> carros;


}
