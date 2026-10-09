//Hoisting
// When java script is loaded on browser, it retains(initializes or hoists) the `let` and `const` variables with `unavailable value`. If used before line of declaration, it returns `Reference Error`.
// It retains the `var` variable as `undefined`. If used before line of declaraion, it returns `undefined`.
// It retains functions with complete function definitions. If used before line of declaration, it works perfectly fine. 
//variable - keyword  - initialization       - error
// a       - let      - unavailable value    - Reference Error
// b       - const    - unavailable value    - Reference Error 
// c       - var      - undefined            - undefined
// f1      - function - FULL DEFN            - NO ERROR
// console.log(val1);
let a = 'val1';
console.log(a);

// console.log(b);
const b = 'val2';
console.log(b);

console.log(c);
var c = 'val3'
// console.log(c)

console.log(f1())
function f1(){
    return 'fnxn f1'
}
// console.log(f1())

//immediately invoked function expression (iffe)
(()=> {
    console.log('This fnxn gets executed immediately')
})();

//callback function
function greet(name){
    console.log(`hello ${name}`)
}
greet("a")
function callb(test){
    console.log('runnin')
    console.log(test("b"))
    // test("b")
    console.log('finito')
}
// callb(greet)
// callb("c")
// callb(greet)

//Collections - array
// Array
//map
arr1 = [1, 'str1', 'str2', greet];
arr1.map((x) => console.log(typeof(x)))
//
let arr2 = arr1.map((x) => typeof(x));
console.log(arr2)
//find - stops when the first element is found
arr3 = [1, 2, 3, 8, 11]
let find_first = arr3.find((x) => x %2 == 0)
console.log(find_first)
//filter
let fil_arr = arr3.filter((x) => x % 2 != 0)
console.log(fil_arr)
//reduce
let rdce_arr = arr3.reduce((init,  x) => init+x, 2)
console.log(rdce_arr)
//sort - sorts lexicographically
arr4 = [1, 3, 2, 11, 1112, 8]
console.log(arr4.sort())       //[1, 11, 1112, 2, 3, 8]
//
arr4.sort((a, b) => (a-b))  //sorts numerically. The logic is if the returned value(a-b) from the inside fnxn is -ve keep a before b. If a is +ve, put b before a.
console.log(arr4)

//dictionary
let obj1 = {
    "a123" : 123,
    b : "string this is",
    fns : function(){
        console.log("hiello")
        return "hello fnxn in dict"
    },
    fns1: () => {return "hellow from arrow fnxn"},
    fns2: () => {"2nd arrow fnxn"},
    fns3: () => {console.log("3rd arrow fnxn")}
}
console.log(obj1.a123); console.log(obj1["b"]); 
console.log(obj1.fns); console.log(obj1.fns()); obj1.fns
console.log(obj1.fns1); console.log(obj1.fns1())
console.log(obj1.fns2); console.log(obj1.fns2())
console.log(obj1.fns3); console.log(obj1.fns3())

fruit = {
    name: "Apple",
    shape: "Round"
}
let description = ({name, shape='Spherical'}) => {
    console.log(`${name} is ${shape}`)
}
description(fruit)
