package com.app.nre.function;

import com.app.nre.model.PerformanceAppraisal;
import com.app.nre.model.Organization;
import com.app.nre.model.Training;
import com.app.nre.model.EmployeePersonalInfo;
import com.app.nre.model.EmlpoyeeProfile;




import com.app.nre.enums.EmploymentType;
import com.app.nre.enums.OrgDept;
import com.app.nre.enums.TrainingLevel;
import com.app.nre.enums.OrgBranch;
import com.app.nre.converter.OrgBranchConverter;
import com.app.nre.converter.TrainingLevelConverter;
import com.app.nre.converter.EmploymentTypeConverter;
import com.app.nre.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  