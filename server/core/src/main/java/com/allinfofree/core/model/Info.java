package com.allinfofree.core.model;

import java.util.UUID;

import lombok.Data;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Data
@Table 
public class Info {
	
	@PrimaryKey
	private UUID id;
	
	private String title;
	private String subtitle;
	private String authornick;
	
	private String info;
	private String link;
	private String pic;
	
	private boolean active;
	
	public Info(){}
	
	public Info(UUID id, String title, String subtitle, String authornick) {
		super();
		this.id = id;
		this.title = title;
		this.subtitle = subtitle;
		this.authornick = authornick;
	}
	
}
