package org.bardframework.crud.sample.employee;

import org.bardframework.crud.sample.common.SampleRepositoryTestAbstract;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class EmployeeRepositoryTest extends SampleRepositoryTestAbstract<EmployeeModel, EmployeeCriteria, EmployeeRepository, EmployeeDataProvider> {

    @Override
    public void testGetOne() {

    }
}