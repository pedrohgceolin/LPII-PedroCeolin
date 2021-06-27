#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{
    int V[10],N,i,cont=0;
    printf("Escreva os vetores V[10]:");
    for(i=0; i<10; i++)
    {
        printf("\nV[%d] =", i+1);
        scanf("%d",&V[i]);
    }
    printf("Escreva o numero a ser procurado:");
    scanf("%d",&N);
    printf("O numero foi encontado nas posicoes:");
    for(i=0; i<10; i++)
    {
        if(N==V[i])
        {
            printf("%d", i+1);
            cont++;
        }
    }
    if(cont==0)
    {
        printf("\nO numero fornecido nao existe no vetor!");
    }
}
