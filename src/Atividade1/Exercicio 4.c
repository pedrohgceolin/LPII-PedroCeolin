#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{
    int A[20],i,x;

    for (i=0; i<20; i++)
    {
        printf("A[%d] =",i+1);
        scanf("%d",&A[i]);
    }
    for (i=0; i<20; i++)
    {
        printf("A[%d] = %d\n",i+1, A[i]);
    }
    for (i=0; i<10; i++)
    {
        x=A[i];
        A[i]=A[19-i];
        A[19-i]=x;
    }
    for (i=0; i<20; i++)
    {
        printf("A[%d] = %d\n",i+1, A[i]);
    }


}
