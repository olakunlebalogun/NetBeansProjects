/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableproject.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import tableproject.model.Student;

/**
 *
 * @author Olaoluwa
 */
public class AppService {
    //JPA, Native JDBC
    // Crud operation Create, Retrieve, update and Delete
  public static void addStudent(Student st) {
      EntityManagerFactory emp =Persistence.createEntityManagerFactory("jpa");
      EntityManager em =emp.createEntityManager();
      em.getTransaction().begin();
      em.persist(st);
      em.getTransaction().commit();
  } 
  
  public static Student findById(String id){
      EntityManagerFactory emp =Persistence.createEntityManagerFactory("jpa");
      EntityManager em =emp.createEntityManager();
      em.getTransaction().begin();
     Student st = em.find(Student.class, id);
      em.getTransaction().commit();
      return st;
  }
  public static void updateStudent(Student st) {
      EntityManagerFactory emp =Persistence.createEntityManagerFactory("jpa");
      EntityManager em =emp.createEntityManager();
      em.getTransaction().begin();
      em.merge(st);
      em.getTransaction().commit();
  } 
  
  public static String deleteStudent(String studentid) {
      EntityManagerFactory emp =Persistence.createEntityManagerFactory("jpa");
      EntityManager em =emp.createEntityManager();
      em.getTransaction().begin();
     Student st = findById(studentid);
     String resp;
     if(st !=null){
         em.remove(st);
         resp ="Record deleted successfully";
     }else{
         resp ="Record not found";
     }
      em.getTransaction().commit();
      return resp;
  } 
  public static List<Student> listStudent(){
      EntityManagerFactory emp =Persistence.createEntityManagerFactory("jpa");
      EntityManager em =emp.createEntityManager();
      em.getTransaction().begin();
      Query qs =em.createNativeQuery("select * from student", Student.class);
     List<Student> st = qs.getResultList();
      em.getTransaction().commit();
      return st;
  }
  
}
