package crud.dataoptation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Hiber {
	
	EntityManagerFactory e = Persistence.createEntityManagerFactory("student");
	EntityManager m= e.createEntityManager();
	EntityTransaction t = m.getTransaction();
	
	public void addDetail(Student s)
	{
		t.begin();
		m.persist(s);
		t.commit();
	}
	
	public void update( int id , String add)
	{
		Student s = m.find(Student.class, id);
		s.setAddress(add);
		t.begin();
		m.merge(s);
		t.commit();
		
	}
	
	public  void  delete(Student s ) {
		t.begin();
		m.remove(s);
		t.commit();
	}
	
	public void name() {
		
	}

	public void finddata(int id) {
		
		m.find(String.class, id);
		
		
		
	}

	

}
