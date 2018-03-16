package console;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import model.Emprunt;
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
		
		TypedQuery<Livre> tQuery = em.createQuery("SELECT l FROM Livre l WHERE TITRE=:titre", Livre.class);
		tQuery.setParameter("titre", "Germinal");
		
		try {
			
			livre = tQuery.getSingleResult();
			
			LOGGER.info(livre.getAuteur());
			
		} catch (Exception e) {
			LOGGER.info(e.getMessage());
		}

		livre = tQuery.getResultList().get(0);
		
		LOGGER.info(livre.getTitre());
		
		// *************** TP 3 ***************

		LOGGER.info("");
		LOGGER.info("********** TP 3 **********");
		LOGGER.info("");
		
		TypedQuery<Emprunt> queryEmprunts = em.createQuery("SELECT e FROM Emprunt e", Emprunt.class);
		
		List<Emprunt> emprunts = queryEmprunts.getResultList();
		
		for(Emprunt e: emprunts) {
			
			LOGGER.info("Emprunt : " + e.getId());
			
			for(Livre l: e.getLivres()) {
				LOGGER.info("Livre : " + l.getTitre());
			}
			
			LOGGER.info("");
			LOGGER.info("****************");
			LOGGER.info("");
		}
		
		em.close();

	}

}
