package com.allinfofree.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.allinfofree.core.model.InfoByCategoryTags;
import com.allinfofree.core.model.InfoByCategoryTagsKey;
@Repository
public interface InfoByCategoryTagsRepository  extends CrudRepository<InfoByCategoryTags, InfoByCategoryTagsKey> {
}
