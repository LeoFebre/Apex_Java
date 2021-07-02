package br.com.apex.clientes.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.apex.clientes.modelo.ClienteModelo;

/*
    Repository - Ações base de banco de dados(SELECT, INSERT, UPDATE e DELETE)
    CrudRepository - Além de funções CRUD, podemos trabalhar com AND, OR, LIKE, BETWEEN, IN e WHERE
    JpaRepository - Trabalha com todas as funções do Repository e CrudRepository, além de paginação
*/    


@Repository
public interface RepositorioCliente extends CrudRepository<ClienteModelo, Integer>{

  // Cadastrar
  <Cli extends ClienteModelo> Cli save(ClienteModelo cm);

  // Listar
  List<ClienteModelo> findAll();

  //Ordenar listagem (ASC = CRESCENTE ou DESC = DECRESCENTE)
  List<ClienteModelo> findByOrderByNomeAsc();

  //Operadores lógicos (E-AND, OU-OR)
  ClienteModelo findByNomeAndCidade(String nome, String cidade);

  //Contêm determinado termo (LIKE)
  List<ClienteModelo> findByNomeContains(String termo);

  // Contar registros
  long count();

  //Agrupar por cidade
public static final String comandoSQL = "SELECT cidade, COUNT(*) FROM clientes GROUP BY cidade";
@Query(value = comandoSQL, nativeQuery = true)
List<Object> agruparCidades();

}
