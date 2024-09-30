package com.app.nre.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum EmploymentType{
	    fullTime,
	    contract,
	    partners,
	    interns; 
    public int value(EmploymentType employmentType) {
        return employmentType.ordinal();
    }
    public static EmploymentType getEmploymentType(int ordinal) {
        for(EmploymentType employmentType : EmploymentType.values())
                if(employmentType.ordinal() == ordinal)
                        return employmentType;
        return null;
    }
}


