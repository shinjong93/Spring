package ./바탕화면/School/Spring/1.1

public class main{

public static void main(String[] args) throws ClassNotFoundException, SQLException{
	UserDAO dao = new UserDAO();

	User user = new User();
	user.setId("whiteShip");
	user.setName("백선기");
	user.setPassword("married");

	dao.add(user);

	System.out.println(user.getId() + "   등록 성공");

	User user2 = dao.get(user.getId());
	System.out.println(user2.getName());
	System.out.println(user2.getPassword());

	System.out.println(user2.getId() + "   조회 성공");

}
}
