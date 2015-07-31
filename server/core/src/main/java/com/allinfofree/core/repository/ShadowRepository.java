package com.allinfofree.core.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.allinfofree.core.model.Shadow;

public interface ShadowRepository extends CrudRepository<Shadow, UUID> {}
