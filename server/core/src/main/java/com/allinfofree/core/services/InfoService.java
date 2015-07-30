package com.allinfofree.core.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allinfofree.core.model.Info;
import com.allinfofree.core.repository.InfoRepository;

@Service
public class InfoService {
	
	
	@Autowired
	private InfoRepository infoRepository;
	
	public Info add(UUID id, String title, String subtitle, String authornick){
		Info info = new Info(id, title, subtitle, authornick);
		Info inforef = infoRepository.save(info);
		return inforef;
	}
	
	public Info expandbyInfo(long id, String infoText){
		Info info = infoRepository.findOne(id);
		info.setInfo(infoText);
		infoRepository.save(info);
		return info;
	}
	
	public Info expandbyLink(long id, String text){
		Info info = infoRepository.findOne(id);
		info.setLink(text);
		infoRepository.save(info);
		return info;
	}
	
	public Info expandbyPic(long id, String text){
		Info info = infoRepository.findOne(id);
		info.setPic(text);
		infoRepository.save(info);
		return info;
	}
	
	public Info publishAnonymously(long id){
		Info info = infoRepository.findOne(id);
		info.setActive(true);
		infoRepository.save(info);
		return info;
	}
	
	public Info publish(long id, long userId){
		Info info = infoRepository.findOne(id);
		info.setActive(true);
		//associate with user
		infoRepository.save(info);
		return info;
	}
	

}
