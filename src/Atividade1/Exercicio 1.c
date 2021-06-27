#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{
    int vetor[20],i;

    for (i=0; i<20; i++)
    {
        printf("Vetor[%d] =",i+1);
        scanf("%d",&vetor[i]);
    }
    for (i=0; i<20; i++)
    {
        if(vetor[i]%2==0)
        {
             printf("Vetor[%d] = %d\n",i+1, vetor[i]);
        }
    }

}
