package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("project_Jpa");
        EntityManager em = emf.createEntityManager();

        Usuario newUser = new Usuario("Djalma", "djalma@lanche.com.br");

        em.getTransaction().begin();
        em.persist(newUser);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
