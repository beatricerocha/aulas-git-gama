package br.itau.spring01.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.spring01.model.Client;
import br.itau.spring01.repository.ClienteRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/client")

public class ClientController {

  // nao posso instanciar classe private ClienteRepo repo = new ClienteRepo();
  @Autowired // injeção de dpendencia JPA spring boot, e cria a classe, escreve os metodos e
             // cria um obj para uso
  private ClienteRepo repo;

  @GetMapping("/all")
  public List<Client> listarTodos() {
    List<Client> list = (List<Client>) repo.findAll();
    return list;
  }

  @GetMapping("/list")
  public Page<Client> listarTodosPaginado(Pageable pageable) {
    Page<Client> list = repo.findAll(pageable);
    return list;
  }

  @GetMapping("/{codigo}")
  public ResponseEntity<Client> buscarCliente(@PathVariable long codigo) {
    Client clienteEncontrado = repo.findById(codigo).orElse(null);
    if (clienteEncontrado != null) {
      return ResponseEntity.ok(clienteEncontrado);
    }
    return ResponseEntity.notFound().build();
  }

  @PostMapping
  public ResponseEntity<Client> inserirCliente(@RequestBody Client cliente) {
    Client novoCliente = repo.save(cliente);
    return ResponseEntity.ok(novoCliente);
  }

  @DeleteMapping("/{codigo}")
  public ResponseEntity<Void> apagarCliente(@PathVariable long codigo) {
    // antes de apagar verifica se existe
    Client clienteEncontrado = repo.findById(codigo).orElse(null);
    if (clienteEncontrado != null) {
      try {
        repo.deleteById(codigo);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
      } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
      }
    }
    return ResponseEntity.notFound().build();
  }

  @PostMapping("/email")
  public ResponseEntity<Client> buscarEmail(@RequestBody Client cliente) {
    Client clienteEncontrado = repo.findByEmail(cliente.getEmail());
    if (clienteEncontrado != null) {
      return ResponseEntity.ok(clienteEncontrado);
    }
    return ResponseEntity.notFound().build();
  }
}
