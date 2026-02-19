/*Assignment1: Write a program to perform the following tasks:
1. Count the total number of words in the sentence.
2. Print the sentence words in reverse order.
3. Convert the first character of each word to uppercase and print original sentence
String sentence = "Java programming is fun and challenging";
*/


let sentence: string = "Java programming is fun and challenging";

// 1. Count the total number of words in the sentence.
const words: string[] = sentence.split(" ");
console.log(`total number of words in the sentence is: ${words.length}`);

//2. Print the sentence words in reverse order.
console.log('originalString: ' + words.join(" "));
let reverseSentence: string = "";
for (let i = words.length - 1; i >= 0; i--) {
    reverseSentence += words[i] + " ";
}
console.log('Reversed sentence: ' + reverseSentence)

//3. Convert the first character of each word to uppercase and print original sentence
let modifiedString: string | undefined = "";
for (let i = 0; i <= words.length - 1; i++) {

    let firstCharacter: string | undefined = words[i]?.charAt(0).toUpperCase();
    let restCharacter: string | undefined = words[i]?.slice(1);

    modifiedString = modifiedString + firstCharacter + restCharacter + " "
}
console.log(modifiedString.trim());

/*
Assignment2: Write a program to search for all occurrences of a “Java” word in the paragraph and print their
indexes.
1. Find total number of occurrences
2. Print count and Indexes of the word
*/
let paragraph: string = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
let splitPara: string[] = paragraph.split(" ");

let searchString: string = "Java";
let occurrencesCount: number = 0;

let indexOfWord: string = "";
// Count occurrences
for (let i = 0; i <= splitPara.length - 1; i++) {
    if (splitPara[i] === searchString) {
        occurrencesCount++
    }
}
console.log(`total number of occurrences of Java word is: ${occurrencesCount}`)

// Count record indexes
for (let i = 0; i <= paragraph.length - 1; i++) {

    if (paragraph.indexOf(searchString, i) === i) {
        occurrencesCount++;
        indexOfWord += i + " ";
    }
}
console.log("index Of Word :" + indexOfWord.trim());

/*
Assignment: Write a program to print * in triangle pattern
1. If I will pass int rows = 5 then it should print triangle with 5 Rows
*
**
***
****
*****
*/

let rows: number = 5;
let star: string | undefined = "";
for (let i = 0; i < rows; i++) {
    star = star + "*"
    console.log(star);
}
