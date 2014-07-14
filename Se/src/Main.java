import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;





public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Klient klient;
		SessionFactory sessionFactory =  new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		klient = new Klient();
		klient = (Klient) session.get(Klient.class, "92111107514");
		System.out.print(klient.getImie());
		
	}

	

}
