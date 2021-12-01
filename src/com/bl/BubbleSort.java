package com.bl;

public class BubbleSort {
    static int max = 100;

    public static void sortString (String[] array,int n) {
        String temp;
        for(int j=0;j<n-1;j++) {
            for(int i=j+1;i<n;i++) {
                if(array[j].compareTo(array[i])>0)	{
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] a= {"r","e","w"};
        int n=a.length;
        sortString(a,n);
        System.out.println("Strings in sortd order");
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
    }

}


