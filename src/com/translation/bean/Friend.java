package com.translation.bean;

public class Friend {
    /**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column friend.friendid
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	private Integer friendid;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column friend.primid
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	private Integer primid;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column friend.guestid
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	private Integer guestid;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database column friend.isnew
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	private String isnew;



	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column friend.friendid
	 * @return  the value of friend.friendid
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public Integer getFriendid() {
		return friendid;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column friend.friendid
	 * @param friendid  the value for friend.friendid
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public void setFriendid(Integer friendid) {
		this.friendid = friendid;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column friend.primid
	 * @return  the value of friend.primid
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public Integer getPrimid() {
		return primid;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column friend.primid
	 * @param primid  the value for friend.primid
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public void setPrimid(Integer primid) {
		this.primid = primid;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column friend.guestid
	 * @return  the value of friend.guestid
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public Integer getGuestid() {
		return guestid;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column friend.guestid
	 * @param guestid  the value for friend.guestid
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public void setGuestid(Integer guestid) {
		this.guestid = guestid;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method returns the value of the database column friend.isnew
	 * @return  the value of friend.isnew
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public String getIsnew() {
		return isnew;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method sets the value of the database column friend.isnew
	 * @param isnew  the value for friend.isnew
	 * @ibatorgenerated  Thu Apr 23 16:51:31 CST 2015
	 */
	public void setIsnew(String isnew) {
		this.isnew = isnew;
	}

	private User guestUser;
    
    
    
    public User getGuestUser() {
		return guestUser;
	}

	public void setGuestUser(User guestUser) {
		this.guestUser = guestUser;
	}
}