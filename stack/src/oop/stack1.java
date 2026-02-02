package oop;

public class stack1 {
    int s[]=new int[10];
    int tos;

    stack1(){
        tos=-1;
    }
    public void push(int item){
        if(tos==9){
            System.out.println("stack is full");
        }
        else {
            s[++tos] = item;
        }
    }
    int pop(){
        if(tos>=0) {
            int i = s[tos--];
            return i;
        }
        else{
            System.out.println("stack is empty");
            return -1;
        }
    }
}
