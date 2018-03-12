var obj = new Object(); 

obj.name="홍길동";
obj.age=20;
obj["home tel^^"] ="1111-11111";
obj.plus = function(a,b){
    console.log(a+b)
};

obj.working = false;


if(obj.hasOwnProperty('age')){
    console.log('age 있다')
}

if(obj.hasOwnProperty('tel')){
    console.log('tel 있다')
}

if(obj.age){
    console.log('age 있다')
}

if(obj.working){
    console.log('working 있다')
}

//이 방법은 변수에 대해서 안쓰는게 좋음, 함수의 존재여부를 검사할 때 사용한다.
if(obj.plus){
    obj.plus(10,20)
}

if(obj.minus){
    obj.minus(10,20)
}