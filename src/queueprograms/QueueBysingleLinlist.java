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

class NodeQ
{
    int data;
    NodeQ link;
    NodeQ front;
    NodeQ Rear;
    NodeQ()
    {
        this.front=null;
        this.Rear=null;
        this.link=null;
    }
    public void insert(int d)
    {
        NodeQ tmp=new NodeQ();
        tmp.data=d;
        if(this.front==null)
        {
            this.front=tmp;
            this.Rear=tmp;
        }
        else
        {
            this.Rear.link=tmp;
            this.Rear=this.Rear.link;
        }
    }
    public int del()
    {
        int tmp=0;
        if(this.front==null)
        {
            System.out. println("Queue is Empty");
            return tmp;
        }
        else
        {
            tmp=this.front.data;
            this.front=this.front.link;
            return tmp;
        }
    }
    public void display()
    {
        if(this.front==null)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
           NodeQ move=this.front;
           while(move!=null)
           {
             System.out.print(move.data+"  ");
             move=move.link;
           }  
        }
        
    }
}

public class QueueBysingleLinlist {
     public static void main(String []args)
    {
        NodeQ obj=new NodeQ();
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
