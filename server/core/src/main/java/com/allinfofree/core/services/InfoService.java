package com.allinfofree.core.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allinfofree.core.model.Info;
import com.allinfofree.core.model.Shadow;
import com.allinfofree.core.repository.InfoRepository;
import com.allinfofree.core.repository.ShadowRepository;

@Service
public class InfoService {
	
	
	@Autowired
	private InfoRepository infoRepository;
	@Autowired
	private ShadowRepository shadowRepository;
	
	
	/** Info **/
	public Info add(UUID id, String title, String subtitle, String authornick){
		Info info = new Info(id, title, subtitle, authornick);
		return infoRepository.save(info);
	}
	
	public Info expandbyInfo(UUID id, String infoText){
		Info info = infoRepository.findOne(id);
		info.setInfo(infoText);
		return infoRepository.save(info);
	}
	
	public Info expandbyLink(UUID id, String text){
		Info info = infoRepository.findOne(id);
		info.setLink(text);
		return infoRepository.save(info);
	}
	
	public Info expandbyPic(UUID id, String text){
		Info info = infoRepository.findOne(id);
		info.setPic(text);
		return infoRepository.save(info);
		
	}
	
	public Info publishAnonymously(UUID id){
		Info info = infoRepository.findOne(id);
		info.setActive(true);
		return infoRepository.save(info);
	}
	
	public Info publish(UUID id, UUID shadowId){
		Info info = infoRepository.findOne(id);
		info.setActive(true);
		//associate with shadow
		return infoRepository.save(info);
	}
	
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
