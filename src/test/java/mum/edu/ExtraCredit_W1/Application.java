package mum.edu.ExtraCredit_W1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Application 
    extends TestCase
{
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

		fillDatabase();
		emf.close();
	}

	private static void fillDatabase() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();

		// TODO your code
			
			tx.commit();
		} catch (Throwable e) {
			if ((tx != null) && (tx.isActive())) tx.rollback();
		} finally {
			if ((em != null) && (em.isOpen())) em.close();
		}
	}

    public static Test suite()
    {
        return new TestSuite( Application.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
