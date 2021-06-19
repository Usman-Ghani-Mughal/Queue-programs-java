/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueprograms;

import java.util.Scanner;

/**
 *
 * @author Usman Ghani Mughal
 */

class CQueueBA
{
    static int size=5;
    int []arr;
    int front,rear;
    CQueueBA()
    {
       this.front=-1;
       this.rear=-1;
       this.arr=new int[size];
    }
    public void insert(int d)
    {
       if(this.front==0&&this.rear==size-1||this.front==this.rear+1)//queue is full
       {
        System.out.println("***Queue is Full***");   
       } 
       else if(this.front==-1)//list is empty
       {
           this.front++;
           this.rear++;
           this.arr[this.rear]=d;
       }
       else if(front>0&&this.rear==size-1)
       {
           this.rear=0;
           this.arr[this.rear]=d;
       }
       else
       {
           this.rear++;
           this.arr[this.rear]=d;
       }     
    }
    public int del()
    {
        int tmp=0;
        if(this.front==-1)
        {
            System.out.println("***List is Empty***");
            return tmp;
        }
        else if(this.front==this.rear)
        {
            tmp=this.arr[this.rear];
            this.front=this.rear=-1;
            return tmp;
        }
        else
        {
            tmp=this.arr[this.front];
            this.front++;
            return tmp;
        }
    }
    public void display()
    {
        int f_p,r_p;
        f_p=this.front;
        r_p=this.rear;
        if(f_p==-1)
        {
            System.out.println("Queue is EMpty");
        }
        else if(f_p<=r_p)
        {
            System.out.println("yes");
            while(f_p<=r_p)
            {
                System.out.print(this.arr[f_p]+"  ");
                f_p++;
            }
        }
        else
        {
            while(f_p<=size-1)
            {
                System.out.print(this.arr[f_p]+"  ");
                f_p++;
            }
            f_p=0;
            while(f_p<=r_p)
            {
                System.out.print(this.arr[f_p]+"  ");
                f_p++;
            }
        }
    }
}

public class CircularQeueByArray {
    public static void main(String []args)
    {
        CQueueBA obj=new CQueueBA();
        Scanner take_input=new Scanner(System.in);
        int ch,val;
        while(true)
        {
            System.out.println("\nPress 1 for Insert");
            System.out.println("Press 2 for Del");
            System.out.println("Press 3 for display");
            ch=take_input.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the value you want to add :");
                    val=take_input.nextInt();
                    obj.insert(val);
                    break;
                }
                case 2:
                {
                    System.out.println("this come out from Stack : "+obj.del());
                    break;
                }
                case 3:
                {
                    obj.display();
                    break;
                }
                default:
                {
                    System.out.println("You Gave Wrong Input");
                }
            }
        }
    }
}
