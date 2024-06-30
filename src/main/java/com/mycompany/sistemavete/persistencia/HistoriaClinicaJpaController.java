/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavete.persistencia;

import com.mycompany.sistemavete.logica.HistoriaClinica;
import com.mycompany.sistemavete.logica.Mascota;
import com.mycompany.sistemavete.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class HistoriaClinicaJpaController implements Serializable {

    public HistoriaClinicaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

      public HistoriaClinicaJpaController() {
        this.emf =Persistence.createEntityManagerFactory("VeterinariaPU") ;
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(HistoriaClinica historiaClinica) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(historiaClinica);
            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Historua Clinica Creada");
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(HistoriaClinica historiaClinica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            historiaClinica = em.merge(historiaClinica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = historiaClinica.getId();
                if (findHistoriaClinica(id) == null) {
                    throw new NonexistentEntityException("The historiaClinica with id " + id + " no longer exists.");
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
            HistoriaClinica historiaClinica;
            try {
                historiaClinica = em.getReference(HistoriaClinica.class, id);
                historiaClinica.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The historiaClinica with id " + id + " no longer exists.", enfe);
            }
            em.remove(historiaClinica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<HistoriaClinica> findHistoriaClinicaEntities() {
        return findHistoriaClinicaEntities(true, -1, -1);
    }

    public List<HistoriaClinica> findHistoriaClinicaEntities(int maxResults, int firstResult) {
        return findHistoriaClinicaEntities(false, maxResults, firstResult);
    }

    private List<HistoriaClinica> findHistoriaClinicaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(HistoriaClinica.class));
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

    public HistoriaClinica findHistoriaClinica(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(HistoriaClinica.class, id);
        } finally {
            em.close();
        }
    }

    public int getHistoriaClinicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<HistoriaClinica> rt = cq.from(HistoriaClinica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

      public List<HistoriaClinica> traerHistoriasClinicasPorNombreMascota(String nombreMascota) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<HistoriaClinica> query = em.createQuery(
                "SELECT h FROM HistoriaClinica h WHERE h.mascota.nombre = :nombreMascota", HistoriaClinica.class);
            query.setParameter("nombreMascota", nombreMascota);
            return query.getResultList();
        } finally {
            em.close();
        }
    }
    public HistoriaClinica buscarHistoriaClinicaPorMascotaYFecha(Mascota m, Date fecha) {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT h FROM HistoriaClinica h WHERE h.mascota = :mascota AND h.fecha = :fecha");
            query.setParameter("mascota", m);
            query.setParameter("fecha", fecha);
            return (HistoriaClinica) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } finally {
            em.close();
        }
    }

    public void crearHistoriaClinica(HistoriaClinica historia) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(historia);
            em.getTransaction().commit();
        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            em.close();
        }
    }

    public void actualizarHistoriaClinica(HistoriaClinica historia) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(historia);
            em.getTransaction().commit();
        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            em.close();
        }
    }

    public void eliminarHistoriaClinica(HistoriaClinica historia) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            historia = em.merge(historia); // Necesario para asegurar que la instancia está gestionada
            em.remove(historia);
            em.getTransaction().commit();
        } finally {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            em.close();
        }
    }
    
}
