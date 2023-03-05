package com.dao;

import javax.persistence.EntityManager;

import com.dto.Shipment;

public class CourierDaoImpl implements CourierDao {

	public Shipment findShipmentById(int shipmentId) {
		EntityManager entityManager=EmUtil.getConnection();
		entityManager.getTransaction().begin();
		Shipment shipment =entityManager.find(Shipment.class, shipmentId);
		if(shipment==null) {
			return null;
		}
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return shipment;
	}

	public Shipment createNewShipment(Shipment shipment) {
		EntityManager entityManager=EmUtil.getConnection();
		entityManager.getTransaction().begin();
		entityManager.persist(shipment);
		entityManager.getTransaction().commit();
		entityManager.close();
		return shipment;
	}

	public Shipment deleteShipmentById(int shipmentId) {
		EntityManager entityManager=EmUtil.getConnection();
		entityManager.getTransaction().begin();
		Shipment shipment =entityManager.find(Shipment.class, shipmentId);
		if(shipment==null) {
			return null;
		}
		entityManager.remove(shipment);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return shipment;
	}

	public Shipment updateShipmentById(int shipmentId, String content, double weight, String recipientAddress) {
		EntityManager entityManager=EmUtil.getConnection();
		entityManager.getTransaction().begin();
		Shipment shipment =entityManager.find(Shipment.class, shipmentId);
		if(shipment==null) {
			return null;
		}
		shipment.setContent(content);
		shipment.setWeight(weight);
		shipment.setRecipientAddress(recipientAddress);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		return shipment;
	}

}
