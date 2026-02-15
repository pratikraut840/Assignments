/*1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
marks [75, 80, 82] Add 10 marks to each students using assignment operators and
store it into another array, after adding 10 marks identify the average marks of all
students

Expected Output:
Updated Marks:
Suresh: 85
Mahesh: 90
Naresh: 92
Average Marks: 89.0
*/

// 1. Create two arrays to store student names and marks
const studentNames: string[] = ['Suresh', 'Mahesh', 'Naresh'];
const studentMarks: number[] = [75, 80, 82];

// 2: Create variables for updated marks & total
let updatedMarks: number[] = []; //updatedMarks → stores marks after adding 10
let marks: number | undefined;
let total: number = 0; // total → used to calculate average

//3. Add 10 marks to each student using assignment operator
for (let i = 0; i < studentMarks.length; i++) {

    // Store current mark in temporary variable
    marks = studentMarks[i];

    /// add marks using assignment operator
    marks = marks + 10;

    // Store updated marks in new array using indexing
    updatedMarks[i] = marks;

    // Print updated marks for each student
    console.log(studentNames[i] + ":" + updatedMarks[i]);

    // Add marks to total for average calculation
    total = total + marks;
}

// 4: Calculate Average Marks
const avgMarks: number = total / updatedMarks.length;
console.log("Average marks of all student is :" + avgMarks.toFixed(1));