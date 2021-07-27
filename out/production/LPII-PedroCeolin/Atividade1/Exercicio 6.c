#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main()
{
    int X[10]= {0,1,2,3,5,8,13,21,34,55}, Y[10]= {1,2,3,5,7,11,13,17,19,23}, P[20],i,j,cont=0;
    printf("Escreva os vetores X[10] e Y[10]:");
    for(i=0; i<10; i++)
    {
        printf("\nX[%d] =", i+1);
        scanf("%d",&X[i]);
    }
    for(i=0; i<10; i++)
    {
        printf("\nY[%d] =", i+1);
        scanf("%d",&Y[i]);
    }

    memcpy( P, X, sizeof(X));
    memcpy( P + 10, Y, sizeof(Y));
    printf("Uniao:\n");
    for(i=0; i<20; i++)
    {
        printf("P[%d] = %d\n", i+1, P[i]);
    }
    for(i=0; i<10; i++)
    {
        P[i]=X[i]-Y[i];
    }
    printf("Diferenca:\n");
    for(i=0; i<10; i++)
    {
        printf("P[%d] = %d\n", i+1, P[i]);
    }
    for(i=0; i<10; i++)
    {
        P[i]=X[i]+Y[i];
    }
    printf("Soma:\n");
    for(i=0; i<10; i++)
    {
        printf("P[%d] = %d\n", i+1, P[i]);
    }
    for(i=0; i<10; i++)
    {
        P[i]=X[i]*Y[i];
    }
    printf("Produto:\n");
    for(i=0; i<10; i++)
    {
        printf("P[%d] = %d\n", i+1, P[i]);
    }
    for(i=0; i<20; i++)
    {
        P[i]=0;
    }
    for(i=0; i<10; i++)
    {
        for(j=0; j<10; j++)
        {
            if(X[i]==Y[j])
            {
                P[cont]=X[i];
                cont++;
            }
        }
    }
    printf("Intersecao:\n");
    for(i=0; i<cont; i++)
    {
        printf("P[%d] = %d\n", i+1, P[i]);
    }
}
