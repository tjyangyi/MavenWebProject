package com.fhzz.core.sercurity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * SysRolesAuthorities entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SYS_ROLES_AUTHORITIES")
public class SysRolesAuthorities implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1711226108310851030L;
	private String id;
	private String authorityId;
	private String roleId;
	
	private SysAuthorities sysAuthorities;
	private SysRoles sysRoles;

	// Constructors

	/** default constructor */
	public SysRolesAuthorities() {
	}

	/** full constructor */
	public SysRolesAuthorities(String id, SysAuthorities sysAuthorities,
			SysRoles sysRoles) {
		this.id = id;
		this.sysAuthorities = sysAuthorities;
		this.sysRoles = sysRoles;
	}

	// Property accessors
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	@Column(name = "ID", unique = true, nullable = false, length = 100)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name="AUTHORITY_ID" ,length=200,insertable=false,updatable=false)
	public String getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}

	@Column(name="ROLE_ID" ,length=200,insertable=false,updatable=false)
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AUTHORITY_ID", nullable = false)
	public SysAuthorities getSysAuthorities() {
		return this.sysAuthorities;
	}

	public void setSysAuthorities(SysAuthorities sysAuthorities) {
		this.sysAuthorities = sysAuthorities;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROLE_ID", nullable = false)
	public SysRoles getSysRoles() {
		return this.sysRoles;
	}

	public void setSysRoles(SysRoles sysRoles) {
		this.sysRoles = sysRoles;
	}

}