// 함수멤버와 prototype멤버


function Calculator(){
    this.result = 0;
}

Calculator.prototype.plus = function(value) {
    this.result += value;
};

Calculator.prototype.minus = function(value) {
    this.result -= value;
};

// Calculator.plus(10); 오류임

var c1 = new Calculator();
c1.plus(10); //인스턴스 만들고 호출 해야함.


Calculator.abs = function(value){
  return(value < 0) ? value * -1 : value;  
};

console.log(Calculator.abs(-100))
console.log(Calculator.abs(100))