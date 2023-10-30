package org.khasanof;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/30/2023 10:10 PM
 */
public class HeadDepartment implements Department {

    private final List<Department> childDepartments = new ArrayList<>();

    @Override
    public void printName() {
        childDepartments.forEach(Department::printName);
    }

    public void addDepartment(Department department) {
        this.childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        this.childDepartments.remove(department);
    }

}
