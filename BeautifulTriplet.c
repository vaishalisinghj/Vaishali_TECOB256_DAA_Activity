
#include<stdio.h>


#include<stdlib.h>


#include<assert.h>


#include<math.h>


int main()


{


    int n,d;


    scanf("%d %d",&n,&d);


    int a[n];


    int c,p=0;


    int i,j,k=0;


    for(i=0;i<n;i++)


    {


        scanf("%d",&a[i]);


    }


    for(i=0;i<n;i++)


    {


        c=0;


        for(j=i,k=j;j<n,k<n;j++,k++)


        {


            if((a[j]-a[i])==d)


            {


            k=j+1;


            c=c+2;


            for(k=j+1;k<n;k++)


            {


                if((a[k]-a[j])==d)


                c=c+1;


            }


            }


        }


        if(c==3)


        p=p+1;


    }


    printf("%d",p);


    return 0;


}
