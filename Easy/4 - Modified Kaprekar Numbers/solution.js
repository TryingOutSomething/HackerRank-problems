// Note: this solution is adapted from the solutions in the discussion page as it is wayyy more elegant compared to mine
// I forgot to save my code as I was stuck at test case 6 where my mistake was not including the upper limit into the for loop.
// I overwritten my code with the adapted solution and still didn't include the upper limit. Once I realised my mistake, it couldn't remember my code lol -_-;
function kaprekarNumbers(p, q) {
  let karprekarNo = "";

  for (let i = p; i <= q; i++) {
    let squaredResultToString = (i * i).toString();
    let firstHalf;
    let secondHalf;
    let midpointIndex = squaredResultToString.length - i.toString().length;

    // Gets the string from the midpoint till the end
    // This method is able to handle cases where the length of the squared value is 1. E.g. 1^2 = 1
    // secondHalf will take the value of '1' while the left side will be an empty string
    secondHalf = squaredResultToString.substring(midpointIndex);

    firstHalf = squaredResultToString.substring(0, midpointIndex);

    // If firstHalf is an empty string, we assing the value 0 to ir
    let sumOfBothHalfs = parseInt(firstHalf || 0) + parseInt(secondHalf);

    if (sumOfBothHalfs !== i) continue;

    karprekarNo += sumOfBothHalfs.toString() + " ";
  }

  console.log(!karprekarNo.length ? "INVALID RANGE" : karprekarNo);
}
