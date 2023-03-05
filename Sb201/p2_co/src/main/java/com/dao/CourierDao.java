package com.dao;

import com.dto.Shipment;

public interface CourierDao {
public Shipment findShipmentById(int shipmentId);
public Shipment createNewShipment(Shipment shipment);
public Shipment deleteShipmentById(int shipmentId);
public Shipment updateShipmentById(int shipmentId,String content,double weight,String recipientAddress);

}
