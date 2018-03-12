//객체와 for문


var obj = {
  name:"홍길동",
  age:20,
  kor:100,
  eng:100,
  math:100
};

for(var i in obj){
    console.log(obj[i]);
}

console.log("----------------------------------");

//배열이 오면 인덱스
//객체가 오면 프로퍼티이름