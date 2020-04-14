// EXPLANATION:
// Array.reduce takes an array and compute the results of the elements base on the operator that you defined

// From MDN Web Docs:
// The reduce() method executes a reducer function (that you provide) on each element of the array, resulting in a single output value.
// The reducer function takes four arguments:

// Accumulator (acc)
// Current Value (cur)
// Current Index (idx)
// Source Array (src)

// Accumulator is used to contain the result from the computation in the array and returned as the final result.

// Current Value is the current element in the array when the function iterates through the array.
// During the first iteration of reduce, two scenarios can happen: 

// 1. No initial value is specified:
// The current value will always be the second element(index 1) of the array unless a initial value or an index is specified. 
// The accumulator will be assigned to the first element of the array (index 0).

// 2. An initial value is specified:
// The current value will be 'pointing' to the first element of the array instead (index 0).
// The accumulator will be assigned with the initial value defined.

// Referenced from: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/Reduce

function simpleArraySum(ar) {
  return ar.reduce((accumulator, currentNumber) => {
    return accumulator + currentNumber;
  })
}
