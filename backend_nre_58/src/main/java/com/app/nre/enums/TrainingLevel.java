package com.app.nre.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum TrainingLevel{
	    Level1,
	    Level2,
	    Management,
	    DeliveryManagement; 
    public int value(TrainingLevel trainingLevel) {
        return trainingLevel.ordinal();
    }
    public static TrainingLevel getTrainingLevel(int ordinal) {
        for(TrainingLevel trainingLevel : TrainingLevel.values())
                if(trainingLevel.ordinal() == ordinal)
                        return trainingLevel;
        return null;
    }
}


