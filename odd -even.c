#include<stdio.h>
#include<conio.h>
void main()
{
    int i,number;
    printf("Enter a number:");
    scanf("%d",&number);
    if(number==0)
    printf("the given number is neither even nor odd");
    else if(number%2==0)
    printf("the given number is even ");
    else
    printf("the given number is odd");
}
