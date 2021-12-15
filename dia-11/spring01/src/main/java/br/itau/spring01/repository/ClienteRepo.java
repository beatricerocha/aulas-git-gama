package br.itau.spring01.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.spring01.model.Client;

//crudrepository <Classe, PK>
public interface ClienteRepo extends CrudRepository<Client, Long> {

  public Client findByEmail(String email);
}
