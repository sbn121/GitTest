package pack04.db;

//A : MySql�� �̿��ؼ� Database �۾�
public class MysqlDAO implements DataAccessObject{

	@Override
	public void select() {
		System.out.println(IP+"�� �����ؼ� Mysql Select");
	}

	@Override
	public void insert() {
		System.out.println(IP+"�� �����ؼ� Mysql Insert");
	}

	@Override
	public void update() {
		System.out.println(IP+"�� �����ؼ� Mysql Update");
	}

	@Override
	public void delete() {
		System.out.println(IP+"�� �����ؼ� Mysql Delete");
	}

}
