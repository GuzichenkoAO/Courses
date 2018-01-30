package com.guzichenko.courses.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Worker extends Remote {

	String say() throws RemoteException;
}
