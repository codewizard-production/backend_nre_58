package com.app.nre.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum OrgBranch{
	    India,
	    UK,
	    Germany,
	    USA; 
    public int value(OrgBranch orgBranch) {
        return orgBranch.ordinal();
    }
    public static OrgBranch getOrgBranch(int ordinal) {
        for(OrgBranch orgBranch : OrgBranch.values())
                if(orgBranch.ordinal() == ordinal)
                        return orgBranch;
        return null;
    }
}


