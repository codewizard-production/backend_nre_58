package com.app.nre.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum OrgDept{
	    Developement,
	    InfraInternal,
	    Delivery; 
    public int value(OrgDept orgDept) {
        return orgDept.ordinal();
    }
    public static OrgDept getOrgDept(int ordinal) {
        for(OrgDept orgDept : OrgDept.values())
                if(orgDept.ordinal() == ordinal)
                        return orgDept;
        return null;
    }
}


