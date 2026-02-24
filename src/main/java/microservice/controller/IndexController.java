package microservice.controller;

import microservice.model.Usuario;
import microservice.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/usuario")
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/{id}/codigovenda/{venda}")
    public ResponseEntity<Usuario> relatorio(@PathVariable (value = "id") Long id,
                                             @PathVariable(value = "venda") Long venda){

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> init(@PathVariable (value = "id") Long id){

        Optional<Usuario> usuario = usuarioRepository.findById(id);

        return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
    }


    @GetMapping("/")
    public ResponseEntity<List<Usuario>> usuarios(){

        List<Usuario> list = usuarioRepository.findAll();

        return new ResponseEntity<List<Usuario>>(list, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){


        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity<Usuario>(usuarioSalvo, HttpStatus.OK);

    }

    @PostMapping("/{iduser}/idvenda/{idvenda}")
    public ResponseEntity<Usuario> cadastrarvenda(@PathVariable Long iduser,
                                                  @PathVariable Long idvenda){

        //Usuario usuarioSalvo = usuarioRepository.save();

        return new ResponseEntity("id user : "+ iduser + "idvend: "+idvenda, HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(
                                             @RequestBody Usuario usuario){

        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity<Usuario>(usuarioSalvo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



}
