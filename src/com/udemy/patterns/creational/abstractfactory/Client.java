package com.udemy.patterns.creational.abstractfactory;

import com.udemy.patterns.creational.abstractfactory.instance.Instance;
import com.udemy.patterns.creational.abstractfactory.instance.Instance.Capacity;
import com.udemy.patterns.creational.abstractfactory.storage.Storage;

public class Client {

    public static void main(String[] args) {
        
        Client awsClient = new Client();
        Instance awsServerInstance = awsClient.createServer(new AwsResourceFactory(Capacity.MICRO, 20480));
        awsServerInstance.start();
        awsServerInstance.stop();
        
        Client gcpClient = new Client();
        Instance gcpServerInstance = gcpClient.createServer(new GoogleCloudResourceFactory(Capacity.SMALL, 40960));
        gcpServerInstance.start();
        gcpServerInstance.stop();
    }
    
    public Instance createServer(AbstractResourceFactory resourceFactory) {
        Instance instance = resourceFactory.createInstance();
        Storage storage = resourceFactory.createStorage();
        instance.attachStorage(storage);
        return instance;
    }
    
}
