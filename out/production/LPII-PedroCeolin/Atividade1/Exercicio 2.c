#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{
    int A[10],B[10],C[10],i;

    for (i=0; i<10; i++)
    {
        printf("A[%d] =",i+1);
        scanf("%d",&A[i]);
    }
    for (i=0; i<10; i++)
    {
        printf("B[%d] =",i+1);
        scanf("%d",&B[i]);
    }

    for (i=0; i<10; i++)
    {
        C[i]=A[i]*B[i];
        printf("C[%d] = %d\n", i+1, C[i]);
    }

}
