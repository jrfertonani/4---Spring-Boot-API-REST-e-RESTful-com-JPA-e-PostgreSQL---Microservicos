package microservice.repository;

import microservice.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {



}
