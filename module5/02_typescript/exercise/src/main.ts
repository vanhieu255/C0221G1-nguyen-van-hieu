function fibo(number: number):number{

    if(number<0){
        return -1;
    }else if(number==0||number==1)
        return number;
    else {
        return fibo(number-1)+fibo(number-2);
    }
}

let sum=0;
for(let i=0;i<10;i++){
    sum+=fibo(i);
}
console.log("tong day so fibonacci :"+sum);




