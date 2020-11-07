public class Author{
	
	private String Name;
	private String Email;
	private String Gender;
	

	public Author(String Name, String Email, String Gender) {
		setName(Name);
		setEmail(Email);
		setGender(Gender);
	}
	// retorna o firstName
	public String getName() {
		return Name;
	}
	// "seta" o firstName
	public void setName(String Name) {
		this.Name = Name;
	}
	// retorna o lastName
	public String getEmail() {
		return Email;
	}
	// "seta" o lastName
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getGender() {
		return Gender;
	}
	// "seta" o lastName
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
}