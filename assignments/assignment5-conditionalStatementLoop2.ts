//Assignment (Conditional Statements & Loops)

// Interface representing structure of each employee record
interface EmployeeTable {
    name: string;          // Employee Name
    baseSalary: number;    // Base Salary of employee
    experience: number;    // Years of experience
    rating: number;        // Year-End performance rating (Out of 5)
}

// Array containing all employee records
const employees: EmployeeTable[] = [
    { name: 'Alice Johnson', baseSalary: 75000.0, experience: 5.1, rating: 4.2 },
    { name: 'Bob Smith', baseSalary: 68000.0, experience: 3.2, rating: 3.8 },
    { name: 'Carol Davis', baseSalary: 82000.0, experience: 7.1, rating: 4.5 },
    { name: 'David Brown', baseSalary: 90000.0, experience: 10.2, rating: 2.5 },
    { name: 'Eva Green', baseSalary: 60000.0, experience: 2.4, rating: 3.5 }
]

/// Variables used to calculate hike components
let variablePay: number = 0;   // Percentage of base salary
let bonus: number = 0;         // Fixed bonus amount
let reward: number = 0;        // Extra reward for experience >= 5 years

// Map to store Employee Name as key and Hike Percentage as value
let hikeMap: Map<string, number> = new Map();

/// Loop through each employee record
for (let employee of employees) {

    //Determine variable pay percentage and bonus based on employee rating
    if (employee.rating <= 3) {
        variablePay = 3.0;
        bonus = 1500;
    } else if (employee.rating >= 3 && employee.rating <= 4) {
        variablePay = 10.0;
        bonus = 1200;
    } else {
        variablePay = 15.0;
        bonus = 300;
    }

    //Check eligibility for extra reward
    if (employee.experience >= 5) {
        reward = 5000;
    }

    // Calculate total hike amount
    const hike: number = (employee.baseSalary * (variablePay / 100) + bonus + reward);

    //Calculate hike percentage
    const hikePercent: number = hike / employee.baseSalary;

    //Store result in Hike Map
    hikeMap.set(employee.name, hikePercent);
}

/// Print hike percentage for each employee
for (let [key, value] of hikeMap) {
    console.log(`The hike percent for ${key} : ${(value * 100).toFixed(2)}%`);
}