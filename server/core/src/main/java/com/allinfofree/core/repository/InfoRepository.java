package com.allinfofree.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.allinfofree.core.model.Info;
@Repository
public interface InfoRepository extends CrudRepository<Info, Long> {}




