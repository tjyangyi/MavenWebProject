package com.fhzz.core.sercurity.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * SysUsers entity. @author MyEclipse Persistence Tools
 */
@Entity
@DynamicUpdate(true)
@DynamicInsert(true)
@Table(name = "SYS_USERS")
public class SysUsers implements UserDetails, Serializable {

	// Fields
	private static final long serialVersionUID = 5259842209993094655L;
	private String userId;
	private String username;
	private String name;
	private String password;
	private Date dtCreate;
	private Date lastLogin;
	private Date deadline;
	private String loginIp;
	private String VQzjgid;
	private String VQzjgmc;
	private String depId;
	private String depName;
	private boolean enabled;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private Set<SysUsersRoles> sysUsersRoleses = new HashSet<SysUsersRoles>(0);

	private Collection<GrantedAuthority> authorities;

	
	
	// Constructors


	/** default constructor */
	public SysUsers() {
	}

	@Override
	public String toString() {
		return "SysUsers [userId=" + userId + ", username=" + username
				+ ", name=" + name + ", lastLogin=" + lastLogin + ", loginIp="
				+ loginIp + "]";
	}

	/** minimal constructor */
	public SysUsers(String userId, String username, String password) {
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

	/** full constructor */
	public SysUsers(String userId, String username, String name, String password, Date dtCreate, Date lastLogin,
			Date deadline, String loginIp, String VQzjgid, String VQzjgmc, String depId, String depName,
			boolean enabled, boolean accountNonExpired, boolean accountNonLocked, boolean credentialsNonExpired,
			Set<SysUsersRoles> sysUsersRoleses) {
		this.userId = userId;
		this.username = username;
		this.name = name;
		this.password = password;
		this.dtCreate = dtCreate;
		this.lastLogin = lastLogin;
		this.deadline = deadline;
		this.loginIp = loginIp;
		this.VQzjgid = VQzjgid;
		this.VQzjgmc = VQzjgmc;
		this.depId = depId;
		this.depName = depName;
		this.enabled = enabled;
		this.accountNonExpired = accountNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.credentialsNonExpired = credentialsNonExpired;
		this.sysUsersRoleses = sysUsersRoleses;
	}

	// Property accessors
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@GeneratedValue(generator = "uuid")
	@Column(name = "USER_ID", unique = true, nullable = false, length = 100)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	@Column(name = "USERNAME", nullable = false, length = 100)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "NAME", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	@Column(name = "PASSWORD", nullable = false, length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "DT_CREATE", length = 7)
	public Date getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(Date dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Column(name = "LAST_LOGIN", length = 7)
	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Column(name = "DEADLINE", length = 7)
	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	@Column(name = "LOGIN_IP", length = 100)
	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	@Column(name = "V_QZJGID", length = 100)
	public String getVQzjgid() {
		return this.VQzjgid;
	}

	public void setVQzjgid(String VQzjgid) {
		this.VQzjgid = VQzjgid;
	}

	@Column(name = "V_QZJGMC", length = 100)
	public String getVQzjgmc() {
		return this.VQzjgmc;
	}

	public void setVQzjgmc(String VQzjgmc) {
		this.VQzjgmc = VQzjgmc;
	}

	@Column(name = "DEP_ID", length = 100)
	public String getDepId() {
		return this.depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	@Column(name = "DEP_NAME", length = 100)
	public String getDepName() {
		return this.depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	@Column(name = "ENABLED", precision = 22, scale = 0)
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	@Column(name = "ACCOUNT_NON_EXPIRED", precision = 22, scale = 0)
	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	@Override
	@Column(name = "ACCOUNT_NON_LOCKED", precision = 22, scale = 0)
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	@Override
	@Column(name = "CREDENTIALS_NON_EXPIRED", precision = 22, scale = 0)
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "sysUsers")
	public Set<SysUsersRoles> getSysUsersRoleses() {
		return this.sysUsersRoleses;
	}

	public void setSysUsersRoleses(Set<SysUsersRoles> sysUsersRoleses) {
		this.sysUsersRoleses = sysUsersRoleses;
	}

	@Transient
	public Collection<GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysUsers other = (SysUsers) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

}