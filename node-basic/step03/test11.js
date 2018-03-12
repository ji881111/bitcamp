function fn(){
    console.log('okok')
}

fn.user = "홍길동";
fn.age=20;
fn.plus=function(a,b){
    console.log(a+b);
};

fn();

console.log(fn.user);
console.log(fn.age);
fn.plus(10,20);

//함수도 객체, 함수는 호출할 수도 있고 일반 객체처럼 사용 가능함