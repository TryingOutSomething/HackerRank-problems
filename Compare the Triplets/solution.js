function compareTriplets(a, b) {
  if (a.length !== b.length) return;

  let result = [0, 0];

  for (let i = 0; i < a.length; i++) {
    if (a[i] < b[i]) result[1]++;
    else if (a[i] > b[i]) result[0]++;
  }

  return result;
}
