package com.ecad.cadastro.impl.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Component;

import com.ecad.cadastro.dominio.modelo.Cliente;
import com.ecad.cadastro.dominio.repositorio.ClienteRepositorio;

@Component
public class ClienteRepositorioImpl implements ClienteRepositorio{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Cliente> listar() {
		
		return manager.createQuery("from Cliente", Cliente.class).getResultList();
	}

	@Override
	public Cliente buscar(Long id) {
		return manager.find(Cliente.class, id);
	}
	
	@Transactional
	@Override
	public Cliente salvar(Cliente cliente) {


		return manager.merge(cliente);
	}

	@Transactional
	@Override
	public void remover(Cliente cliente) {
		
		manager.remove(cliente);
		
	}


}
