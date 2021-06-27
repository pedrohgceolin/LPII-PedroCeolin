#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{
    int A[10],i,menor;

    for (i=0; i<10; i++)
    {
        printf("A[%d] =",i+1);
        scanf("%d",&A[i]);
    }
    menor = A[0];
    for (i=0; i<9; i++)
    {
        if(menor>A[i+1])
        {
            menor=A[i+1];
        }

    }
    printf("Menor valor = %d", menor);
}
