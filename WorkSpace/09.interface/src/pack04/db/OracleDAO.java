package pack04.db;

//A : Oracle�� �̿��ؼ� Database �۾�
public class OracleDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println(IP+"�� �����ؼ� Oracle Select");
	}

	@Override
	public void insert() {
		System.out.println(IP+"�� �����ؼ� Oracle Insert");
	}

	@Override
	public void update() {
		System.out.println(IP+"�� �����ؼ� Oracle Update");
	}

	@Override
	public void delete() {
		System.out.println(IP+"�� �����ؼ� Oracle Delete");
	}

}
