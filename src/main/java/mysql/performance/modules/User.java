package mysql.performance.modules;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = 156442949730908115L;
	
	private long userId;
	private String email;
	private String emailPassword;
	private String password;
	private String nickName;
	private String os;
	private String dtoken;
	private char   sex;
	private Date   datatime;
	private int    validateStatus;
	private int    userType;
	private String mobilephone;
	private String countrycode;
	private String imei;
	private String verificode;
	private String avatar;
	private String avatarMiddle;
	private String avatarSmall;
	private String district;
	private Date   verifycodeCreationTime;
	private String sipDomain;
	private String xmppDomain;
	private Date   loginTime;
	private String ip;
	private Date   birthday;
	private int    nicknameRvStatus;
	private int    avatarRvStatus;
	private int    signatureRvStatus;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailPassword() {
		return emailPassword;
	}
	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getDtoken() {
		return dtoken;
	}
	public void setDtoken(String dtoken) {
		this.dtoken = dtoken;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public Date getDatatime() {
		return datatime;
	}
	public void setDatatime(Date datatime) {
		this.datatime = datatime;
	}
	public int getValidateStatus() {
		return validateStatus;
	}
	public void setValidateStatus(int validateStatus) {
		this.validateStatus = validateStatus;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getVerificode() {
		return verificode;
	}
	public void setVerificode(String verificode) {
		this.verificode = verificode;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getAvatarMiddle() {
		return avatarMiddle;
	}
	public void setAvatarMiddle(String avatarMiddle) {
		this.avatarMiddle = avatarMiddle;
	}
	public String getAvatarSmall() {
		return avatarSmall;
	}
	public void setAvatarSmall(String avatarSmall) {
		this.avatarSmall = avatarSmall;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Date getVerifycodeCreationTime() {
		return verifycodeCreationTime;
	}
	public void setVerifycodeCreationTime(Date verifycodeCreationTime) {
		this.verifycodeCreationTime = verifycodeCreationTime;
	}
	public String getSipDomain() {
		return sipDomain;
	}
	public void setSipDomain(String sipDomain) {
		this.sipDomain = sipDomain;
	}
	public String getXmppDomain() {
		return xmppDomain;
	}
	public void setXmppDomain(String xmppDomain) {
		this.xmppDomain = xmppDomain;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public int getNicknameRvStatus() {
		return nicknameRvStatus;
	}
	public void setNicknameRvStatus(int nicknameRvStatus) {
		this.nicknameRvStatus = nicknameRvStatus;
	}
	public int getAvatarRvStatus() {
		return avatarRvStatus;
	}
	public void setAvatarRvStatus(int avatarRvStatus) {
		this.avatarRvStatus = avatarRvStatus;
	}
	public int getSignatureRvStatus() {
		return signatureRvStatus;
	}
	public void setSignatureRvStatus(int signatureRvStatus) {
		this.signatureRvStatus = signatureRvStatus;
	}
	
}
