package cn.cncc.lk.proxy;

public class PersonBeanImpl implements PersonBean {

	String name;
	String interests;
	int rating;
	int ratingCount = 0;
	
	public PersonBeanImpl(String name, String interests) {
		super();
		this.name = name;
		this.interests = interests;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getInterests() {
		return interests;
	}

	@Override
	public int getHotOrNotRating() {
		if (ratingCount == 0) {
			return 0;
		} else {
			return rating/ratingCount;
		}
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		this.rating += rating;
		ratingCount++;
	}

}
