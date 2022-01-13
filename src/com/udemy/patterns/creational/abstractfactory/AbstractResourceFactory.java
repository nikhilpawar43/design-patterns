package com.udemy.patterns.creational.abstractfactory;

import com.udemy.patterns.creational.abstractfactory.instance.Instance;
import com.udemy.patterns.creational.abstractfactory.storage.Storage;

public interface AbstractResourceFactory {
    
    Instance createInstance();
    Storage createStorage();
}
