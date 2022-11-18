package Correcao.example.Correcao.utils;

import Correcao.example.Correcao.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public class Calculo {
    public Cliente calc(Cliente cliente){
        if (cliente.getReceita() > 1000000000000.00){
            Double valorIdeal = cliente.getReceita() - 999999999.9;
            cliente.setReceita(valorIdeal);
            return cliente;
        }else {
            Double cincoPorcentagen = (cliente.getReceita() * 0.05);
            cliente.setReceita(cliente.getReceita() - cincoPorcentagen);
            return cliente;
        }
    }
}
