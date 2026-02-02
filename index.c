#include<stdio.h>
#include<conio.h>
void main()
{
    char ch[5],i;
    printf("enter a name:");
    scanf("%s",ch);
    printf("%s",ch);
    for(i=0;i<5;i++)
    printf("%c",ch[i]);
}
