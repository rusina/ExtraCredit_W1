package mum.edu.control;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class Application {
	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("extraCredit");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {
		createDataBase();
		emf.close();
	
	}

	private static void createDataBase() {
		// TODO Auto-generated method stub
		EntityManager em = null;
		EntityTransaction tx = null;

		try {

			em = emf.createEntityManager();
			tx = em.getTransaction();
			tx.begin();

			// em.persist(flight1);

			tx.commit();

		} catch (PersistenceException e) {
			if (tx != null) {
				// logger.error("Rolling back", e);
				tx.rollback();
			}
		} finally {
			if (em != null) {
				em.close();
			}
		}
	}
}