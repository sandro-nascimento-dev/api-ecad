package com.ecad.cadastro.controlador;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ecad.cadastro.dominio.modelo.Cliente;
import com.ecad.cadastro.dominio.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {

	@Autowired
	private ClienteRepositorio clienteRepositorio;

	@GetMapping
	public List<Cliente> listar() {
		return clienteRepositorio.listar();
	}

	@GetMapping(value = "/{clienteId}")
	public ResponseEntity<Cliente> buscar(@PathVariable Long clienteId) {

		Cliente cliente = clienteRepositorio.buscar(clienteId);

		if (cliente != null) {
			return ResponseEntity.ok(cliente);
		}

		return ResponseEntity.notFound().build();

	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente) {
		return clienteRepositorio.salvar(cliente);
	}
	
	@PutMapping(value = "/{clienteId}")
	public ResponseEntity<Cliente> atualizar(@PathVariable Long clienteId, @RequestBody Cliente clienteHttp) {

		Cliente clienteAtual = clienteRepositorio.buscar(clienteId);

		if (clienteAtual != null) {
			
			BeanUtils.copyProperties(clienteHttp, clienteAtual, "id","dataCriacao","enderecos","telefones");

			clienteRepositorio.salvar(clienteAtual);

			return ResponseEntity.ok(clienteAtual);

		}

		return ResponseEntity.notFound().build();

	}


	@DeleteMapping(value = "/{clienteId}")
	public ResponseEntity<Cliente> remover(@PathVariable Long clienteId) {

		Cliente cliente = clienteRepositorio.buscar(clienteId);

		if (cliente != null) {
			clienteRepositorio.remover(cliente);
			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.notFound().build();

	}

}
