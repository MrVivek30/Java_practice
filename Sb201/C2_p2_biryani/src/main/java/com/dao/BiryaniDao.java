package com.dao;

import java.util.List;

import com.dto.ChickenBiryani;
import com.dto.VegBiryani;
import com.exception.BiryaniException;

public interface BiryaniDao {

	public VegBiryani insertVegBiryani(VegBiryani vegBiryani) throws BiryaniException;

	public ChickenBiryani insertChickenBiryani(ChickenBiryani chickenBiryani) throws BiryaniException;

	public VegBiryani getVegBiryani(int id) throws BiryaniException;

	public ChickenBiryani getChickenBiryani(int id) throws BiryaniException;

	public List<ChickenBiryani> getAllChickenBiryanis() throws BiryaniException;

	public List<VegBiryani> getallVegBiryanis() throws BiryaniException;

	public List<ChickenBiryani>getAllChickenWhosepriceis()throws BiryaniException;
	
}
