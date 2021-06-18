package com.ecad.cadastro.dominio.repositorio;

import java.util.List;

import com.ecad.cadastro.dominio.modelo.Cliente;

public interface ClienteRepositorio {
	
	List<Cliente> listar();
	Cliente buscar(Long id);
	Cliente salvar(Cliente cliente);
	void remover(Cliente cliente);
	
}
