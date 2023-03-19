package com.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.model.Developer;
import com.model.Project;

public class DeveloperService {
	// inject 3 entries with valid details 
	private Map<Developer, Project> projectMap;

	
	// inject List of 5 Developer object
	
	private List<Developer> developerList;
	
	public void printProjectMap(){
			//print all the developers and their skill details from the projectMap

		for (Map.Entry<Developer,Project> entry : projectMap.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		System.out.println();
	}
	
	public void printDeveloperList(){
			// sort the List of Developers according to the decreasing order of the noOfProjects Done 
			// If No of the project are same then sort by age
			// print all the sorted Developer Details

//		Collections.sort(developeśList, (a,b)->{
//			return (a.getNoofprojectdone()==b.getNoofprojectdone())? a.getAge()-b.getAge():b.getNoofprojectdone();
//		});
//		
	Comparator<Developer>comparator=new Comparator<Developer>() {

		@Override
		public int compare(Developer o1, Developer o2) {
			// TODO Auto-generated method stub
			
			if(o1.getNoofprojectdone()>o2.getNoofprojectdone()) {
				return -1;
			}else if (o1.getNoofprojectdone()<o2.getNoofprojectdone()) {
				return 1;
			}else if (o1.getAge()>o2.getAge()) {
				return 1;
			} else {
				return-1;

			}
			
		}
		};	
		
		Collections.sort(developerList, comparator);
		System.out.println(developerList);
	}

	public DeveloperService(Map<Developer, Project> projectMap, List<Developer> developerList) {
		super();
		this.projectMap = projectMap;
		this.developerList = developerList;
	}

	public DeveloperService() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DeveloperService [projectMap=" + projectMap + ", developerList=" + developerList + "]";
	}

	public Map<Developer, Project> getProjectMap() {
		return projectMap;
	}

	public void setProjectMap(Map<Developer, Project> projectMap) {
		this.projectMap = projectMap;
	}

	public List<Developer> getDeveloperList() {
		return developerList;
	}

	public void setDeveloperList(List<Developer> developerList) {
		this.developerList = developerList;
	}
}
