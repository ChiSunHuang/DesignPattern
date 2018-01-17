package proxy.protect;

public class PersonBeanImpl implements PersonBean {
	String name;
	double rating;
	String pwd;
	
	public PersonBeanImpl(String name, double rating, String pwd) {
		super();
		this.name = name;
		this.rating = rating;
		this.pwd = pwd;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getRating() {
		// TODO Auto-generated method stub
		return rating;
	}

	@Override
	public String getPwd() {
		// TODO Auto-generated method stub
		return pwd;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public void setRating(double rating) {
		// TODO Auto-generated method stub
		this.rating = rating;
	}

	@Override
	public void setPwd(String pwd) {
		// TODO Auto-generated method stub
		this.pwd = pwd;
	}

}
