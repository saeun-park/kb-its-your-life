// 방법1
let getTriangle = function (base, height) {
  return (base * height) / 2;
};
console.log('삼각형의 면적:' + getTriangle(5, 2));

// 방법2
let getTriangle1 = (base, height) => {
  return (base * height) / 2;
};
console.log('삼각형의 면적:' + getTriangle1(5, 2));

// 방법3
let getTriangle2 = (base, height) => (base * height) / 2;
console.log('삼각형의 면적:' + getTriangle2(5, 2));
