/**
 * 
 */
package com.habte.real_estate.generic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * @author habta
 *
 */
@Service
public abstract class GenericServiceImpl<T, ID> {//implements GenericService<T, ID> {

//	 @Autowired
//	    private JpaRepository<T, ID> repository;
//	
//	 //@Override
//	public List<T> findAll() {
//		// TODO Auto-generated method stub
//		 return repository.findAll();
//	}
//
//	//@Override
//	public T findById(ID id) {
//		// TODO Auto-generated method stub
//		// return repository.findById(id).orElse(null);
//		 Optional<T> result = repository.findById(id);
//	        return result.orElse(null);
//	}
//
//	//@Override
//	public T save(T entity) {
//		// TODO Auto-generated method stub
//		return repository.save(entity);
//	}
//
//	//@Override
//	public void deleteById(ID id) {
//		// TODO Auto-generated method stub
//		repository.deleteById(id);
//	}

}
