package com.example.Hibernate_App.dao;

import com.example.Hibernate_App.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class StudentDAO {

    // EntityManagerFactory is a heavy object — created once for the whole app.
    // "myPersistenceUnit" must match the name in persistence.xml exactly.
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistenceUnit");

    //    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ThePersistenceUnit");
    //    EntityManager entityManager = entityManagerFactory.createEntityManager();
    //    EntityTransaction transaction = entityManager.getTransaction();


    // ------------------------------------------------------------------
    // CREATE — Insert a new student row into the "students" table
    // ------------------------------------------------------------------
    public void save(Student student) {
        // EntityManager is a lightweight object — create a new one per operation
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();       // Start the transaction
        em.persist(student);               // INSERT INTO students ...
        em.getTransaction().commit();      // Commit to the database
        em.close();                        // Always close after use

        System.out.println("Saved: " + student);
    }

    // ------------------------------------------------------------------
    // READ — Find a single student by their primary key (id column)
    // ------------------------------------------------------------------
    public Student findById(int id) {
        EntityManager em = emf.createEntityManager();

        // find() does a SELECT WHERE id = ? and returns null if not found
        Student student = em.find(Student.class, id);
        em.close();

        System.out.println("Found: " + student);
        return student;
    }

    // ------------------------------------------------------------------
    // READ ALL — Fetch every row from the "students" table
    // JPQL uses the Entity class name "Student", NOT the table name "students"
    // ------------------------------------------------------------------
    public List<Student> findAll() {
        EntityManager em = emf.createEntityManager();

        List<Student> students = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        em.close();

        System.out.println("All students: " + students);
        return students;
    }

    // ------------------------------------------------------------------
    // UPDATE — Modify an existing student record
    // ------------------------------------------------------------------
    public void update(Student student) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        // merge() checks if the entity exists (by id) and issues an UPDATE
        em.merge(student);
        em.getTransaction().commit();
        em.close();

        System.out.println("Updated: " + student);
    }

    // ------------------------------------------------------------------
    // DELETE — Remove a student row by their id
    // ------------------------------------------------------------------
    public void deleteById(int id) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // Must find the entity first so Hibernate knows what to delete
        Student student = em.find(Student.class, id);
        if (student != null) {
            em.remove(student);            // DELETE FROM students WHERE id = ?
            System.out.println("Deleted student with id: " + id);
        } else {
            System.out.println("No student found with id: " + id);
        }

        em.getTransaction().commit();
        em.close();
    }

    // saveAllStudents(List<Student> students)
    public void saveAllStudents(List<Student> students) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        for (Student student : students) {
            em.persist(student);
            System.out.println("Saved: " + student);
        }

        em.getTransaction().commit();
        em.close();

        System.out.println("All students saved successfully.");
    }

    // ------------------------------------------------------------------
    // CLOSE — Call this when the application shuts down
    // ------------------------------------------------------------------
    public static void closeFactory() {
        if (emf != null && emf.isOpen()) {
            emf.close();
        }
    }
}
