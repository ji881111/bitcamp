//JSON(javaScript Object Notation)

var obj={
        name:"홍길동",
        "age":20,
        'tel':'111-1111'
};

console.log(obj);

var jsonStr = '{"name":"홍길동","age":20,"tel":"111-1111"}';

//json은 문자열임

var jsonStr2=JSON.stringify(obj);
console.log(jsonStr);
console.log(jsonStr2);

