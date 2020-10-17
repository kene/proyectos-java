package mx.com.kene.microservicios.commons.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;



public class CommonServiceImpl<E, R extends CrudRepository<E, Long>> implements CommonService<E> {

	@Autowired
	private R repository;
	
	@Override
	@Transactional(readOnly = true) // solo permite leer los datos de las tablas
	public Iterable<E> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	@Transactional // permite la escritura y modificacion de las entidades
	public E save(E entity) {
		return repository.save(entity);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);

	}

}
