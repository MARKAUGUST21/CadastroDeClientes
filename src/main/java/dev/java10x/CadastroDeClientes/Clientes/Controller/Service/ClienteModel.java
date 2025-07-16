package dev.java10x.CadastroDeClientes.Clientes.Controller.Service;

import dev.java10x.CadastroDeClientes.Carros.CarrosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


// Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cidade;
    private String profissão;
    private String escolaridade;

    @ManyToOne
    @JoinColumn(name = "carros_id") // Foreing KEY = chave estrangeira
    private CarrosModel carros;




}
