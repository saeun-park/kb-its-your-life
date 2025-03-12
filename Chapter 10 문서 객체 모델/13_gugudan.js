/**
 *
 */
console.clear();

for (let dan = 2; dan <= 9; dan++) {
  console.log(dan);
  console.log('-------------------------------');

  for (let mul = 1; mul <= 9; mul++) {
    console.log(dan + 'x' + mul + '=' + dan * mul);
  }
}
