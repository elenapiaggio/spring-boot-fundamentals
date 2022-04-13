package com.competidor.springbootfundamentals.repository;

import com.competidor.springbootfundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
