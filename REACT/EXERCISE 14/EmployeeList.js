import React from "react";
import EmployeeCard from "./EmployeeCard";

function EmployeeList() {

    const employees = [
        {
            id: 1,
            name: "Rahul",
            designation: "Software Engineer"
        },
        {
            id: 2,
            name: "Priya",
            designation: "Tester"
        },
        {
            id: 3,
            name: "Karthik",
            designation: "Project Manager"
        }
    ];

    return (
        <div>
            <h2>Employee List</h2>

            {
                employees.map((emp) => (
                    <EmployeeCard
                        key={emp.id}
                        employee={emp}
                    />
                ))
            }

        </div>
    );
}

export default EmployeeList;