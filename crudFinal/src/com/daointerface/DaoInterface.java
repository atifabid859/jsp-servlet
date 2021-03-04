package com.daointerface;

import java.util.List;

import com.bean.BeanClass;

public interface DaoInterface {

	int save(BeanClass b);

	List<BeanClass> getDisplay();

}
