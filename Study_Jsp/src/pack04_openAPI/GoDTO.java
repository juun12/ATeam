package pack04_openAPI;

public class GoDTO {
	private String title;
	private String location;
	private String tel;
	private String menu;
	private int num;

	public GoDTO(String title, String location, String tel, String menu, int num) {
		super();
		this.title = title;
		this.location = location;
		this.tel = tel;
		this.menu = menu;
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
