/**
 * 
 */
package banque.console;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import banque.entite.Adresse;
import banque.entite.Banque;
import banque.entite.Client;
import banque.entite.LivretA;
import banque.entite.Virement;
import banque.utils.RandomGenerator;

/**
 * @author Emmanuel
 *
 */
public class TestConsole {

	private static final Logger LOGGER = LoggerFactory.getLogger(TestConsole.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu_banque");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		
		LivretA compte = new LivretA();
		Virement virement;
		Adresse adresse;
		Client client;
		Banque b1 = new Banque("Crédit Agricole");
		Banque b2 = new Banque("BNP");	
		
		em.persist(b1);
		em.persist(b2);
		
		Random r = new Random();		

		for (int i = 1; i <= 10; i++) {
			
			adresse = new Adresse(r.nextInt(100), "Rue", r.nextInt(50000), "Bordeaux");
			
			
			client = new Client(RandomGenerator.generateRandomU(6) + " " + i, RandomGenerator.generateRandomL(6) + " " + i, adresse, b1);
			
			if(i%2 == 1) {
				
				compte = new LivretA(r.nextInt(50000), 100d, 10.0);
				
				int random = r.nextInt(10);
				
				for(int j = 0; j < random; j++) {
					
					virement = new Virement(r.nextInt(1000), "Un motif", "Un bénéficiaire");

					virement.setCompte(compte);
					
					em.persist(virement);
											
				}
				
			}
			
			client.getComptes().add(compte);
			em.persist(compte);
			em.persist(client);
		}
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
