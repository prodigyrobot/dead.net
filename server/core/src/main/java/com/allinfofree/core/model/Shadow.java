package com.allinfofree.core.model;

import java.util.UUID;

import lombok.Data;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * 
 * @author pkovgan
 * 
 * It is like a user account
 * 
 * 1)
 * But it has an expiration time
 * After certain period of inactivity there is an educated destruction: 
 * 
 * - this shadow will be deleted
 * - all its references will be destroyed
 * 
 * 2)
 * Shadow can change its nick, avatar, motto at any time 
 * (non-anonymously created by this shadow infos in this case remain with the old nick, avatar, motto)
 * 
 * 
 * 3)
 * If shadow decides delete itself, then it will be deleted without questions
 * 
 * 4)
 * If shadow decides delete itself with all info it ever created, the shadow will be deleted,
 * but created by the shadow info will be deleted only if this shadow created this info not anonymously
 * (anonymous info has no reference to shadow, so it can not be deleted on this base)
 *
 */
@Data
@Table 
public class Shadow {
	
	@PrimaryKey
	private UUID id;
	
	private String nick;
	
	private String avatar;
	
	private String motto;

	public Shadow(UUID id, String nick) {
		super();
		this.id = id;
		this.nick = nick;
	}
	
}
