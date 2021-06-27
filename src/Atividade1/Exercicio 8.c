#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{
    int V[15],i,j,cont=0;
    printf("Escreva os vetores V[15]:");
    for(i=0; i<15; i++)
    {
        printf("\nV[%d] =", i+1);
        scanf("%d",&V[i]);
    }
    for(j=0; j<14; j++)
    {
    for(i=0; i<14; i++)
    {
        if(V[i]<V[i+1])
        {
            cont=V[i];
            V[i]=V[i+1];
            V[i+1]=cont;
        }
    }
    }
    for(i=0; i<15; i++)
    {
        printf("\nV[%d] = %d", i+1, V[i]);
    }
}
