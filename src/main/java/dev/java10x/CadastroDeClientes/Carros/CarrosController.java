package dev.java10x.CadastroDeClientes.Carros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class CarrosController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Essa é a primeira mensagem nessa rota";

    }



}