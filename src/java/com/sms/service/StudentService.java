/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;


import com.stud.dao.StudentJspDao;
import com.stud.model.StudentJspModel;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author hnjej
 */
public class StudentService extends UnicastRemoteObject implements StudentServiceInterface {

    StudentJspDao studentDao = new StudentJspDao();

    public StudentService() throws RemoteException {
        super();
    }

    @Override
    public void saveStudent(StudentJspModel student) throws RemoteException {
//        studentDao.createStudent(student);
          studentDao.saveStudent(student);
    }

    @Override
    public void updateStudent(StudentJspModel student) throws RemoteException {
        studentDao.updateStudent(student);
    }

    @Override
    public List<StudentJspModel> getStudents() throws RemoteException {
        return studentDao.findAll();
    }

    @Override
    public void deleteStudent(StudentJspModel student) throws RemoteException {
       studentDao.deleteStudent(student);
    }

    @Override
    public StudentJspModel getStudent(String email) throws RemoteException {
        return studentDao.findStudentByEmail(email);
    }

}
