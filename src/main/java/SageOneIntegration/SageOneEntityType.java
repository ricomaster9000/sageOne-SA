/** "Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements; and to You under the Apache License, Version 2.0. "*/
package SageOneIntegration;


import SageOneIntegration.SageOneApiEntities.SageOneCustomer;
import SageOneIntegration.SageOneApiEntities.SageOneCustomerReturn;
import SageOneIntegration.SageOneApiEntities.SageOneSupplier;
import SageOneIntegration.SageOneApiEntities.SageOneSupplierReturn;

public enum SageOneEntityType {
    CUSTOMER_RETURN("CustomerReturn/Get", SageOneCustomerReturn.class),
    SUPPLIER_RETURN("SupplierReturn/Get", SageOneSupplierReturn.class),
    CUSTOMER("Customer/Get", SageOneCustomer.class),
    SUPPLIER("Supplier/Get", SageOneSupplier.class);

    public SageOneStringAndClassObject GetObject;
    SageOneEntityType(final String entityGetReqParamName, final Class<?> entityGetReqParamClass)  {
        this.GetObject = new SageOneStringAndClassObject(entityGetReqParamName, entityGetReqParamClass);
    }
}
