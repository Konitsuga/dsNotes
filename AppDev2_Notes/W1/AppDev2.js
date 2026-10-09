console.log('logged from console');

// * can convert string to number, but + can't
console.log('130'*2);           //-> 260 number
console.log(2+3*4);             //-> 14 number
console.log(9 + 7);             //-> 16 number
console.log('9' + 7);           //-> 97 string
console.log('9' + '7');         //-> 97 string
console.log(('9' + '7')*2);     //-> 194 number
let message = 'hello'; 
console.log(message);           //-> hello string

//
message = 'reassignment works but not re-declaration of let in JS'
console.log(message)
// 
let Message;
Message = 'hello2';
console.log(Message);

// null refers to an empty object. Similar to None in Python.
let value = null;
console.log(value);

// undefined refers to the variable whose value is not assigned.
let val;
console.log(val);
// same as val
let val2 = undefined;
console.log(val2)

// Number(x) converts string x into numeric 
let val3 = '123.32';
console.log(Number(val3)*3)

//
const pi = 3.14;
console.log(pi);
// Neither reassignment nor redclaration works in const in JS
// value of a const keyword can neither be null nor undefined
// const var1 = 'const key2'
// console.log(var1);

// var - another keyword to declare variables. Very old way. Error-prone
var message3 = 'Hello from var';
console.log(message3);

// let and const keywords can be contained in a block whereas var can't be.
// There are simple blocks, ifelse-blocks and loop-blocks
let val4 = 10;
{
    console.log(val4);
    let val5 = 20;
    console.log(val5);
    const val6 = 30;
    console.log(val6)
    var val7 = 40;
    console.log(val7); 
}
// console.log(val5);      // will give error
// console.log(val6);     // will give error
console.log(val7);       // will NOT give error 

// (true, float(except 0), integer(except 0), non-empty string) -> truthy
// (false, null, undefined, 0, "", NaN) -> falsy
// == (equal sign); === (strictly equal sign, checks for typeof the object);
console.log(Boolean('0'))       //-> true
console.log(Boolean(0))         //-> false
console.log('3' == 3)           //-> true
console.log('3' === 3)          //-> false
console.log(('3' + '2') === 5)    // true
console.log(('3' * '2') === 6)    // false ->CHECK why line 67 and 68 different
console.log('3'+'2')              // -> 32 string
console.log(5)                    // -> 5 number
console.log(('3'+2)*2)                  // -> 64 number
console.log(('3' + '2') === 5)
console.log(('3' * 2) === 6)

// null -> explicitly assigned to variable to represent 'no value'
// undefined -> when variable has been declared but hasn't been assigned a value
console.log(null == undefined);     //-> true
console.log(null === undefined);    //-> false

//functions
//const is the standard for fuctions.
function add1(a, b) {  //this and the let fnxn can be redefined.
    return a * b;
}
//
function add1(a, b) { // redefined like this
    return a+b
}
//
const add2 = function(a, b) { //const fnxn can't be redefined.
    return a + b
}
//
const add3 = (a, b) => a+b; //single-line. (=> means fnxn)
const add4 = (a, b) => {    //multi-line
    if (true) {
        return a+b
    }
}
console.log(add1(3, 8))
console.log(add2(3, 9))
console.log(add3(3, 10)) 
console.log(add3(3, 11)) 

//paranthesis of a function is called function-scope
//variable inside the function-scope will not leak outside even if declared by var keyword

//reference error
{let x1=23;}
// console.log(x1)      // gives reference error
//undefined error
let x2;
console.log(x2)     // gives undefined error

//2nd inconsistency of var (1st one is the block-leakage):
//Gives undefined error when used var, but should give reference Error as 
//other keywords(let and const) do.
console.log(val8);      
var val8 = 121;