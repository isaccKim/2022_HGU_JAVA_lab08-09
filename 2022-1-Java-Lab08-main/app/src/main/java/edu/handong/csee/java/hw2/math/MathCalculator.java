package  edu.handong.csee.java.hw2.math;    
    /** 
     * This is MathCalculator class 
     */ 
public class MathCalculator{

    private String name;
    /** 
     * This is setName Method
     * @param args 
     */ 
public void setName(String args){
    name = args;
}       
    /** 
     * This is getName  Method 
     * @param args
     * @return String Name;
     */ 
public String getName(){
    return name;
}    
    /** 
     * This is getMax Method 
     * @param args[2]
     * @param args[3]
     * @return
     */ 
public int getMax(int a, int b){
    if(a>b)return a;
    else return b;
}
    /** 
     * This is getMin Method 
     * @param args[2]
     * @param args[3]
     * @return Max value
     */ 
public int getMin(int a, int b){
    if(a<b)return a;    
    else return b;
}
    /** 
     * This is getAbs Method 
     * @param args[2]
     * @return Absolute value
     */    
public int getAbs(int a){
    if (a<0)return a*(-1); 
    else return a;
}
    /** 
     * This is getSum Method 
     * @param args[2]
     * @param args[3]
     * @return Sum value
     */    
public int getSum(int a, int b){
    return a+b;
}
    /** 
     * This is getDiff Method 
     * @param args[2]
     * @param args[3]
     * @return Difference value
     */    
public int getDiff(int a, int b){
     return a-b;
}
    /** 
     * This is getProduct Method 
     * @param args[2]
     * @param args[3]
     * @return Product value 
     */    
public int getProduct(int a, int b){
    return (a*b);
}
    /** 
     * This is getQuotient Method 
     * @param args[2]
     * @param args[3]
     * @return Quotient value
     */    
public int getQuotient(int a, int b){
    if(a == 0 || b ==0) return 0;
    else
    return a/b;
}
    /** 
     * This is getRemainder Method 
     * @param args[2]
     * @param args[3]
     * @return Remainder value
     */    
public int getRemainder(int a, int b){
    if(a == 0 || b ==0) return 0;
    return (a%b);
}
     /** 
     * This is getPower Method 
     * @param args[2]
     * @param args[3]
     * @return Power value
     */   
public int getPower(int a, int b){
    if(b<0)return 0;
    if(b==0)return 1;
    if(b == 1)return a;
    return a * getPower(a, b-1);
}
     /** 
     * This is Factorial Method 
     * @param args[2]
     * @return Factorial value
     */   
public int getFactorial(int a){
    if(a<0)return 0;
    if(a == 0) return 1;
    return a*getFactorial(a-1);
}
    /** 
     * This is getGcd Method 
     * @param args[2]
     * @param args[3]
     * @return Greatest Common Divisor value
     */   
public int getGcd(int a, int b){
    int n = 0;
    if(a == 0 || b == 0)return 0;
    if(a>b) n = a;
    else n= b;
    if(n<=0)n*=-1;
    for(int i=n; i>0; i--){
        if(a%i == 0 && b%i == 0)return i;
    }
    return a*b;
}
    /** 
     * This is getLcm Method 
     * @param args[2]
     * @param args[3]
     * @return Lowest Common Multiple value
     */ 
public int getLcm(int a, int b){
    int min=0;
	if(a <=0 || b <=0) return 0;
    if(a>b) {
        int temp = 0;
        temp  = a;
        a =b;
        b = temp;
    }
    for(int i=1; i<=a; i++) {
        if(b%i==0 && a%i ==0 ) {
            min = i*(a/i)*(b/i);
        }
    }
    if(min !=0)return min;
    else 
    return a*b;
}
    /** 
     * This is getSquare Method 
     * @param args[2]
     * @return Square value
     */ 
public int getSquare(int a){
    return a*a;
}


}