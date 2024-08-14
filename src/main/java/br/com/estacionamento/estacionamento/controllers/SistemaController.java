package br.com.estacionamento.estacionamento.controllers;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("")


public class SistemaController {




    @GetMapping ("/basico")
    public String basico(){
        return "sistema/basico";

    }
    @GetMapping ("/cliente")
    public String cliente(){
        return "Cliente/Cliente";

    }
    @GetMapping ("/administrador")
    public String Administrador() {
        return "Administrador/Administrador";
    }
        @GetMapping("/vagas")
        public String vagas() {
            return "Sistema/vagas";
        }

    @GetMapping ("/saibamais")
    public String SaibaMais(){
        return "fragments/SaibaMais";

    }
    @GetMapping ("/formadepagamento")
    public String FormPagamento(){
        return "validacoes/FormPagamento";

    }
    @GetMapping ("/login")
    public String login(){
        return "validacoes/FormLoginCliente";

    }
}

