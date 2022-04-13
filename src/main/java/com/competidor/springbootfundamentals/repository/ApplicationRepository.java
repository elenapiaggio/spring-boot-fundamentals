package com.competidor.springbootfundamentals.repository;

import com.competidor.springbootfundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
