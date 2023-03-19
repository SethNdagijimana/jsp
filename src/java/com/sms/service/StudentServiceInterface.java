/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.service;

import com.stud.model.StudentJspModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author hnjej
 */
public interface StudentServiceInterface extends Remote {

    public void saveStudent(StudentJspModel student) throws RemoteException;

    public void updateStudent(StudentJspModel student) throws RemoteException;
    public void deleteStudent(StudentJspModel student) throws RemoteException;

    public List<StudentJspModel> getStudents() throws RemoteException;
    public StudentJspModel getStudent(String email) throws RemoteException;
}
