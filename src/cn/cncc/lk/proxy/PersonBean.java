package cn.cncc.lk.proxy;

public interface PersonBean {
	String getName();
	String getInterests();
	int getHotOrNotRating();
	
	void setName(String name);
	void setInterests(String interests);
	void setHotOrNotRating(int rating);
}
