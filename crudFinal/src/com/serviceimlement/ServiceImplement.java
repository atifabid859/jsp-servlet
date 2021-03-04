package com.serviceimlement;

import java.util.List;

import com.bean.BeanClass;
import com.daoimplement.DaoImplement;
import com.daointerface.DaoInterface;
import com.serviceinterface.ServiceInterface;

public class ServiceImplement implements ServiceInterface {
	DaoInterface dao=new DaoImplement();

	@Override
	public int save(BeanClass b) {
		
		return dao.save(b);
	}

	@Override
	public List<BeanClass> getDispaly() {
		return dao.getDisplay();
	}

}
