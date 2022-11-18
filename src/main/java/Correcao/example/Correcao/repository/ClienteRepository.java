package Correcao.example.Correcao.repository;

import Correcao.example.Correcao.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
