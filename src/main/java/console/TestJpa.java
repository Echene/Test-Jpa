package console;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Livre;

/**
 * 
 */

/**
 * @author Emmanuel
 *
 */
public class TestJpa {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestJpa.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = emf.createEntityManager();
		
		Livre livre = em.find(Livre.class, 1);
		
		if (livre != null) {
			LOGGER.info(livre.getAuteur());
		}
		
		TypedQuery<Livre> tQuery = em.createQuery("SELECT l FROM livre l WHERE TITRE=:titre", Livre.class);
		tQuery.setParameter("titre", "Germinal");
		
		try {
			
			livre = tQuery.getSingleResult();
			
			LOGGER.info(livre.getAuteur());
			
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}

		livre = tQuery.getResultList().get(0);
		
		LOGGER.info(livre.getTitre());
		
		
		em.close();

	}

}
