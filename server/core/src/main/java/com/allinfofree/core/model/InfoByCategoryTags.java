package com.allinfofree.core.model;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import lombok.Data;




@Table(value = "info_by_category_tags")
@Data
public class InfoByCategoryTags {
	
	@PrimaryKey
	private InfoByCategoryTagsKey key;
	
	@Column(value = "id")
	private UUID id;

	@Column(value = "title")
	private String title;
	
	@Column(value = "subtitle")
	private String subtitle;
	  
	@Column(value = "authornick")
	private String authornick;
	  
	@Column(value = "info")
	private String info;
	
	@Column(value = "link")
	private String link;
	  
	@Column(value = "pic")
	private String pic;
	
	@Column(value = "pic_title")
	private String picTitle;
	 
	@Column(value = "alltags")
	private String alltags;
	 
	@Column(value = "language")
	private String language;
	  
	@Column(value = "active")
	private boolean active;
	  
}
