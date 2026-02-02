#include <stdio.h>
#include <conio.h>
void main()
{
    int sum,avg,m1,m2,m3,m4,m5;
    printf("Enter a mark1:\n");
    scanf("%d",&m1);
    printf("Enter a mark2:\n");
    scanf("%d",&m2);
    printf("Enter a mark3:\n");
    scanf("%d",&m3);
    printf("Enter a mark4:\n");
    scanf("%d",&m4);
    printf("Enter a mark5:\n");
    scanf("%d",&m5);
    sum=m1+m2+m3+m4+m5;
    printf("The sum is:%d\n",sum);
    avg=sum/5;
    printf("The average is :%d\n",avg);
    if(avg<50)
    {
        printf("Fail");
    }
    else if (avg>60&&avg<=69)
    {
        printf("D");
    }
    else if (avg>70&&avg<=79)
    {
        printf("C");
    }
    else if(avg>80&&avg<=89)
    {
        printf("B");
    }
    else if(avg>90&&avg<=99)
    {
        printf("A");
    }
    else
    {
        printf("you got a full average");
    }
    getch();
}

