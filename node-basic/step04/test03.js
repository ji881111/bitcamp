//배열

var arr1 = new Array();

console.log(arr1.length);

arr1[0] = 10;
arr1[1] = 20;

console.log(arr1.length);

arr1[10] = 100;

console.log(arr1.length);

//자바 스크립트의 배열은 자바 언어의 ArrayList 와 유사하다.

arr1[11] = "홍길동";
arr1[12] = true;
arr1[13] = {model:"소나타"};
arr1[14] = function(){console.log("Hello!")};

console.log(arr1);