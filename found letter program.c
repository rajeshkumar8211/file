#include<stdio.h>
#include<conio.h>
void main()
{
    char i,ch[5];
    printf("enter a name:");
    scanf("%s",ch);
    printf("%s",ch);
    for(i=0;i<5;i++)
    if(ch[i]=="m")
    {
        printf("\n m is found");
    }
    else
    {
        printf("\n m is not found");
    }
}
