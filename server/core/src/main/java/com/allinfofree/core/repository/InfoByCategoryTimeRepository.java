package com.allinfofree.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.allinfofree.core.model.InfoByCategoryTime;
import com.allinfofree.core.model.InfoByCategoryTimeKey;
@Repository
public interface InfoByCategoryTimeRepository  extends CrudRepository<InfoByCategoryTime, InfoByCategoryTimeKey> {
}
