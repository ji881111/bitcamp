//JSON(javaScript Object Notation)

var obj={
        name:"홍길동",
        "age":20,
        'tel':'111-1111'
};

console.log(obj);

var jsonStr = '{"name":"홍길동","age":20,"tel":"111-1111"}';

//json은 문자열임

var obj=JSON.parse(jsonStr);

console.log(obj.name);
console.log(obj.age);
console.log(obj.tel);


