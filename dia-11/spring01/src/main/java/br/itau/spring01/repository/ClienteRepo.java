package br.itau.spring01.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import br.itau.spring01.model.Client;

//crudrepository <Classe, PK>
public interface ClienteRepo extends CrudRepository<Client, Long> {

  public Client findByEmail(String email);

  public Page<Client> findAll(Pageable pageable);
}
