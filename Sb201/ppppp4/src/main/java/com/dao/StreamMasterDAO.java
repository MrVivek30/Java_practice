package com.dao;

import java.util.Date;
import java.util.List;

import com.dto.Subscription;

public interface StreamMasterDAO {
	Subscription findSubscriptionById(int id)  ;

	List<Subscription> findSubscriptionsByName(String name) ;

	String saveSubscription(Subscription subscription);

	String deleteSubscriptionById(int id)          ;

	String updatePrice(int new_price, int id)  ;
	// Replacing the existing price with the new price for the particular subscription 
  // having given id		

	String extendSubscription(int extra_days, int id)  ;
// Add the extra_days to the end_date for the particular subscription 
	// having given id

	String updatePlanName(String new_plan_name, int id);
	// Update the plan_name for the particular subscription
	// having given id

	List<Subscription> findSubscriptionsByPlan(String plan_name) ;
	// Retrieve all subscriptions with the given plan_name

	List<Subscription> findSubscriptionsByDateRange(Date start_date, Date end_date);
	// Retrieve all subscriptions that fall within the specified date range
}