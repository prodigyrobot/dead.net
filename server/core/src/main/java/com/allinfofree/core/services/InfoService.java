package com.allinfofree.core.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Service;

import com.allinfofree.core.model.Shadow;
import com.allinfofree.core.repository.InfoByCategoryTagsRepository;
import com.allinfofree.core.repository.InfoByCategoryTimeRepository;
import com.allinfofree.core.repository.ShadowRepository;

@Service
public class InfoService {
	
	@Autowired
	CassandraOperations cassandraOperations;
	
	
	@Autowired
	private InfoByCategoryTagsRepository infoByCategoryTagsRepository;
	
	@Autowired
	private InfoByCategoryTimeRepository infoByCategoryTimeRepository;
	
	@Autowired
	private ShadowRepository shadowRepository;
	
	
	/** Info **/
	public void add(){}
	
	
	
	/** Shadow **/
	public Shadow addShadow(UUID id, String nick){
		Shadow shadow  = new Shadow(id, nick);
		return shadowRepository.save(shadow);
	}
	
	public Shadow expandbyAvatar(UUID id, String text){
		Shadow shadow = shadowRepository.findOne(id);
		shadow.setAvatar(text);
		return shadowRepository.save(shadow);
	}
	
	public Shadow expandbyMotto(UUID id, String text){
		Shadow shadow = shadowRepository.findOne(id);
		shadow.setMotto(text);
		return shadowRepository.save(shadow);
	}
	
	public Shadow expandbyNick(UUID id, String text){
		Shadow shadow = shadowRepository.findOne(id);
		shadow.setNick(text);
		return shadowRepository.save(shadow);
	}
	

}
