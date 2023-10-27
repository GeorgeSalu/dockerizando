package io.github.dougllasfps.convidados;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ConvidadosController {
    
    @GetMapping
    public List<Convidado> getConvidados(){
        List<Convidado> lista = new ArrayList<Convidado>();
        lista.add(new Convidado("Fulano", "01234567890"));
        lista.add(new Convidado("Cicrano", "09876543210"));
        return lista;
    }
}
