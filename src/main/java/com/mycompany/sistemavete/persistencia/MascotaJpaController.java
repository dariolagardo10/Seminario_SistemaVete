/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavete.persistencia;

import com.mycompany.sistemavete.logica.Cliente;
import com.mycompany.sistemavete.logica.Mascota;
import com.mycompany.sistemavete.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Dario
 */
public class MascotaJpaController implements Serializable {

  

    
    public MascotaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
      public MascotaJpaController() {
        this.emf =Persistence.createEntityManagerFactory("VeterinariaPU") ;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Mascota mascota) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(mascota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Mascota mascota) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            mascota = em.merge(mascota);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = mascota.getId_Mascota();
                if (findMascota(id) == null) {
                    throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Mascota mascota;
            try {
                mascota = em.getReference(Mascota.class, id);
                mascota.getId_Mascota();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mascota with id " + id + " no longer exists.", enfe);
            }
            em.remove(mascota);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
public void destroyByClienteId(int clienteId) throws NonexistentEntityException {
    EntityManager em = null;
    try {
        em = getEntityManager();
        em.getTransaction().begin();

        // Encuentra todas las mascotas asociadas con el clienteId
        List<Mascota> mascotas;
        try {
            mascotas = em.createQuery("SELECT m FROM Mascota m WHERE m.unDuenio.id_cliente = :clienteId", Mascota.class)
                         .setParameter("clienteId", clienteId)
                         .getResultList();
        } catch (NoResultException nre) {
            throw new NonexistentEntityException("No mascotas found for cliente with id " + clienteId, nre);
        }

        // Si no se encuentran mascotas, lanza una excepción
        if (mascotas.isEmpty()) {
            throw new NonexistentEntityException("No mascotas found for cliente with id " + clienteId);
        }

        // Elimina cada mascota encontrada
        for (Mascota mascota : mascotas) {
            em.remove(mascota);
        }

        // Ahora eliminamos al cliente
        Cliente cliente = em.find(Cliente.class, clienteId);
        if (cliente != null) {
            em.remove(cliente);
        } else {
            throw new NonexistentEntityException("Cliente with id " + clienteId + " not found.");
        }

        em.getTransaction().commit();

        // Mensaje de éxito
        System.out.println("Cliente y mascotas asociadas eliminadas exitosamente.");

    } finally {
        if (em != null) {
            em.close();
        }
    }
}


    public List<Mascota> findMascotaEntities() {
        return findMascotaEntities(true, -1, -1);
    }
public List<Mascota> findMascotaEntities(int id) {
    EntityManager em = getEntityManager();
    try {
        // Utiliza una consulta para obtener todas las mascotas por unduenio_id_cliente
        return em.createQuery("SELECT m FROM Mascota m WHERE m.unDuenio.id_cliente = :id", Mascota.class)
                 .setParameter("id", id)
                 .getResultList();
    } finally {
        em.close();
    }
}


    public List<Mascota> findMascotaEntities(int maxResults, int firstResult) {
        return findMascotaEntities(false, maxResults, firstResult);
    }

    private List<Mascota> findMascotaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Mascota.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Mascota findMascota(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Mascota.class, id);
        } finally {
            em.close();
        }
    }

    public int getMascotaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Mascota> rt = cq.from(Mascota.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    //para tarer una mascota o una lista de mascota con un nombre
    public List<Mascota> findMascotasPorNombre(String nombre) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT m FROM Mascota m WHERE m.nombre = :nombre");
            query.setParameter("nombre", nombre);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

}
