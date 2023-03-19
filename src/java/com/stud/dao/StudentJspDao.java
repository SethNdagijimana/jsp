/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stud.dao;

import com.stud.model.StudentJspModel;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author sethr
 */
public class StudentJspDao {
    
    public void saveStudent(StudentJspModel students){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ss.beginTransaction();
        ss.save(students);
        ts.commit();
        ss.close();
        
    }
    public void updateStudent(StudentJspModel students){
       Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ss.beginTransaction();
        ss.update(students);
        ts.commit();
        ss.close();
    }
     public List<StudentJspModel> findAll(){
          Session session = null;
          List<StudentJspModel> result =  new ArrayList<>();
          
          try{
              session = HibernateUtil.getSessionFactory().openSession();
              result = session.createQuery("from StudentJspModel").list();
          }catch(HibernateException ex){
              
          }finally{
              if(session !=null){
                  session.close();
              }
          }
          
          return result;
     }
    
    public void deleteStudent(StudentJspModel student){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction ts = ss.beginTransaction();
        ss.delete(student);
        ts.commit();
        ss.close();
    }
    
    public StudentJspModel findStudentByEmail(String email){
          Session ss = HibernateUtil.getSessionFactory().openSession();
        String query = "from StudentJspModel where email = :email";
       Query usr;
        usr = ss.createQuery(query);
        
          usr = ss.createQuery(query);
        usr.setParameter("email", email);
        
        StudentJspModel sign = (StudentJspModel) usr.uniqueResult();
        
        return sign;
            
    }
}
